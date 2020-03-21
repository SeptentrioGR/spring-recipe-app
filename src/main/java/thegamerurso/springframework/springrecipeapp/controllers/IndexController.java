package thegamerurso.springframework.springrecipeapp.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import thegamerurso.springframework.springrecipeapp.services.RecipeService;
@Slf4j
@Controller
public class IndexController
 {

     private final RecipeService recipeService;

     public IndexController(RecipeService recipeService) {
         this.recipeService = recipeService;
     }



    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model)
    {
        log.debug("Getting Index page");
        model.addAttribute("recipe",recipeService.getRecipes());

        return "Index";
    }
}
