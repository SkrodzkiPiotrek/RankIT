package com.example.RankIT.demo;

import com.example.RankIT.demo.repositories.ClubRepository;
import kong.unirest.Unirest;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

import java.io.IOException;
import java.net.http.HttpResponse;


@SpringBootApplication
public class RankItApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(RankItApplication.class, args);
    }


    @Autowired
    private ClubRepository clubRepository;


    @Override
    public void run(String... args) throws Exception {
    }

}
