package com.example.usersapi.repositories;

import com.example.usersapi.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserRepository extends CrudRepository<Users, Long> {

}