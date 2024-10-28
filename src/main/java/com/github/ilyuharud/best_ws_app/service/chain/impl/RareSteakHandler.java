package com.github.ilyuharud.best_ws_app.service.chain.impl;

import com.github.ilyuharud.best_ws_app.dto.actions.CookSteak;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import com.github.ilyuharud.best_ws_app.enums.SteakCondition;
import com.github.ilyuharud.best_ws_app.service.chain.SteakHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Order(1)
public class RareSteakHandler extends SteakHandler {

    @Override
    public Result cook(CookSteak steak) {
        log.info("Начали готовить рейр");
        if (steak.getCondition() == SteakCondition.RARE)
            return new Result("Ваш стейк с кровью готов");
        else return nextHandler.cook(steak);
    }
}
