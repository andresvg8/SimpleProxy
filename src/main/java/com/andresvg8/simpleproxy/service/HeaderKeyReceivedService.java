/**
 * 
 */
package com.andresvg8.simpleproxy.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andresvg8.simpleproxy.model.HeaderKeyReceived;
import com.andresvg8.simpleproxy.model.HeaderReceived;
import com.andresvg8.simpleproxy.repository.HeaderKeyReceivedRepository;

/**
 * @author ANDRES
 *
 */
@Service
public class HeaderKeyReceivedService {
	@Autowired
	private HeaderKeyReceivedRepository repo;

	@Transactional(readOnly=true)
	public Iterable<HeaderKeyReceived> findAll() {
		return repo.findAll();
	}

	@Transactional(readOnly=true)
	public Page<HeaderKeyReceived> findAll(Pageable pageable) {
		return repo.findAll(pageable);
	}

	@Transactional(readOnly=true)
	public Optional<HeaderKeyReceived> findById(Long id) {
		return repo.findById(id);
	}

	@Transactional
	public HeaderKeyReceived save(HeaderKeyReceived headerKeyReceived) {
		return repo.save(headerKeyReceived);
	}

	@Transactional
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
}
