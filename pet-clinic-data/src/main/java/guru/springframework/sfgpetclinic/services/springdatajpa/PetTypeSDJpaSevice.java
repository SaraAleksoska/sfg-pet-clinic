package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaSevice implements PetTypeService {

    private final PetTypeRepository petTypeRepositories;

    public PetTypeSDJpaSevice(PetTypeRepository petTypeRepositories) {
        this.petTypeRepositories = petTypeRepositories;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepositories.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findByID(Long aLong) {
        return petTypeRepositories.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepositories.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepositories.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        petTypeRepositories.deleteById(aLong);
    }
}
