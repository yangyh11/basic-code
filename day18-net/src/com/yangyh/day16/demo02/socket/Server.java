package com.yangyh.day16.demo02.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: 服务端
 * @author: yangyh
 * @create: 2019-11-12 19:33
 */
public class Server {


    private ServerSocket server;

    private int port = 2333;

    public Server() throws Exception {
        server = new ServerSocket(port);
        System.out.println("端口:" + port + "服务启动成功！");

        Socket client = null;
        while (true) {
            client = server.accept();
            handRequest(client);
        }
    }

    /**
     * 处理请求
     * @param client
     */
    private void handRequest(Socket client) throws IOException {
        InputStream is = client.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, "utf-8"));

        String request = reader.readLine();

        OutputStream os = client.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "utf-8"));

        writer.write("你好，来自客户端的" + request);
        writer.newLine();
        writer.flush();
    }

    public static void main(String[] args) throws Exception {
        new Server();
    }

}
