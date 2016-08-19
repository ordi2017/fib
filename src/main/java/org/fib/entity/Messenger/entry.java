package org.fib.entity.Messenger;

import java.util.List;

public class entry {

	private String id;
	private int time;
	private List<messaging> messaging;
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
	public List<messaging> getMessaging() {
		return messaging;
	}
	public void setMessaging(List<messaging> messaging) {
		this.messaging = messaging;
	}
	
}
