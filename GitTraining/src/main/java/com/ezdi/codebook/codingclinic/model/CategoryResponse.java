package com.ezdi.codebook.codingclinic.model;

import java.util.List;

public class CategoryResponse {

	String book;
	String year;
	String quarter;
	List<String> categories1;
	List<String> categories2;

	public List<String> getCategories1() {
		return categories1;
	}

	public void setCategories1(List<String> categories1) {
		this.categories1 = categories1;
	}

	public List<String> getCategories2() {
		return categories2;
	}

	public void setCategories2(List<String> categories2) {
		this.categories2 = categories2;
	}

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

}
