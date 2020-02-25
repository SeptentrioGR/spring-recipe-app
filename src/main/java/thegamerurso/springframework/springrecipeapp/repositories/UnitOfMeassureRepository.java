package thegamerurso.springframework.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import thegamerurso.springframework.springrecipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeassureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
