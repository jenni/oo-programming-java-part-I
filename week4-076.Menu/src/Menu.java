//Exercise 76.1: Adding a meal to menu
//Implement the method public void addMeal(String meal) that adds a new meal to the list this.meals of a Menu object.
// If the meal is already in the list, it should not be added.
//
//Exercise 76.2: Printing the menu
//Implement the method public void printMeals() that prints the meals in a menu.

//Exercise 76.3: Clearing a menu
//Implement the method public void clearMenu() that clears a menu.
// After calling this method, the menu should be empty.

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) this.meals.add(meal);
    }

    public void printMeals() {
//        this.meals.forEach(meal -> System.out.println(meal));

        for (String meal : this.meals)
            System.out.println(meal);
    }

    public void clearMenu() {
        this.meals.clear();
    }
}
