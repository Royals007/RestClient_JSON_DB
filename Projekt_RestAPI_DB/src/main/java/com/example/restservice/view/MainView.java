package com.example.restservice.view;

import com.example.restservice.model.WorldUnisListRest;
import com.example.restservice.restclient.RestClient;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Route("/")
public class MainView extends VerticalLayout {

    private WorldUnisListRest worldUnisListRest;
    @Autowired
    private RestClient client;

    @PostConstruct
    public void init(){
        add(new H3("Uni's selected List"));
        //worldUnisListRest.
    }

}
