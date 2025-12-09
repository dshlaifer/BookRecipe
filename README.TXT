PROJECT TITLE: bookRecipe

PURPOSE OF PROJECT: 1. Create recipes with titles, servings, ingredient, tags, and steps 2. Classify recipes into categories (Dessert, Soup, Dinner) 3. Scale ingredient quantities

4. add ratings 5. print detailed information about each recipe 6. practice java concepts such as: Inheritance, Polymorphism, Enums, ArrayList and Unit testing(JUnit)

DATE: December 10 2025

HOW TO START THIS PROJECT: 1. Open the project folder in BlueJ, IntelliJ, or VS Code. 2. Make sure the following classes are included (Recipe, Dessert Soup Dinner, Ingredient Step tag, IngredientUnit(enum)
3. Compile all classes.

4. Create a new recipe object through a test class.

example.

Recipe r = new Recipe("Pancakes", 4);
r.addIngredient(new Ingredient("Flour", 2, IngredientUnit.CUP));
r.addStep(new Step(1, "Mix ingredients"));
r.printDetails();


AUTHORS: David, Yoan




USER INSTRUCTION: Create a recipe by choosing the correct class (Recipe, Soup, Dessert, Dinner)

1. Add ingredients using
  addIngredient(new Ingredient("Sugar", 3, IngredientUnit.TABLESPOON));

2. Add steps using 
 addStep(new Step(1, "Heat the pan"));

3. Add tags such as 
 addTag(new Tag("vegan"));

4. print recipe details
  
  printDetails();

5. Scale servings

  scale(8);



LICENSE: Apache License 2.0

See the full license test here:

https://www.apache.org/licenses/LICENSE-2.0