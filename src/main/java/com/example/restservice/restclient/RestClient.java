package com.example.restservice.restclient;

import com.example.restservice.model.WorldUnisListRest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/*
Daten holen:RestTemnplate
 */
@Service
public class RestClient {

    private RestTemplate template = new RestTemplate();
    private final String countryURL = "http://universities.hipolabs.com/search?country="; //"http://universities.hipolabs.com/search?name=middle&country="; //

    //public List<WorldUnisListRest> create(String country) {
    public List<WorldUnisListRest> create(String country) {
        ResponseEntity<WorldUnisListRest[]> responseEntity = template.getForEntity(countryURL+country, WorldUnisListRest[].class);
       // String responseEntity1 = template.getForObject(countryURL+country, String.class);
        //System.out.println(responseEntity1);
        System.out.println(responseEntity);

        return Arrays.asList(responseEntity.getBody());

    }

    public static void main(String[] args) {
        RestClient unisListRest = new RestClient();
        var list = unisListRest.create("germany");
//        for (WorldUnisListRest element : list)
//        {
//            System.out.println(element.getName());
//        }
        System.out.println(unisListRest.create("germany"));
    }
}
