package com.example.entreprise.dto;

import com.example.entreprise.enrtites.Entreprise;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EntrepriseMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public EntrepriseDto convertToDto(Entreprise entreprise) {
        EntrepriseDto entrepriseDto = modelMapper.map(entreprise, EntrepriseDto.class);
        return entrepriseDto;
    }
    public Entreprise convertToEntity(EntrepriseDto entrepriseDto) {
        Entreprise entreprise = modelMapper.map(entrepriseDto, Entreprise.class);
        return entreprise;
    }
}
