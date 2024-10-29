package com.github.ilyuharud.best_ws_app.service.chain;

import com.github.ilyuharud.best_ws_app.dto.actions.CookSteak;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import com.github.ilyuharud.best_ws_app.enums.SteakCondition;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
public abstract class SteakHandler {
    protected SteakHandler nextHandler;

    private final SteakCondition steakCondition;

    protected SteakHandler(SteakCondition steakCondition) {
        this.steakCondition = steakCondition;
    }

    public Result cookSteak(CookSteak steak) {
        log.info("Начали готовить {}", steakCondition.getTranslate());
        if (steak.getCondition().ordinal() <= steakCondition.ordinal()) {
            return cook(steak);
        } else return nextHandler.cookSteak(steak);
    }
    public abstract Result cook(CookSteak steak);
}
