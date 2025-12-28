package com.mycompany.app;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class HelloHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if (!"GET".equals(exchange.getRequestMethod())) {
            exchange.sendResponseHeaders(405, -1);
            return;
        }

        String response = "Hello from Maven + JDK HTTP server!";
        byte[] body = response.getBytes(StandardCharsets.UTF_8);

        exchange.getResponseHeaders().add(
            "Content-Type", "text/plain; charset=utf-8"
        );
        exchange.sendResponseHeaders(200, body.length);

        try (OutputStream os = exchange.getResponseBody()) {
            os.write(body);
        }
    }
}
