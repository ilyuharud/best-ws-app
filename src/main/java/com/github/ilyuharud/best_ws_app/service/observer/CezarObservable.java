package com.github.ilyuharud.best_ws_app.service.observer;

import com.github.ilyuharud.best_ws_app.dto.actions.CookBaseAction;
import com.github.ilyuharud.best_ws_app.dto.actions.CookCezar;
import com.github.ilyuharud.best_ws_app.dto.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CezarObservable {

    private final List<CezarObserver> observers;

    public Result notify(CookBaseAction action) {
        var ingredients = observers.stream()
                .map(observer -> observer.cook((CookCezar) action))
                .map(Result::message)
                .toList();
        return new Result("Ваш цезарь готов из " + ingredients);
    }
}
