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

}
