package top.redemption.personaladdressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.redemption.personaladdressbook.entity.Address;
import top.redemption.personaladdressbook.entity.JSONResult;
import top.redemption.personaladdressbook.service.IAddressService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService addressService;

    @ResponseBody
    @RequestMapping("/list")
    public JSONResult getList() {
        List<Address> addressList = addressService.queryAllAddress();
        JSONResult addressJSONResult = new JSONResult(true, "Success", addressList);
        return addressJSONResult;
    }

    @ResponseBody
    @RequestMapping("/queryById")
    public JSONResult getById(Integer id){
        Address address = addressService.queryAddressById(id);
        JSONResult addressJSONResult = new JSONResult(true, "Success", address);
        return addressJSONResult;
    }

    @ResponseBody
    @RequestMapping("/deleteById")
    public JSONResult deleteById(Integer id){
        System.out.println(id);
        JSONResult result = null;
        if (id != null && id.longValue() != 0) {
            addressService.DeleteAddressById(id);
            result = new JSONResult(true, "Success");
        }else {
            result = new JSONResult(false,"false");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping("saveOrUpdate")
    public JSONResult saveOrUpdate(Address address){
        System.out.println(address.getId());

        System.out.println(address.getName());
        System.out.println(address.getPhoneNumber());
        System.out.println(address.getAddress());

        if (address != null && address.getId() != null) {
            addressService.UpdateAddressById(address);
        }else{
            addressService.InsertAddress(address);
        }

        JSONResult result = new JSONResult(true, "Success");
        return result;
    }

}
