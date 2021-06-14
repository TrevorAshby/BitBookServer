package com.bitbook;
import com.bitbook.Handlers.*;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class BitBookServer {
    public static void main(String[] args) {
        try {
            startServer(8080);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void startServer(int port) throws IOException {
        InetSocketAddress serverAddress = new InetSocketAddress(port);
        HttpServer server = HttpServer.create(serverAddress, 10);
        registerHandlers(server);
        server.start();
        System.out.println("Server listening on port " + port);
    }

    public static void registerHandlers(HttpServer server) {
        server.createContext("/", new FileRequestHandler()); 
    }
}