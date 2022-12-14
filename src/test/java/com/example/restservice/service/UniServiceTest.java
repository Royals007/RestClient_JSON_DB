package com.example.restservice.service;

import com.example.restservice.model.WorldUnisListRest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UniServiceTest {

    @Autowired
    private UniService service;

    @BeforeEach
    void setUp() {
    }

    @Test
    void saveWithParam() {
        service.saveWithParam("germany"); // with specific country call und db Speichern
    }

    @Test
    void saveWithOutParam() {
        //service.saveWithOutParam();
    }

    @Test
    void testSaveWithParam() {
    }
}
