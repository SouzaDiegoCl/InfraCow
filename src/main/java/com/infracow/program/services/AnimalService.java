package com.infracow.program.services;

import com.infracow.program.models.Animal;
import com.infracow.program.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public List<Animal> getAnimais(){
        return repository.findAll();
    }

    public List<Animal> getAnimaisWithImages(){
        return repository.findAllWithImages();
    }

    public Animal getAnimalById(Long id){
        return repository.findById(id).orElseThrow(()-> new UsernameNotFoundException("Animal Não Encontrado"));
    }
}
