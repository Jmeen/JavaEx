package com.javaex.nosql;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

public class MongodbTest {
	static String MONGODBIP = "127.0.0.1";
	static int MONGODBPORT = 27017;
	static String DBNAME = "javamongo";
	static String COLL_NAME = "testCOllection";

	public static void main(String[] args) {
//		connect();
//		testInsert();
//		getCollection(DBNAME,COLL_NAME);
//		testInsertMany();
//		testFindOne();
//		testFindAll();
//		testFindFilter();
//		testupdateOne();
//		testUpdateMany();
		testDeleteAll();
	}
	
	// 삭제
	private static void testDeleteAll() {
		MongoCollection<Document> collection = getCollection(DBNAME, COLL_NAME);
		DeleteResult res = collection.deleteMany(new Document());
		System.out.println(res.getDeletedCount()+"개 삭제");
	}

	// 여러 문서 업데이트
	private static void testUpdateMany() {
		MongoCollection<Document> collection = getCollection(DBNAME, COLL_NAME);
		// 업데이트 조건
		Bson bsfilter = Filters.eq("종족", "인간");
		// 갱신 내역
		Bson doc = new Document("$set", new Document("method", "updateMany").append("updatedate", new Date()));

		UpdateResult res = collection.updateMany(bsfilter, doc);
		System.out.println(res.getModifiedCount()+"개 업데이트");

	}

	// 업데이트
	private static void testupdateOne() {
		MongoCollection<Document> collection = getCollection(DBNAME, COLL_NAME);
		// 업데이트 조건
		Bson bsfilter = Filters.eq("종족", "인간");
		// 갱신 내역
		Bson doc = new Document("$set", new Document("method", "updateone"));

		UpdateResult res = collection.updateOne(bsfilter, doc);

		System.out.println(res.getModifiedCount() + "완료");

	}

	// 조건 검색
	private static void testFindFilter() {
		MongoCollection<Document> collection = getCollection(DBNAME, COLL_NAME);
		// 필터생성
//		Bson bsonFilter = Filters.eq("종족", "인간");
		// 복합조건
		// 종족 : 인간 이거나 성별 : 여자
		Bson bsonFilter = Filters.or(Filters.eq("종족", "인간"), Filters.eq("gender", "female"));

		MongoCursor<Document> cursor = collection.find(bsonFilter).iterator();
		while (cursor.hasNext()) { // 뒤에 남은 record가 있으면
			// 커서 뒤로 이동
			Document doc = cursor.next();
			System.out.printf("%s,%s,%s,%s%n", doc.get("_id"), doc.get("name"), doc.get("종족"), doc.get("gender"));
			System.out.println("JSON:" + doc.toJson());
		}
		cursor.close();

	}

	private static void testFindAll() {
		MongoCollection<Document> collection = getCollection(DBNAME, COLL_NAME);
		// find 메서드는 Cursor 반환
		MongoCursor<Document> cursor = collection.find().iterator();

		// 루프
		while (cursor.hasNext()) { // 뒤에 남은 record가 있으면
			// 커서 뒤로 이동
			Document doc = cursor.next();
			System.out.printf("%s,%s,%s,%s%n", doc.get("_id"), doc.get("name"), doc.get("종족"), doc.get("gender"));
			System.out.println("JSON:" + doc.toJson());
		}
		cursor.close();
	}

	// 1개 문서 find -> findOne
	private static void testFindOne() {
		MongoCollection<Document> collection = getCollection(DBNAME, COLL_NAME);
		// fild() -> cursor가 반환
		Document doc = collection.find().first();
		// document 출력
		System.out.println("DOC" + doc);
		// 필드확인 get("필드명")
		System.out.printf("%s,%s,%s,%s%n", doc.get("_id"), doc.get("name"), doc.get("종족"), doc.get("gender"));

	}

	private static void testInsertMany() {
		// 여러 document Insert
		// insertMany(배열)
		List<Document> docs = new ArrayList<>();
		// 문서 생성 -> List
		Document doc = new Document("name", "고길동").append("종족", "인간").append("gender", "male");

		docs.add(doc);
		doc = new Document("이름", "도우너").append("종족", "외계인").append("gender", "male");
		docs.add(doc);
		doc = new Document("이름", "또치").append("종족", "조류").append("gender", "female");
		docs.add(doc);
		doc = new Document("이름", "마이콜").append("종족", "인간").append("gender", "male");
		docs.add(doc);

		System.out.println("삽입할 문서들 : " + docs);

		// 여러 문서 인서트

		MongoClient client = connect();
		MongoDatabase db = client.getDatabase(DBNAME);
		MongoCollection<Document> collection = getCollection(DBNAME, COLL_NAME);
		collection.insertMany(docs);

	}

	// 컬렉션 얻어오기
	private static MongoCollection<Document> getCollection(String dbname, String Collname) {
		MongoClient client = connect();
		// 데이터 베이스 선택
		MongoDatabase db = client.getDatabase(dbname);
		// 컬렉션 선택
		MongoCollection<Document> collection = db.getCollection(Collname);

		System.out.println("database: " + db);
		System.out.println("collection:" + collection);

		return collection;
	}

	private static void testInsert() {
		// JSON(BSON)
		// Java는 json을 다루지 못한다.
		Document doc = new Document("name", "둘리").append("gender", "male").append("종족", "공룡");
		System.out.println("문서:" + doc);
		System.out.println("JSON:" + doc.toJson());

		MongoCollection<Document> collection = getCollection(DBNAME, COLL_NAME);
		// 1개 문서 insert
		collection.insertOne(doc);
	}

	private static MongoClient connect() {
//			mongodb 접속
		MongoClient client = MongoClients.create();
//		MongoClient client = MongoClients.create(
//				// 접속정보가 기본 정보가 아닐때
//				MongoClientSettings.builder()
//					.applyToClusterSettings(builder->
//						builder.hosts(
//								Arrays.asList(
//										new ServerAddress(MONGODBIP,MONGODBPORT)
//								)
//						)
//					)
//				);

		System.out.println(client);
		return client;
	}

}
