package com.github.ilyuharud.best_ws_app.service.chain;

import com.github.ilyuharud.best_ws_app.dto.actions.CookBaseAction;
import com.github.ilyuharud.best_ws_app.dto.actions.CookSteak;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SteakSender {

    private final List<SteakHandler> steakHandlers;

    @PostConstruct
    public void init() {
        for (var i = 0; i < steakHandlers.size() - 1; i++) {
            steakHandlers.get(i).setNextHandler(steakHandlers.get(i + 1));
        }
    }

    public Result send(CookBaseAction action) {
        return steakHandlers.getFirst().cook((CookSteak) action);
    }
}
