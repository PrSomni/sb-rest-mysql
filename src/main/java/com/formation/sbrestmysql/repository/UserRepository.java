package com.formation.sbrestmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.sbrestmysql.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}