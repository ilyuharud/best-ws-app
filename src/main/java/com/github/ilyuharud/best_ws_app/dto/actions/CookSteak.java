package com.github.ilyuharud.best_ws_app.dto.actions;

import com.github.ilyuharud.best_ws_app.enums.SteakCondition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CookSteak extends CookBaseAction {
    private SteakCondition condition;
}
