package org.islom.dars22.service;

import org.islom.dars22.entity.Address;
import org.islom.dars22.repository.AddresRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    AddresRepo addresRepo;

    public HttpEntity<?> getAddresses(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Address> all = addresRepo.findAll(pageable);
        return new ResponseEntity<>(all.getContent(), HttpStatus.OK);
    }

    public Address getadressById(int id) {
        Optional<Address> byId = addresRepo.findById(id);
    return byId.orElse(null);

    }

    public Address addAddress(Address address) {
        addresRepo.save(address);
        return address;
    }

    public Address updateAddress(int id, Address address) {
        Optional<Address> byId = addresRepo.findById(id);
        if(byId.isPresent()) {
            Address editingadress=byId.get();
            editingadress.setCity(address.getCity());
            editingadress.setStreet(address.getStreet());
            addresRepo.save(editingadress);
            return editingadress;
        }
        return null;
    }

    public boolean  deleteAddress(int id) {
        Optional<Address> byId = addresRepo.findById(id);
        if(byId.isPresent()) {
            Address editingadress=byId.get();
            addresRepo.delete(editingadress);
            return true;
        }
        return false;
    }
}
