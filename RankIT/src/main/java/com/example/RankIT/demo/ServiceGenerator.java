package com.example.RankIT.demo;


import kong.unirest.Unirest;


import java.net.http.HttpResponse;


public class ServiceGenerator {

    HttpResponse<String> response = (HttpResponse<String>) Unirest.get("https://api-football-v1.p.rapidapi.com/leagueTable/530")
            .header("x-rapidapi-key", "506e850f65msh552b6a680360835p13b6f4jsn1341acf70445")
            .header("x-rapidapi-host", "api-football-v1.p.rapidapi.com")
            .asString();

}
