package com.neueda.urlshortner;

public class Url {
	
	private String shortUrl;
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
