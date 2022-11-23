package com.example.restservice.dao;


import com.example.restservice.model.WorldUnisListRest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniDAO extends JpaRepository<WorldUnisListRest,Long> {


}
