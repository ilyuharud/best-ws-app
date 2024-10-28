package com.github.ilyuharud.best_ws_app.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ilyuharud.best_ws_app.dto.actions.CookBaseAction;
import com.github.ilyuharud.best_ws_app.service.command.CookInvoker;
import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@Component
@RequiredArgsConstructor
public class KitchenWsHandler extends TextWebSocketHandler {

    private final ObjectMapper objectMapper;
    private final CookInvoker cookInvoker;

    @Override
    protected void handleTextMessage(@Nonnull WebSocketSession session,
                                     @Nonnull TextMessage message) throws Exception {
        var action = objectMapper.readValue(message.getPayload(), CookBaseAction.class);
        var result = cookInvoker.execute(action);
        session.sendMessage(new TextMessage(objectMapper.writeValueAsString(result)));
    }
}
