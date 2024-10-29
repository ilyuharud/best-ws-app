package com.github.ilyuharud.best_ws_app.service.chain.impl;

import com.github.ilyuharud.best_ws_app.dto.actions.CookSteak;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import com.github.ilyuharud.best_ws_app.enums.SteakCondition;
import com.github.ilyuharud.best_ws_app.service.chain.SteakHandler;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(2)
public class MediumSteakHandler extends SteakHandler {

    protected MediumSteakHandler() {
        super(SteakCondition.MEDIUM);
    }

    @Override
    public Result cook(CookSteak steak) {
        return new Result("Ваш идеальный стейк готов");
    }
}
