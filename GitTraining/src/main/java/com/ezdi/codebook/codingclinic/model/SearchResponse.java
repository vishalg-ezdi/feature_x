package com.ezdi.codebook.codingclinic.model;

public class SearchResponse {

	private String book;
	private String searchType;
	private String year;
	private String quarter;
	private String category_two;
	private String question;
	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
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

	public String getCategory_two() {
		return category_two;
	}

	public void setCategory_two(String category_two) {
		this.category_two = category_two;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "SearchResponse [book=" + book + ", searchType=" + searchType
				+ ", year=" + year + ", quarter=" + quarter + ", category_two="
				+ category_two + ", question=" + question + ", answer="
				+ answer + "]";
	}

}
