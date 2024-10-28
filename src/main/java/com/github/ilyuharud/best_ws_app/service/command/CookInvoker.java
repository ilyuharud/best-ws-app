package com.github.ilyuharud.best_ws_app.service.command;

import com.github.ilyuharud.best_ws_app.dto.actions.CookBaseAction;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Component
public class CookInvoker {

    private final Map<String, CookCommand> commands;

    public CookInvoker(List<CookCommand> cookCommandList) {
        this.commands = cookCommandList.stream()
                .collect(toMap(CookCommand::getType, Function.identity()));
    }

    public Result execute(CookBaseAction action) {
        var command = commands.get(action.getType());
        if (command == null)
            throw new IllegalStateException();
        return command.cook(action);
    }
}
