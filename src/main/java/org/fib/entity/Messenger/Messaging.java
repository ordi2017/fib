package org.fib.entity.Messenger;

public class Messaging {

	private Sender sender;
	private Recipent recipent;
	private int timestamp;
	private Message message;
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public Recipent getRecipent() {
		return recipent;
	}
	public void setRecipent(Recipent recipent) {
		this.recipent = recipent;
	}
	public int getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
}
