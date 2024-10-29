package com.github.ilyuharud.best_ws_app.service.chain.impl;

import com.github.ilyuharud.best_ws_app.dto.actions.CookSteak;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import com.github.ilyuharud.best_ws_app.enums.SteakCondition;
import com.github.ilyuharud.best_ws_app.service.chain.SteakHandler;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(3)
public class WellDoneSteakHandler extends SteakHandler {

    protected WellDoneSteakHandler() {
        super(SteakCondition.WELL_DONE);
    }

    @Override
    public Result cook(CookSteak steak) {
        return new Result("Ваша подошва готова");
    }
}
