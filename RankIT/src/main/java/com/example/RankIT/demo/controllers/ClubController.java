package com.example.RankIT.demo.controllers;


import com.example.RankIT.demo.entities.Club;
import com.example.RankIT.demo.repositories.ClubRepository;
import com.example.RankIT.demo.service.ServiceGenerator;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClubController {
    private final ClubRepository clubRepository;
    private ServiceGenerator serviceGenerator;

    public ClubController(ClubRepository clubRepository, ServiceGenerator serviceGenerator) {
        this.clubRepository = clubRepository;
        this.serviceGenerator = serviceGenerator;
    }

    @GetMapping("/clubs")
    public List<Club> getClub() {
        return (List<Club>) clubRepository.findAll(Sort.by("points").descending());

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

    @GetMapping("/getData")
    public String getData() {
        return serviceGenerator.getData();
    }

}
