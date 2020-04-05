package com.neueda.urlshortner.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.neueda.urlshortner.model.Url;


public interface UrlRepository extends JpaRepository<Url, String> {
	

}
	