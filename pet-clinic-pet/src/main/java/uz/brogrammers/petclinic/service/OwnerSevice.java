package uz.brogrammers.petclinic.service;

import uz.brogrammers.petclinic.model.Owner;

public interface OwnerSevice extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

