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

import com.andresvg8.simpleproxy.model.HeaderReceived;
import com.andresvg8.simpleproxy.repository.HeaderReceivedRepository;

/**
 * @author ANDRES
 *
 */
@Service
public class HeaderReceivedService {
	@Autowired
	private HeaderReceivedRepository repo;

	@Transactional(readOnly=true)
	public Iterable<HeaderReceived> findAll() {
		return repo.findAll();
	}

	@Transactional(readOnly=true)
	public Page<HeaderReceived> findAll(Pageable pageable) {
		return repo.findAll(pageable);
	}

	@Transactional(readOnly=true)
	public Optional<HeaderReceived> findById(Long id) {
		return repo.findById(id);
	}

	@Transactional
	public HeaderReceived save(HeaderReceived requestHeaderReceived) {
		return repo.save(requestHeaderReceived);
	}

	@Transactional
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
}
