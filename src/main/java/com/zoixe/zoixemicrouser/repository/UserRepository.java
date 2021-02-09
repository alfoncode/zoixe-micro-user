package com.zoixe.zoixemicrouser.repository;

import com.zoixe.zoixemicrouser.model.User;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    public User findByUsername(@Param("username") String username);
           
}
