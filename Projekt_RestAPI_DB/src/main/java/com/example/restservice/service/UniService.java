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
    public void save(){

        client.create("").forEach(u-> uniDAO.save(u) );
        // client.to.. not there bewforere
    }

    public void save(String param){

        client.create(param).forEach(u-> uniDAO.save(u) );
        // client.to.. not there bewforere
    }

    public static void main(String[] args) {
        UniService  uniService = new UniService();
        uniService.save("");
    }
}
