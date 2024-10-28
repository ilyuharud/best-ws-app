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
@Order(2)
public class MediumSteakHandler extends SteakHandler {
    @Override
    public Result cook(CookSteak steak) {
        log.info("Начали готовить медиум");
        if (steak.getCondition() == SteakCondition.MEDIUM)
            return new Result("Ваш идеальный стейк готов");
        return nextHandler.cook(steak);
    }
}
