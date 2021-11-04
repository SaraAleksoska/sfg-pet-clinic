package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String LastName);

    /*Owner findByID(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();*/
    //sega ovie ne ni trebaat zatoa sto extend-navme so CrudService kaj sto veke se implementirani ovie findById, save...
    //zatoa se izbrisani vo drugite servisi zatoa so imame eden common interface.

}
