package com.neueda.urlshortner.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="url")
public class Url {
	
	
	@Id
	@Column(name = "shortUrl")
	private String shortUrl;
	@Column(name = "longUrl")
	private String longUrl;
	
	
	public Url(String shortUrl, String longUrl) {
		super();
		this.shortUrl = shortUrl;
		this.longUrl = longUrl;
	}
	
	public Url() {
		super();
	}
	
	public String getShortUrl() {
		return shortUrl;
	}
	
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	
	public String getLongUrl() {
		return longUrl;
	}
	
	public void setLongUrl(String longUrl) {
		this.longUrl = longUrl;
	}

	@Override
	public String toString() {
		return "Url [shortUrl=" + shortUrl + ", longUrl=" + longUrl + "]";
	}
	
	
	
}
