package expert.springframework.mcsbrewery.web.mappers;

import expert.springframework.mcsbrewery.domain.Customer;
import expert.springframework.mcsbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);

}
