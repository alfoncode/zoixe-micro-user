package com.zoixe.zoixemicrouser.repository;

import com.zoixe.zoixemicrouser.model.Session;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SessionRepository extends PagingAndSortingRepository<Session, Long>{
    
}
