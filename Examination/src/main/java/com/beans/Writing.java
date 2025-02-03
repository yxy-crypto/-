package com.beans;

import java.sql.Timestamp;

public class Writing {
	private String form;
	private String content;
	private String translation;
	private int id;
	private String register;
	private String domain;
	private Timestamp create_Time;
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Timestamp getCreate_Time() {
		return create_Time;
	}
	public void setCreate_Time(Timestamp create_Time) {
		this.create_Time = create_Time;
	}
}
