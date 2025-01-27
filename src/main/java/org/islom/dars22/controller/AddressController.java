package org.islom.dars22.controller;

import org.islom.dars22.entity.Address;
import org.islom.dars22.service.AddressService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/api/addresses")
public class AddressController {
//    AddressService addressService;
//
//    @GetMapping
//    public HttpEntity<?> getAllAddresses(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
//        return addressService.getAddresses(page, size);
//    }
//
//    @GetMapping("{id}")
//    public HttpEntity<?> getAddressById(@PathVariable int id) {
//        Address address = addressService.getadressById(id);
//        return ResponseEntity.status(address == null ? 409 : 200).body(address);
//    }
//
//    @PostMapping
//    public HttpEntity<?> addAddress(@RequestBody Address address) {
//        Address address1 = addressService.addAddress(address);
//        return ResponseEntity.status(address1 == null ? 409 : 200).body(address1);
//    }
//
//    @PutMapping("{id}")
//    public HttpEntity<?> updateAddress(@PathVariable int id, @RequestBody Address address) {
//        Address address1 = addressService.updateAddress(id, address);
//        return ResponseEntity.status(address1 == null ? 409 : 200).body(address1);
//    }
//
//    @DeleteMapping("{id}")
//    public HttpEntity<?> deleteAddress(@PathVariable int id) {
//      boolean result=  addressService.deleteAddress(id);
//        return ResponseEntity.status(!result ? 409 : 200).body(address1);
  //  }
}


