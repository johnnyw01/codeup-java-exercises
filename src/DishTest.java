public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish(1300, "Meatballs and Rice", false);
//        dish1.printSummary();
       Dish dish2 = new Dish(1900, "Lobster Tail", true);
//       dish2.printSummary();
       Dish dish3 = new Dish(1100, "Eggplant Sandwhich", false);
//       dish3.printSummary();
       Dish dish4 = new Dish(29000, "T-bone Steak", true);
//       dish4.printSummary();

       DishTools.shoutDishName(dish1);
       DishTools.analyzeDishCost(dish1);
       DishTools.flipRecommendation(dish1);

        DishTools.shoutDishName(dish2);
        DishTools.analyzeDishCost(dish2);
        DishTools.flipRecommendation(dish2);

        DishTools.shoutDishName(dish3);
        DishTools.analyzeDishCost(dish3);
        DishTools.flipRecommendation(dish3);

        DishTools.shoutDishName(dish4);
        DishTools.analyzeDishCost(dish4);
        DishTools.flipRecommendation(dish4);

    }
}
