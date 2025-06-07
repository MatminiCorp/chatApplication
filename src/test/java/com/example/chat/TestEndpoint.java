package com.example.chat;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnMessage;

@ClientEndpoint
public class TestEndpoint {
    @OnMessage
    public void onMessage(String message) {
        // no-op for test
    }
}
