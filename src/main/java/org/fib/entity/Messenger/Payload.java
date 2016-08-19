package org.fib.entity.Messenger;

import java.util.List;

public class Payload {

	private String object;
	private List<entry> entry;
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public List<entry> getEntry() {
		return entry;
	}
	public void setEntry(List<entry> entry) {
		this.entry = entry;
	}
}
