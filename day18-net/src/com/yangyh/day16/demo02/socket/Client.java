package com.yangyh.day16.demo02.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @description: 客户端
 * @author: yangyh
 * @create: 2019-11-12 19:22
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Socket client = new Socket("127.0.0.1",2333);

        OutputStream os = client.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "utf-8"));
        writer.write("world");
        writer.newLine();
        writer.flush();

        InputStream is = client.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
        String result = reader.readLine();

        System.out.println("服务端返回的结果：" + result);

        client.close();

    }
}
