package com.github.ilyuharud.best_ws_app.service.command.impl;

import com.github.ilyuharud.best_ws_app.dto.actions.ActionType;
import com.github.ilyuharud.best_ws_app.dto.actions.CookBaseAction;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import com.github.ilyuharud.best_ws_app.service.chain.SteakSender;
import com.github.ilyuharud.best_ws_app.service.command.CookCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SteakCommand implements CookCommand {

    private final SteakSender steakSender;

    @Override
    public String getType() {
        return ActionType.STEAK;
    }

    @Override
    public Result cook(CookBaseAction action) {
        log.info("Начали готовить стейк");
        return steakSender.send(action);
    }
}
