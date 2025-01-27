package org.islom.dars22.repository;

import org.islom.dars22.entity.Address;
import org.islom.dars22.projection.CustomAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//public interface AddresRepo extends JpaRepository<Address, Integer> {
//}
///path bu yerda link,collectionResourceREl esa qaytarib yuboradigan listning addresses o'rniga=>list deb qaytaradi
///
@RepositoryRestResource(path = "address",collectionResourceRel = "list",excerptProjection = CustomAddress.class)
public interface AddresRepo extends JpaRepository<Address, Integer> {
}