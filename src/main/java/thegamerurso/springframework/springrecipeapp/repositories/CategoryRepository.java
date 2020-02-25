package thegamerurso.springframework.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import thegamerurso.springframework.springrecipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
