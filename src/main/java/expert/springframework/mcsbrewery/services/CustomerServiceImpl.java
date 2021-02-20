package expert.springframework.mcsbrewery.services;

import expert.springframework.mcsbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        log.info("this is a log of Slf4j in the service implementation of Customer");
        return CustomerDto.builder().id(UUID.randomUUID()).name("Julio Chacón").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl
        log.debug("Updating .... ");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer .... ");
    }
}
