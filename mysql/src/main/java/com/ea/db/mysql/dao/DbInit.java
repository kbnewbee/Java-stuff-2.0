package com.ea.db.mysql.dao;

import com.ea.db.mysql.model.MyUserTC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class DbInit implements CommandLineRunner {

    private TCRepository tcRepository;

    public DbInit(TCRepository tcRepository) {
        this.tcRepository = tcRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        MyUserTC kb = new MyUserTC("kaybee","password");
        MyUserTC udit = new MyUserTC("udit","password");

        this.tcRepository.save(kb);
        this.tcRepository.save(udit);
    }
}
