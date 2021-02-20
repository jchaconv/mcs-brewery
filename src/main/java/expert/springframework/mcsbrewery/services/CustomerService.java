package expert.springframework.mcsbrewery.services;

import expert.springframework.mcsbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID id);

}
