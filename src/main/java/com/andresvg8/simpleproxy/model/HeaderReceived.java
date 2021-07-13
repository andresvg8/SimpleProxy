/**
 * 
 */
package com.andresvg8.simpleproxy.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author ANDRES
 *
 */
@Entity
public class HeaderReceived {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private LocalDateTime dateTime;
	
	@JsonIgnore
	@OneToMany(mappedBy="headerReceived", cascade=CascadeType.ALL)
	private List<HeaderKeyReceived> headerKeys=new ArrayList<>();

	public Long getId() {
		return id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public List<HeaderKeyReceived> getHeaderKeys() {
		return headerKeys;
	}

	public void setHeaderKeys(List<HeaderKeyReceived> headerKeys) {
		this.headerKeys = headerKeys;
	}
}
