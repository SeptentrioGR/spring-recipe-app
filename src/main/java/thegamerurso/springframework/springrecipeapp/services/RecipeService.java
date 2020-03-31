package thegamerurso.springframework.springrecipeapp.services;

import thegamerurso.springframework.springrecipeapp.commands.RecipeCommand;
import thegamerurso.springframework.springrecipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

   Set<Recipe> getRecipes();

   Recipe findById(Long l);

   RecipeCommand findCommandById(Long l);

   RecipeCommand saveRecipeCommand(RecipeCommand command);

   void deleteById(Long idToDelete);
}
