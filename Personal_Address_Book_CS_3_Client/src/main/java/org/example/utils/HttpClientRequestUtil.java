package org.example.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.example.entity.Address;

import java.util.List;

/**
 * @author Redemption
 */
public class HttpClientRequestUtil {
    public static String doGet(String url) {
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        HttpMethodParams params = new HttpMethodParams();
        params.setContentCharset("utf-8");
        method.setParams(params);
        List<Address> addressList;
        String res = null;
        int code = 0;
        try {
            code = client.executeMethod(method);
            if (code == 200) {
                res = method.getResponseBodyAsString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public static String doPost(String url,List<NameValuePair>  params){

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        String res = null;
        try{
            post.addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36");
            post.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            HttpResponse response = client.execute(post);
            res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }catch (Exception e) {
            res = "False";
            e.printStackTrace();
        }

        return res;
    }
}
