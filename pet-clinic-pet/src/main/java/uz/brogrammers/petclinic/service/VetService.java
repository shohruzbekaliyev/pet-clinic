package uz.brogrammers.petclinic.service;

import uz.brogrammers.petclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
