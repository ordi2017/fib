package org.fib.entity.Messenger;

import java.util.List;

public class Entry {

	private String id;
	private int time;
	private List<Messaging> messaging;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public List<Messaging> getMessaging() {
		return messaging;
	}
	public void setMessaging(List<Messaging> messaging) {
		this.messaging = messaging;
	}
	
}
