package com.example.entreprise.dto;
import com.example.entreprise.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntrepriseDto {
    private String nom;
    private List<Customer> customers;

}
