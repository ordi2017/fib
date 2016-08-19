package org.fib.entity.Messenger;

import java.util.List;

public class message {

	private String mid;
	private int seq;
	private String text;
	private List<attachment> attachment;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<attachment> getAttachment() {
		return attachment;
	}
	public void setAttachment(List<attachment> attachment) {
		this.attachment = attachment;
	}
	
	
}
