package org.example.controller;

import org.apache.ibatis.session.SqlSession;
import org.example.Utils.MybatisUtils;
import org.example.enity.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressController {

    private Scanner scanner = new Scanner(System.in);

    public void QueryAllAddress() {
        List<Address> addressList = new ArrayList<>();
        SqlSession sqlSession = MybatisUtils.getSession();
        try{
            addressList= sqlSession.selectList("queryAllAddress");
        }finally {

            for (Address address : addressList) {
                System.out.println(address);
            }
            sqlSession.close();
            System.out.println("");
            System.out.println("Query Address Success!");
        }
    }

    public void QueryAddressById(){
        Address address = new Address();
        Integer id = scanner.nextInt();
        SqlSession sqlSession = MybatisUtils.getSession();
        try {
            address = sqlSession.selectOne("queryAddressById",id);
            System.out.println(address);
        }finally {
            sqlSession.close();

            System.out.println("");
            System.out.println("Query Address Success!");
        }
    }

    public void deleteAddressById(){
        QueryAllAddress();
        SqlSession sqlSession = MybatisUtils.getSession();
        System.out.print("Input the id which you want to delete:");
        Integer id = scanner.nextInt();
        try {
            sqlSession.delete("deleteAddressById",id);
        }finally {
            sqlSession.commit();
            sqlSession.close();
            System.out.println("");
            System.out.println("Delete Address Success!");
        }
    }

    public void insertAddress(){
        SqlSession sqlSession = MybatisUtils.getSession();
        Address address = new Address();
        System.out.print("Input the name:");
        address.setName(scanner.nextLine());
        System.out.print("Input the phonenumber:");
        address.setPhoneNumber(scanner.nextLine());
        System.out.print("Input the address:");
        address.setAddress(scanner.nextLine());
        try {
            sqlSession.insert("insertAddress",address);
        }finally {
            sqlSession.commit();
            sqlSession.close();

            System.out.println("");
            System.out.println("Insert Address Success!");
        }
    }

    public void updateAddress(){
        QueryAllAddress();
        Address address = new Address();
        System.out.print("Input the id which address you want update:");
        address.setId(scanner.nextLong());
        System.out.print("Input the name:");
        scanner.nextLine();
        address.setName(scanner.nextLine());
        System.out.print("Input the phonenumber:");
        address.setPhoneNumber(scanner.nextLine());
        System.out.print("Input the address:");
        address.setAddress(scanner.nextLine());
        SqlSession sqlSession = MybatisUtils.getSession();
        try {
            sqlSession.update("updateAddress",address);
        }finally {
            sqlSession.commit();
            sqlSession.close();
            System.out.println("");
            System.out.println("Update Address Success!");
        }
    }
}
