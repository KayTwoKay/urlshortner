package com.neueda.urlshortner.resource;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neueda.urlshortner.model.Url;
import com.neueda.urlshortner.repository.UrlRepository;

@RestController
public class ShortenUrlRestController {
	
	 @Autowired
	 UrlRepository urlRepository;
	
	
	
	 // create short url
	 @RequestMapping(value="/shortenurl", method=RequestMethod.POST)
	public ResponseEntity<Object> getShortenUrl(@RequestBody Url shortenUrl) throws MalformedURLException {
		
		String randomChar = getRandomChars();
		shortenUrl.setShortUrl("http://localhost:8080/s/"+randomChar);
		
		// save the url in peristent storage
		urlRepository.save(shortenUrl);
		
		//return url object and an okay status to the client
		return new ResponseEntity<Object>(shortenUrl, HttpStatus.OK);
	}
	
	
	
	// gets the url object with the id
	@RequestMapping(value="/s/{id}", method=RequestMethod.GET)
	public void getFullUrl(HttpServletResponse response, @PathVariable("id") String id) throws IOException {
		
		//get the url object associated the shortUrl id
		Url result = urlRepository.getOne("http://localhost:8080/s/"+id);
		
		//redirect the client to the longUrl 
		response.sendRedirect(result.getLongUrl());
	}
		

	
	// Generate 5 digit unique identifier
	private String getRandomChars() {
		String randomStr = "";
		String possibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		for (int i = 0; i < 5; i++)
			randomStr += possibleChars.charAt((int) Math.floor(Math.random() * possibleChars.length()));
		return randomStr;
	}

}
