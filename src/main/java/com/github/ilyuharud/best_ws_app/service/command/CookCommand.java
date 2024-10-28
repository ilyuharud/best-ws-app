package com.github.ilyuharud.best_ws_app.service.command;

import com.github.ilyuharud.best_ws_app.dto.actions.CookBaseAction;
import com.github.ilyuharud.best_ws_app.dto.result.Result;

public interface CookCommand {
    String getType();
    Result cook(CookBaseAction action);
}
