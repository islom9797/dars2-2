package org.islom.dars22.projection;

import org.islom.dars22.entity.Address;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getStreet();
    String getCity();
}
