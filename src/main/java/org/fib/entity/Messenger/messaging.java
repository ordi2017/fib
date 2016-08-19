package org.fib.entity.Messenger;

public class messaging {

	private sender sender;
	private recipent recipent;
	private long timestamp;
	private message message;
	public sender getSender() {
		return sender;
	}
	public void setSender(sender sender) {
		this.sender = sender;
	}
	public recipent getRecipent() {
		return recipent;
	}
	public void setRecipent(recipent recipent) {
		this.recipent = recipent;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public message getMessage() {
		return message;
	}
	public void setMessage(message message) {
		this.message = message;
	}
}
