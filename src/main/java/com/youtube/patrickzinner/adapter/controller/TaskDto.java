package com.youtube.patrickzinner.adapter.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

public record TaskDto(
        @JsonProperty(value = "id", access = READ_ONLY)
        UUID id,
        @JsonProperty("name")
        String name
) {
}
