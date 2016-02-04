package com.ezdi.codebook.codingclinic.model;

import java.util.Set;

public class QuarterResponse {

	Set<String> quarters;
	String year;
	String book;

	public Set<String> getQuarterSet() {
		return quarters;
	}

	public void setQuarterSet(Set<String> quarters) {
		this.quarters = quarters;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

}
