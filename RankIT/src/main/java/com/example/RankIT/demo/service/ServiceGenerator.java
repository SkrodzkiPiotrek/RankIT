package com.example.RankIT.demo.service;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceGenerator {

    public String getData() {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-rapidapi-key", "506e850f65msh552b6a680360835p13b6f4jsn1341acf70445");
        headers.add("x-rapidapi-host", "api-football-v1.p.rapidapi.com");

        HttpEntity httpEntity = new HttpEntity(headers);

        String response =
                restTemplate.exchange("https://api-football-v1.p.rapidapi.com/leagueTable/530", HttpMethod.GET, httpEntity, String.class).toString();

        return response;
    }



}
