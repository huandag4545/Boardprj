package com.jdproject.boardprj.board.dto;

public class BoardDto {

	private int bno;
	private String title;
	private String content;
	private String writer_date;
	private String id;
	private int hit;
	
	public BoardDto() {
		
	}

	public BoardDto(int bno, String title, String content, String writer_date, String id) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer_date = writer_date;
		this.id = id;
	}

	public BoardDto(int bno, String title, String content, String writer_date, String id, int hit) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer_date = writer_date;
		this.id = id;
		this.hit = hit;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter_date() {
		return writer_date;
	}

	public void setWriter_date(String writer_date) {
		this.writer_date = writer_date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", title=" + title + ", content=" + content + ", writer_date=" + writer_date
				+ ", id=" + id + ", hit=" + hit + "]";
	}
	
	
	
	
}
