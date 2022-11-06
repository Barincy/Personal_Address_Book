package org.example.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.example.entity.Address;

import java.util.List;

public class JsonUtil {
    public List<Address> jsonToAddressList(String res){
        List<Address> addressList;
        JSONObject jsonObject = JSON.parseObject(res);
        String s = JSONArray.toJSONString(jsonObject.get("data"));
        addressList = JSONArray.parseArray(s, Address.class);
        return addressList;
    }

    public Address jsonToAddress(String res){
        JSONObject jsonObject = JSON.parseObject(res);
        String s = JSONArray.toJSONString(jsonObject.get("data"));
        Address address = JSONObject.parseObject(s,Address.class);
        return address;
    }
}
