package com.mycompany.app;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class App {

    public static void main(String[] args) throws IOException {
        int port = 8080;

        HttpServer server = HttpServer.create(
            new InetSocketAddress(port), 0
        );

        server.createContext("/hello", new HelloHandler());

        server.setExecutor(null); // default executor
        server.start();

        System.out.println(
            "Server started at http://localhost:" + port
        );
    }
}
