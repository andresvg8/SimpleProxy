/**
 * 
 */
package com.andresvg8.simpleproxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andresvg8.simpleproxy.model.HeaderKeyReceived;

/**
 * @author ANDRES
 *
 */
@Repository
public interface HeaderKeyReceivedRepository extends JpaRepository<HeaderKeyReceived, Long> {

}
