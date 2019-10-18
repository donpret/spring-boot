package org.oneighbor.bootstrap.model;

public class Message {

	/**
	 * 
	 */
	public Message(final String aGreetingMessage) {
		this.setGreetings(aGreetingMessage);
	}
	
	/**
	 * @return the greetings
	 */
	public String getGreetings() {
		return greetings;
	}

	/**
	 * @param greetings the greetings to set
	 */
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	private String greetings;
	

}
