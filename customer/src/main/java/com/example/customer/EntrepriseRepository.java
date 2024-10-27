package com.example.customer;
import Entreprise.Entreprise;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "ENTREPRISE-SERVICE")
public interface EntrepriseRepository  {
    @GetMapping("/entreprises/{id}")
    public Entreprise getEntreprise(@PathVariable Long id);
}
