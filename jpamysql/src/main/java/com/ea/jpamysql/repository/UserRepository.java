package com.ea.jpamysql.repository;

import com.ea.jpamysql.model.Myuser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Myuser, Integer> {
    Optional<Myuser> findByUsername(String username);
}
