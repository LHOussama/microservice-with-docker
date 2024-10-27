package com.example.customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@Component
public class CustomerMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public CustomerDto convertToDto(Customer customer) {
        CustomerDto customerDto = modelMapper.map(customer, CustomerDto.class);
        return customerDto;
    }
    public Customer convertToEntity(CustomerDto customerDto) {
        Customer customer = modelMapper.map(customerDto, Customer.class);
        return customer;
    }

}
