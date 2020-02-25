package thegamerurso.springframework.springrecipeapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import thegamerurso.springframework.springrecipeapp.domain.Category;
import thegamerurso.springframework.springrecipeapp.domain.UnitOfMeasure;
import thegamerurso.springframework.springrecipeapp.repositories.CategoryRepository;
import thegamerurso.springframework.springrecipeapp.repositories.UnitOfMeassureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeassureRepository unitOfMeassureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeassureRepository unitOfMeassureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeassureRepository = unitOfMeassureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage()
    {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeassureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is:" + categoryOptional.get().getId());
        System.out.println("UOM Id is:" + unitOfMeasureOptional.get().getId());

        return "Index";
    }
}
