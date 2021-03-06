package com.store.retail.springmvc.domain;

public class Message {

	String name;
	String text;
	
	/**
	 * @param name
	 * @param text
	 */
	public Message(String name, String text) {
		this.name = name;
		this.text = text;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
