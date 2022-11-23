
package com.example.restservice.model;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

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
@Entity  // to save in DB - Used Entity

public class WorldUnisListRest  { // implements Serializable

    @Transient  // if we use - dont take id in JSON data
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @JsonProperty("country")
    @Column
    private String country;

    @JsonProperty("domains")
    @Column
    private List<String> domains = null;


    @JsonProperty("web_pages")
    @Column
    private List<String> webPages = null;

    @JsonProperty("alpha_two_code")
    @Column
    private String alphaTwoCode;

    @JsonProperty("name")
    @Column
    private String name;

    @JsonProperty("state-province")
    @Column
    private Object stateProvince;



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

    @JsonProperty("state-province")
    public Object getStateProvince() {
        return stateProvince;
    }

    @JsonProperty("state-province")
    public void setStateProvince(Object stateProvince) {
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
