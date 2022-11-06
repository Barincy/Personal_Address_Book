package org.example.controller;


import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.example.entity.Address;
import org.example.utils.JsonUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.utils.HttpClientRequestUtil.doGet;
import static org.example.utils.HttpClientRequestUtil.doPost;

public class AddressController {
    private Scanner scanner = new Scanner(System.in);
    JsonUtil jsonUtil = new JsonUtil();

    public void QueryAllAddress() {
        String url = "http://127.0.0.1:80/address/list";
        List<Address> addressList = jsonUtil.jsonToAddressList(doGet(url));
        for (Address address : addressList){
            System.out.println(address);
        }
    }

    public void QueryAddressById() {
        List<NameValuePair> params = new ArrayList<>();
        System.out.print("Please Input The id which you want to query:");
        String id = scanner.nextLine();
        params.add(new BasicNameValuePair("id",id));
        String url = "http://127.0.0.1:80/address/queryById";
        Address address = jsonUtil.jsonToAddress(doPost(url,params));
        System.out.println(address);
    }

    public void insertAddress() {
        Address address = new Address();
        System.out.print("Input the name:");
        address.setName(scanner.nextLine());
        System.out.print("Input the phonenumber:");
        address.setPhoneNumber(scanner.nextLine());
        System.out.print("Input the address:");
        address.setAddress(scanner.nextLine());
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("name",address.getName()));
        params.add(new BasicNameValuePair("phoneNumber",address.getPhoneNumber()));
        params.add(new BasicNameValuePair("address",address.getAddress()));
        String url = "http://127.0.0.1:80/address/saveOrUpdate";
        Address addressres = jsonUtil.jsonToAddress(doPost(url,params));
        System.out.println(addressres);
    }

    public void updateAddress() {
        QueryAllAddress();
        Address address = new Address();
        System.out.print("Input the id which address you want update:");
        String id = scanner.nextLine();
        System.out.print("Input the name:");
        address.setName(scanner.nextLine());
        System.out.print("Input the phonenumber:");
        address.setPhoneNumber(scanner.nextLine());
        System.out.print("Input the address:");
        address.setAddress(scanner.nextLine());
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("id",id));
        params.add(new BasicNameValuePair("name",address.getName()));
        params.add(new BasicNameValuePair("phoneNumber",address.getPhoneNumber()));
        params.add(new BasicNameValuePair("address",address.getAddress()));
        String url = "http://127.0.0.1:80/address/saveOrUpdate";
        String  res  = doPost(url,params);
        System.out.println(res);
    }

    public void deleteAddressById() {
        QueryAllAddress();
        List<NameValuePair> params = new ArrayList<>();
        System.out.print("Please Input The id which you want delete:");
        String id = scanner.nextLine();
        params.add(new BasicNameValuePair("id",id));
        String url = "http://127.0.0.1:80/address/deleteById";
        String res = doPost(url,params);
        System.out.println(res);
    }
}
