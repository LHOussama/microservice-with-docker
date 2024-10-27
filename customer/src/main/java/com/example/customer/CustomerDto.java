package com.example.customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private String nom;
    private String mail;
    private Long entreprise_id;

}
