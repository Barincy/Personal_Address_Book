package top.redemption.personaladdressbook.service;

import top.redemption.personaladdressbook.entity.Address;

import java.util.List;

public interface IAddressService {
    List<Address> queryAllAddress();

    Address queryAddressById(Integer id);

    void UpdateAddressById(Address address);

    void InsertAddress(Address address);

    void DeleteAddressById(Integer id);
}
