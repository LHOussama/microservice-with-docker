package com.example.entreprise;
import com.example.entreprise.dto.EntrepriseDto;
import com.example.entreprise.dto.EntrepriseMapper;
import com.example.entreprise.repositorie.EntrepriseRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;
@SpringBootApplication
public class EntrepriseApplication {
	public static void main(String[] args) {
		SpringApplication.run(EntrepriseApplication.class, args);
	}
	@Bean
	CommandLineRunner start(EntrepriseRepo entrepriseRepo, EntrepriseMapper entrepriseMapper)
		{
			return args -> {
				List.of("IBM","GOOGLE").forEach(name -> {
					EntrepriseDto entrepriseDto = new EntrepriseDto();
					entrepriseDto.setNom(name);
					System.out.println(entrepriseRepo.save(entrepriseMapper.convertToEntity(entrepriseDto)).toString());
				});
			};
		}
	}
