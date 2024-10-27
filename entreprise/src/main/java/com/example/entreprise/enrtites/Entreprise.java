package com.example.entreprise.enrtites;
import com.example.entreprise.model.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Transient
    private List<Customer> customers;
}
