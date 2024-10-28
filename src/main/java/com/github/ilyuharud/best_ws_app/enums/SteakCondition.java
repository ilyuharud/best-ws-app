package com.github.ilyuharud.best_ws_app.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SteakCondition {
    @JsonProperty("Rare")
    RARE,
    @JsonProperty("Medium")
    MEDIUM,
    @JsonProperty("WellDone")
    WELL_DONE
}
