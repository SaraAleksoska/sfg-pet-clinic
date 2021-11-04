package guru.springframework.sfgpetclinic.services;

import java.util.Set;

//ustvari ke praime neso kako CrudRepository
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);
}
