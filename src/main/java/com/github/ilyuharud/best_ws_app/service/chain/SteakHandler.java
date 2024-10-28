package com.github.ilyuharud.best_ws_app.service.chain;

import com.github.ilyuharud.best_ws_app.dto.actions.CookSteak;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import lombok.Setter;

@Setter
public abstract class SteakHandler {
    protected SteakHandler nextHandler;
    public abstract Result cook(CookSteak steak);
}
