package com.ea.db.mysql.dao;

import com.ea.db.mysql.model.MyUserTC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TCRepository extends JpaRepository<MyUserTC, Long> {
    MyUserTC findByUsername(String username);
}
