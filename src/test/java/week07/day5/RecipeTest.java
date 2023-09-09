package week07.day5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void addIngredientJustOne() {
        Recipe recipe = new Recipe("Krumplisaláta");
        recipe.addIngredient("Burgonya");
        assertEquals("Burgonya", recipe.getIngredients().get(0));
    }

    @Test
    void testAddIngredientList() {
        Recipe recipe = new Recipe("Krumplisaláta");
        recipe.addIngredient("Burgonya", "Hagyma", "Majonéz");
        assertEquals("Hagyma", recipe.getIngredients().get(1));
        assertEquals(3, recipe.getIngredients().size());
    }
}