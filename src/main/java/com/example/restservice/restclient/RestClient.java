package com.example.restservice.restclient;

import com.example.restservice.model.WorldUnisListRest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Daten holen:RestTemnplate
 */
@Service
public class RestClient {

    private RestTemplate template = new RestTemplate();
    private final String countryURL = "http://universities.hipolabs.com/search?country="; //"http://universities.hipolabs.com/search?name=middle&country="; //

    public List<WorldUnisListRest> create(String country) {
        ResponseEntity<WorldUnisListRest[]> responseEntity = template.getForEntity(countryURL + country, WorldUnisListRest[].class);
        //System.out.println(responseEntity);

        return Arrays.asList(responseEntity.getBody());
    }

    /* get all countries info */
    public List<String> createCountries() {
        List<String> list = new ArrayList<>();
        RestClient unisListRest = new RestClient();
        var li = unisListRest.create("");
        for (WorldUnisListRest wl : li) {
            list.add(wl.getCountry());
        }
        return list;
    }

    /* get selected country data */
    public static void main(String[] args) throws JsonProcessingException {
        RestClient unisListRest = new RestClient();
        var list = unisListRest.create("germany");
        //System.out.println(unisListRest.create("germany"));

        for (WorldUnisListRest element : list) {
            System.out.println(element.getName());
        }
        //Stream.of(list).limit(3).forEach(System.out::println);

        /* Json - pretty print */
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
        System.out.println(json);
    }
}
