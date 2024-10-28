package com.github.ilyuharud.best_ws_app.service.observer;

import com.github.ilyuharud.best_ws_app.dto.actions.CookCezar;
import com.github.ilyuharud.best_ws_app.dto.result.Result;

public interface CezarObserver {
   Result cook(CookCezar cezar);
}
