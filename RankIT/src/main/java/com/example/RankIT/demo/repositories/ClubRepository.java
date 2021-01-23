package com.example.RankIT.demo.repositories;

import com.example.RankIT.demo.entities.Club;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends CrudRepository<Club, Long> {

  Object findAll(Sort points);
}
