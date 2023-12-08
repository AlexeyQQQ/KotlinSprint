package lesson_11

fun main() {

}


class RecipeCategory(
    val name: String,
    val image: String,
    val listOfRecipes: List<Recipe>,
) {

}


class Recipe(
    val id: Int,
    val name: String,
    val image: String,
    val cookingMethod: String,
    val listOfIngredients: List<Ingredient>,
    var countOfPortions: Int,
    var inFavorites: Boolean = false,
) {

}


class Ingredient(
    val name: String,
    val count: Int,
) {

}