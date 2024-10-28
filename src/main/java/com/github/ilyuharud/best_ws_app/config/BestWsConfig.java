package com.github.ilyuharud.best_ws_app.config;

import com.github.ilyuharud.best_ws_app.handler.KitchenWsHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
@RequiredArgsConstructor
public class BestWsConfig implements WebSocketConfigurer {

    private final KitchenWsHandler bestWsHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(bestWsHandler, "/kitchen");
    }
}
