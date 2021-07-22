package com.javaex.oop.song.v1;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song1 = new Song("좋은날","아이유","Real","이민수",2010,3);
		song1.showInfo();
		
		Song song2 = new Song();
		song2.setTitle("거짓말");
		song2.setArtist("BIGBANG");
		song2.setAlbum("Always");
		song2.setComposer("G-Dragon");
		song2.setYear(2007);
		song2.setTrack(2);
		song2.showInfo();
		
		Song song3 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
		song3.showInfo();
		

	}

}
