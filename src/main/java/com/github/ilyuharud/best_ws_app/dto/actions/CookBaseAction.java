package com.github.ilyuharud.best_ws_app.dto.actions;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CookSteak.class, name = ActionType.STEAK),
        @JsonSubTypes.Type(value = CookCezar.class, name = ActionType.CEZAR),
        @JsonSubTypes.Type(value = CookBurger.class, name = ActionType.BURGER)
})
public class CookBaseAction {
    private String type;
}
