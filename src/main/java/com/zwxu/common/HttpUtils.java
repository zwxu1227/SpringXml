package com.zwxu.common;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {

    /**
     * @param uri
     * @param param 请求参数
     * @return
     */
    public static String sendPost(String uri, String param) {
        String result = null;
        PrintWriter out = null;
        InputStream in = null;
        try {
            URL url = new URL(uri);
            HttpURLConnection urlcon = (HttpURLConnection) url.openConnection();
            urlcon.setDoInput(true);
            urlcon.setDoOutput(true);
            urlcon.setUseCaches(false);
            urlcon.setRequestMethod("POST");
            urlcon.connect();// 获取连接
            out = new PrintWriter(urlcon.getOutputStream());
            out.print(param);
            out.flush();
            in = urlcon.getInputStream();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(
                    in, "UTF-8"));
            StringBuffer bs = new StringBuffer();
            String line = null;
            while ((line = buffer.readLine()) != null) {
                bs.append(line);
            }
            result = bs.toString();
        } catch (Exception e) {
            System.out.println("[请求异常][地址：" + uri + "][参数：" + param + "][错误信息："
                    + e.getMessage() + "]");
        } finally {
            try {
                if (null != in)
                    in.close();
                if (null != out)
                    out.close();
            } catch (Exception e2) {
                System.out.println("[关闭流异常][错误信息：" + e2.getMessage() + "]");
            }
        }
        return result;
    }


    public static String sendPostJson(String url,String params)throws IOException{
    	String gb = "UTF-8";
        StringBuffer sb = new StringBuffer();
        URL urls;
        HttpURLConnection uc = null;
        BufferedReader in = null;
        try {
            urls = new URL(url);
            uc = (HttpURLConnection) urls.openConnection();
            uc.setRequestMethod("POST");
            uc.setDoOutput(true);
            uc.setDoInput(true);
            uc.setUseCaches(false);
            uc.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");
            uc.connect();
            DataOutputStream out = new DataOutputStream(uc.getOutputStream());
            out.write(params.getBytes(gb));
            out.flush();
            out.close();
            in = new BufferedReader(new InputStreamReader(uc.getInputStream(),
                    gb));
            String readLine = "";
            while ((readLine = in.readLine()) != null) {
                sb.append(readLine);
            }
            if (in != null) {
                in.close();
            }
            if (uc != null) {
                uc.disconnect();
            }
        } catch (IOException e) {
            //log.error(e.getMessage(), e);
        } finally {
            if (uc != null) {
                uc.disconnect();
            }
        }
        return sb.toString();
    }
    

    /**
    *
    * HTTP协议GET请求方法
    */
   public static String httpMethodGet(String url, String gb) {
       if (null == gb || "".equals(gb)) {
           gb = "UTF-8";
       }
       StringBuffer sb = new StringBuffer();
       URL urls;
       HttpURLConnection uc = null;
       BufferedReader in = null;
       try {
           urls = new URL(url);
           uc = (HttpURLConnection) urls.openConnection();
           uc.setRequestMethod("GET");
           uc.connect();
           in = new BufferedReader(new InputStreamReader(uc.getInputStream(),
                   gb));
           String readLine = "";
           while ((readLine = in.readLine()) != null) {
               sb.append(readLine);
           }
           if (in != null) {
               in.close();
           }
           if (uc != null) {
               uc.disconnect();
           }
       } catch (Exception e) {
           //log.error(e.getMessage(), e);
       } finally {
           if (uc != null) {
               uc.disconnect();
           }
       }
       return sb.toString();
   }
}

