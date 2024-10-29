package com.github.ilyuharud.best_ws_app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public enum SteakCondition {
    @JsonProperty("Rare")
    RARE("рейр"),
    @JsonProperty("Medium")
    MEDIUM("медиум"),
    @JsonProperty("WellDone")
    WELL_DONE("подошву");

    private final String translate;

    SteakCondition(String translate) {
        this.translate = translate;
    }
}
