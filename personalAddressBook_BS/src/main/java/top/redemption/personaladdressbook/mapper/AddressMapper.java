package top.redemption.personaladdressbook.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.redemption.personaladdressbook.entity.Address;

import java.util.List;

@Mapper
public interface AddressMapper {
    List<Address> queryAllAddress();

    Address queryAddressById(@Param("id") Integer id);

    void UpdateAddressById(Address address);

    void InsertAddress(Address address);

    void DeleteAddressById(@Param("id") Integer id);
}
