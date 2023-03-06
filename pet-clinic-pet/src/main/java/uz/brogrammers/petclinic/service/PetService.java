package uz.brogrammers.petclinic.service;

import uz.brogrammers.petclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
