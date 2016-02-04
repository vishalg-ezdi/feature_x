package com.ezdi.codebook.codingclinic.model;

import java.util.Map;

public class QuestionAnswerResponse {

	private String book;
	private String year;
	private String quarter;
	private String category1;
	private String category2;

	private Map<String, String> content;

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public Map<String, String> getContent() {
		return content;
	}

	public String getCategory2() {
		return category2;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	public String getCategory1() {
		return category1;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	public void setContent(Map<String, String> content) {
		this.content = content;
	}

}
