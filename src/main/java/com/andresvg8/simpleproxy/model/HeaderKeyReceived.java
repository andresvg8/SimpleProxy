/**
 * 
 */
package com.andresvg8.simpleproxy.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author ANDRES VILLALBA GAVIRIA
 *
 */
@Entity
public class HeaderKeyReceived {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;;
	
	private String key;
	
	private String value;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private HeaderReceived headerReceived;

	public Long getId() {
		return id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public HeaderReceived getHeaderReceived() {
		return headerReceived;
	}

	public void setHeaderReceived(HeaderReceived headerReceived) {
		this.headerReceived = headerReceived;
	}
}
