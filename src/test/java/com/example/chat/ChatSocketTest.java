package com.example.chat;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.websocket.ContainerProvider;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import java.net.URI;

import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
public class ChatSocketTest {

    @Test
    public void testWebSocketConnection() throws Exception {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        Session session = container.connectToServer(TestEndpoint.class, URI.create("ws://localhost:8081/chat/test"));
        assertTrue(session.isOpen());
        session.close();
    }
}
