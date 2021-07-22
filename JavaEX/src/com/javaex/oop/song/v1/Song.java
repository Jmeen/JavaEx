package com.javaex.oop.song.v1;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song() {

	}

	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title, artist);
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}

	public void showInfo() {
		String info = String.format("%s,%s(%s,%d,%d번 트랙,%s 작곡)", this.artist, this.title, this.album, this.year,
				this.track, this.composer);
		System.out.println(info);
	}

}
