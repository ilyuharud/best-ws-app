package com.github.ilyuharud.best_ws_app.service.observer.impl;

import com.github.ilyuharud.best_ws_app.dto.actions.CookCezar;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import com.github.ilyuharud.best_ws_app.service.observer.CezarObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SaladObserver implements CezarObserver {

    @Override
    public Result cook(CookCezar cezar) {
        log.info("Нарезаем салатик");
        return new Result("листья салатика");
    }
}
