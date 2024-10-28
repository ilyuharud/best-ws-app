package com.github.ilyuharud.best_ws_app.service.chain;

import com.github.ilyuharud.best_ws_app.dto.actions.CookSteak;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import com.github.ilyuharud.best_ws_app.enums.SteakCondition;
import lombok.Setter;

@Setter
public abstract class SteakHandler {
    protected SteakHandler nextHandler;

    private final SteakCondition steakCondition;

    protected SteakHandler(SteakCondition steakCondition) {
        this.steakCondition = steakCondition;
    }

    public Result cookSteak(CookSteak steak) {
        if (steak.getCondition() == steakCondition) {
            return cook(steak);
        } else return nextHandler.cookSteak(steak);
    }
    public abstract Result cook(CookSteak steak);
}
