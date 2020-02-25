package thegamerurso.springframework.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import thegamerurso.springframework.springrecipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
