package com.tesobe.obp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Bank {
    private String id;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("logo_URL")
    private String logoUrl;
    private String website;
}