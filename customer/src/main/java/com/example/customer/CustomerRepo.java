package com.example.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface CustomerRepo extends JpaRepository<Customer,String> {

}
