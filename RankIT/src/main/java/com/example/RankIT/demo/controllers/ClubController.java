package com.example.RankIT.demo.controllers;


import com.example.RankIT.demo.entities.Club;
import com.example.RankIT.demo.repositories.ClubRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClubController {
    private final ClubRepository clubRepository;

    public ClubController(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @GetMapping("/clubs")
    public List<Club> getClub() {
        return (List<Club>) clubRepository.findAll();

    }
    @PostMapping("/clubs")
    void addClub(@RequestBody Club club) {
        clubRepository.save(club);
    }

    @PutMapping("/clubs")
    void updateClub(@RequestBody Club club) {
        clubRepository.save(club);
    }
    @DeleteMapping("/clubs")
    void deleteClub(@RequestBody Club club) {
        clubRepository.delete(club);
    }
}
