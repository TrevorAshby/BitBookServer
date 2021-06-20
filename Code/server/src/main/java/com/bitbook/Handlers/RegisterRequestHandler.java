package com.bitbook.Handlers;

// need to import Register Request
// need to import Register Result
// Need to import Register Service

import com.bitbook.Models.User;
import com.google.gson.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.HttpURLConnection;

public class RegisterRequestHandler implements HttpHandler {
    public RegisterRequestHandler() {

    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        /** Creates a new user account, given the provided information. */
        try {
            if (exchange.getRequestMethod().toUpperCase().equals("POST")) {
                InputStream reqBody = exchange.getRequestBody();

                String reqData = readString(reqBody);

                System.out.println(reqData);
                User usr = JsonSerializer.deserialize(reqData, User.class);

                // check for missing properties, if so.. internal server error
                


            }
            else {
                // expected post but got another type of request method.
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_BAD_REQUEST, 0);
            }
        } catch (IOException e) {
            exchange.sendResponseHeaders(HttpURLConnection.HTTP_INTERNAL_ERROR, 0);
            exchange.getResponseBody().close();
            e.printStackTrace();
        }
    }
}