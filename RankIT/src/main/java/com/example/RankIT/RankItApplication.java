package com.example.RankIT;

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
	CommandLineRunner init(ClubRepository userRepository) {
		return args -> {
			Stream.of("FC Barcelona", "FC Liverpool", "Real Madryt").forEach(name -> {
				Club club = new Club(1,"FC");
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}
}
