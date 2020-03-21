package thegamerurso.springframework.springrecipeapp.repositories;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import thegamerurso.springframework.springrecipeapp.domain.UnitOfMeasure;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeassureRepositoryTest {

    @Autowired
    UnitOfMeassureRepository unitOfMeassureRepository;

    @BeforeEach
    public void setUp() throws Exception {
    }

    @Test
    @DirtiesContext
    public void findByDescription() throws Exception{
        Optional<UnitOfMeasure> uomOptional = unitOfMeassureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon",uomOptional.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() throws Exception{
        Optional<UnitOfMeasure> uomOptional = unitOfMeassureRepository.findByDescription("Cups");
        assertEquals("Cups",uomOptional.get().getDescription());
    }
}