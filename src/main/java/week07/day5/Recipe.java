package week07.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {

    private String title;
    private List<String> ingredients = new ArrayList<>();
    private String description;

    public Recipe(String title) {
        this.title = title;
    }

    public Recipe(String title, String description) {
        this(title);
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    public String getDescription() {
        return description;
    }

    public void addIngredient(String newIngredient, String... newIngredients) {
        ingredients.add(newIngredient);
        ingredients.addAll(Arrays.asList(newIngredients));
    }


}
