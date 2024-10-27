package com.example.entreprise.repositorie;
import com.example.entreprise.enrtites.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface EntrepriseRepo extends JpaRepository<Entreprise,String> {
}
