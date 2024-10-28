package com.github.ilyuharud.best_ws_app.service.command.impl;

import com.github.ilyuharud.best_ws_app.dto.actions.ActionType;
import com.github.ilyuharud.best_ws_app.dto.actions.CookBaseAction;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import com.github.ilyuharud.best_ws_app.service.command.CookCommand;
import com.github.ilyuharud.best_ws_app.service.observer.CezarObservable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CezarCommand implements CookCommand {

    private final CezarObservable observable;

    @Override
    public String getType() {
        return ActionType.CEZAR;
    }

    @Override
    public Result cook(CookBaseAction action) {
        log.info("Начали готовить цезарь");
        return observable.notify(action);
    }
}
