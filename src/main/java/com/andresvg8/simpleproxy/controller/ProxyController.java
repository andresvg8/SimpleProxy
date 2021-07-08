/**
 * 
 */
package com.andresvg8.simpleproxy.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andresvg8.simpleproxy.model.HeaderKeyReceived;
import com.andresvg8.simpleproxy.model.HeaderReceived;
import com.andresvg8.simpleproxy.service.HeaderKeyReceivedService;
import com.andresvg8.simpleproxy.service.HeaderReceivedService;

/**
 * @author ANDRES
 *
 */
@RestController
@RequestMapping("/proxy")
public class ProxyController {
	@Autowired
	private HeaderReceivedService headerService;
	
	@Autowired
	private HeaderKeyReceivedService headerKeyService;
	
	@PostMapping("/page1")
	public ResponseEntity<?> createRequestHeaderReceived(@RequestHeader Map<String, String> headerKeys){
		HeaderReceived header = new HeaderReceived();
		header.setDateTime(LocalDateTime.now());
		headerKeys.forEach((key, value) -> {
	        //LOG.info(String.format("Header '%s' = %s", key, value));
			HeaderKeyReceived headerKey = new HeaderKeyReceived();
			headerKey.setKey(key);
			headerKey.setValue(value);
			headerKey.setHeaderReceived(header);
			header.getHeaderKeys().add(headerKey);
			//headerKeyService.save(headerKey);
	    });
		headerService.save(header);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
