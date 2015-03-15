package com.jmandrillapi.model;

public class MergeVar {

	private String name, content;

	public MergeVar() {
	}

	public MergeVar(String name, String content) {
		this.name = name;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
