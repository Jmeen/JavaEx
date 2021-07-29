package com.javaex.api.collection.hash;

public class ClassRoom {
	// 필드
	private String subject;
	private String roomName;

	public ClassRoom(String subject) {
		this.subject = subject;
	}

	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "Classroom [subject=" + subject + ", roomName=" + roomName + "]";
	}

	@Override
	public int hashCode() {
		return subject.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom) obj;
			return other.hashCode() == this.hashCode();
		}

		return super.equals(obj);
	}

}
