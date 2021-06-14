package com.bitbook.Handlers;

//import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.HttpURLConnection;
import java.nio.file.Files;

public class FileRequestHandler implements HttpHandler{
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            if (exchange.getRequestMethod().toUpperCase().equals("GET")) {
                String urlPath = exchange.getRequestURI().toString();

                // if urlPath is null or "/" set urlPath to "/index.html"
                if ((urlPath.equals(null)) || (urlPath.equals("/"))) {
                    urlPath = "/index.html";
                }
                String filePath = "src/web" + urlPath;
                
                // create a file object and check fi the file exists
                File file = new File(filePath);
                if (file.exists()) {
                    exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, 0);
                    OutputStream respBody = exchange.getResponseBody();
                    Files.copy(file.toPath(), respBody);
                    respBody.close();
                }
                // return 404 ERR if file DNE. Send custom 404.html page
                else {
                    exchange.sendResponseHeaders(HttpURLConnection.HTTP_NOT_FOUND, 0);
                    OutputStream respBody = exchange.getResponseBody();
                    //System.out.println("Working Directory = " + System.getProperty("user.dir"));
                    file = new File("src/web/404.html");
                    Files.copy(file.toPath(), respBody);
                    respBody.close();
                }
            }
            else {
                // ignore all except GET requests, send 405 ERR
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_BAD_METHOD, 0);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
