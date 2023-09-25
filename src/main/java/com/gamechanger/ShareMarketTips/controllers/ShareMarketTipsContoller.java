package com.gamechanger.ShareMarketTips.controllers;

import jakarta.ws.rs.Path;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;


@RestController
@RequestMapping("/share-market")
public class ShareMarketTipsContoller {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(path = "/tips/{id}")
    @ResponseBody
    public String getRecommendations(@PathVariable final int id){

        return restTemplate.getForObject("http://localhost:8083/marketdata/today-nifty/{id}", String.class,id);

    }

}
