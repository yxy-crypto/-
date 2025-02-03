package com.beans;

import java.sql.Timestamp;

public class Words {
	
	private String word;
	private String explanation;
	private String detail;
	private int id;
	private String incapable;
	private String belong;
	private Timestamp create_Time;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBelong() {
		return belong;
	}
	public void setBelong(String belong) {
		this.belong = belong;
	}
	
	public String getIncapable() {
		return incapable;
	}
	public void setIncapable(String incapable) {
		this.incapable = incapable;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	public Timestamp getCreate_Time() {
		return create_Time;
	}
	public void setCreate_Time(Timestamp create_Time) {
		this.create_Time = create_Time;
	}
	

}
