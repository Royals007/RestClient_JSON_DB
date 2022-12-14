package com.example.restservice.model;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "domains",
        "web_pages",
        "alpha_two_code",
        "name",
        "state-province"
})

@Generated("jsonschema2pojo")
@Entity  // to save in DB
public class WorldUnisListRest {


    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mysql :Identity
    @Column(name = "id", nullable = false)
    private Long id;


    @JsonProperty("country")
    @Column
    private String country;

    @Transient  // if we use - dont take id in JSON data
    @JsonProperty("domains")
    @Column
    private List<String> domains = null;

    @Transient  // if we use - dont take id in JSON data
    @JsonProperty("web_pages")
    @Column
    private List<String> webPages = null;

    @JsonProperty("alpha_two_code")
    @Column
    private String alphaTwoCode;

    @JsonProperty("name")
    @Column
    private String name;

    @JsonIgnore
    @JsonProperty("state-province")
    @Column
    private String stateProvince;


    // Getters and Setters
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("domains")
    public List<String> getDomains() {
        return domains;
    }

    @JsonProperty("domains")
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @JsonProperty("web_pages")
    public List<String> getWebPages() {
        return webPages;
    }

    @JsonProperty("web_pages")
    public void setWebPages(List<String> webPages) {
        this.webPages = webPages;
    }

    @JsonProperty("alpha_two_code")
    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    @JsonProperty("alpha_two_code")
    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WorldUnisListRest{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", domains=" + domains +
                ", webPages=" + webPages +
                ", alphaTwoCode='" + alphaTwoCode + '\'' +
                ", name='" + name + '\'' +
                ", stateProvince=" + stateProvince +
                '}';
    }
}
