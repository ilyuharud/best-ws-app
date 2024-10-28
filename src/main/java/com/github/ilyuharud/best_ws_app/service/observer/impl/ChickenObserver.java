package com.github.ilyuharud.best_ws_app.service.observer.impl;

import com.github.ilyuharud.best_ws_app.dto.actions.CookCezar;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import com.github.ilyuharud.best_ws_app.service.observer.CezarObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ChickenObserver implements CezarObserver {
    @Override
    public Result cook(CookCezar cezar) {
        log.info("Начали готовить курочку");
        return new Result("курочку");
    }
}
