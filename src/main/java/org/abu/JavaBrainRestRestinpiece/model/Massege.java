package org.abu.JavaBrainRestRestinpiece.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement     	// for enabling xml output
public class Massege {
	private long id;
	private String message;
	private Date created;
	private String Author;
	
	public Massege() {
		
	}
	
	public Massege(long id, String message, Date created, String author) {
		super();
		this.id = id;
		this.message = message;
		this.created = created;
		Author = author;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	

}
