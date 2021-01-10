package com.example.RankIT.demo;

import com.example.RankIT.demo.entities.Club;
import com.example.RankIT.ClubRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class RankItApplication {

	public static void main(String[] args) {
		SpringApplication.run(RankItApplication.class, args);
	}


	@Bean
	CommandLineRunner init(ClubRepository clubRepository) {
		return args -> {
			Stream.of("FC Barcelona", "FC Liverpool", "Real Madryt").forEach(name -> {
				Club club = new Club(1,"FC Liverpool", "ENG", 1200);
				clubRepository.save(club);
			});
			clubRepository.findAll().forEach(System.out::println);
		};
	}
}
