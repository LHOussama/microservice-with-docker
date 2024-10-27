package com.example.customer;

import Entreprise.Entreprise;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private  CustomerRepo customerRepository;
    private EntrepriseRepository entrepriseRepository;
    private  CustomerMapper CustomerMapper;
    @Override
    public Customer createCustomer(CustomerDto customerDto) {
        Entreprise entreprise = entrepriseRepository.getEntreprise(customerDto.getEntreprise_id());
        return customerRepository.save(CustomerMapper.convertToEntity(customerDto));

    }
}
