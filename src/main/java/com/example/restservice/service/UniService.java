package com.example.restservice.service;

import com.example.restservice.dao.UniDAO;
import com.example.restservice.model.WorldUnisListRest;
import com.example.restservice.restclient.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniService {

    @Autowired
    UniDAO uniDAO;
    @Autowired
    RestClient client;

    /* without Parameter (all countries) */
    public void saveWithOutParam() {
        //client.create("").forEach(u-> uniDAO.save(u) );
    }

    /* with parameter (selected Country) */
    public void saveWithParam(String param) {

        client.create(param).forEach(u -> uniDAO.save(u));
    }

    public static void main(String[] args) {
        UniService uniService = new UniService();
        uniService.saveWithParam("germany");
        //uniService.saveWithOutParam();
    }
}
