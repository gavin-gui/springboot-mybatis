package com.example.demo.ws;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2017/10/19.
 */
public class UserwsTest{

    @Test
    public void test() throws IOException {
        String wsdl = "http://localhost:8088/ws/findUserById";
        int timeout = 10000;
        StringBuffer sb = new StringBuffer("");
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:demo=\"http://www.donica.com/ws/demo\">");
        sb.append("   <soapenv:Header/>");
        sb.append("   <soapenv:Body>");
        sb.append("<demo:UserRequest>");
        sb.append("<demo:userId>?</demo:userId>");
        sb.append("</demo:UserRequest>");
        sb.append("</soapenv:Body>");
        sb.append("</soapenv:Envelope>");



        // HttpURLConnection 发送SOAP请求
        System.out.println("HttpURLConnection 发送SOAP请求");
        URL url = new URL(wsdl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        conn.setRequestMethod("POST");
        conn.setUseCaches(false);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setConnectTimeout(timeout);
        conn.setReadTimeout(timeout);

        DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
        dos.write(sb.toString().getBytes("utf-8"));
        dos.flush();


        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
        String line = null;
        StringBuffer strBuf = new StringBuffer();
        while ((line = reader.readLine()) != null) {
            strBuf.append(line);
        }
        dos.close();
        reader.close();
        System.out.println("响应结果：");
        System.out.println(strBuf.toString());
    }

}
