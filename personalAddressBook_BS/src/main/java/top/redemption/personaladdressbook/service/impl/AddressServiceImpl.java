package top.redemption.personaladdressbook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.redemption.personaladdressbook.entity.Address;
import top.redemption.personaladdressbook.mapper.AddressMapper;
import top.redemption.personaladdressbook.service.IAddressService;

import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> queryAllAddress() {
        List<Address> addressList = addressMapper.queryAllAddress();
        return addressList;
    }

    @Override
    public Address queryAddressById(Integer id) {
        Address address = addressMapper.queryAddressById(id);
        return address;
    }

    @Override
    public void UpdateAddressById(Address address) {
        addressMapper.UpdateAddressById(address);

    }

    @Override
    public void InsertAddress(Address address) {
        addressMapper.InsertAddress(address);

    }

    @Override
    public void DeleteAddressById(Integer id) {
        addressMapper.DeleteAddressById(id);

    }
}
