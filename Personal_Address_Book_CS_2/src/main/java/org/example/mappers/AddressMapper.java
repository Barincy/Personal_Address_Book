package org.example.mappers;

import org.apache.ibatis.annotations.Param;
import org.example.enity.Address;

import java.util.List;

public interface AddressMapper {
    List<Address> queryAllAddress();

    Address queryAddressById(@Param("id") Integer id);

    void insertAddress(Address address);

    void updateAddress(Address address);

    void deleteAddressById(@Param("id") Integer id);
}
