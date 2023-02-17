import util.Input;

import java.util.*;

public class GroceryListApp {
    public static void main(String[] args) {
        Input input = new Input();

        ArrayList<String> categories = new ArrayList<>(Arrays.asList("Fruits & Vegetables", "Meat", "Dairy", "Bread & Bakery","Deli","Beverages","Frozen Food","Canned Goods","Baking","Pasta, Rice & Cereal","Fish & Seafood","Condiments & Spices","Snacks","Household & Cleaning Supplies","Health Care","Personal Care","Baby Items","Pet Care"));
        HashMap<String, HashMap<String, Integer>> groceryList = new HashMap<>();
        String userInput;

        // Prompt user to create a grocery list
        System.out.println("Would you like to create a grocery list? (yes or no)");
        userInput = input.getString();

        while (userInput.equalsIgnoreCase("yes")) {
            // Prompt user to enter a new item
            System.out.println("Would you like to enter a new item? (yes or no)");
            userInput = input.getString();

            while (userInput.equalsIgnoreCase("yes")) {
                // Prompt user to select a category
                System.out.println("Select a category:");
                for (int i = 0; i < categories.size(); i++) {
                    System.out.println((i + 1) + ". " + categories.get(i));
                }
                int categoryChoice = input.getInt(1,18);

                // Prompt user to enter the name of the item
                System.out.println("Enter the name of the item:");
                String itemName = input.getString();

                // Prompt user to enter the quantity of the item
                System.out.println("Enter the quantity of the item:");
                int itemQuantity = input.getInt();

                // Add the item to the grocery list
                String category = categories.get(categoryChoice - 1);
                if (!groceryList.containsKey(category)) {
                    groceryList.put(category, new HashMap<String, Integer>());
                }
                HashMap<String, Integer> itemsInCategory = groceryList.get(category);
                if (itemsInCategory.containsKey(itemName)) {
                    itemQuantity += itemsInCategory.get(itemName);
                }
                itemsInCategory.put(itemName, itemQuantity);

                // Prompt user to finalize the list or add another item
                System.out.println("Would you like to add another item to the list? (yes or no)");
                userInput = input.getString();
            }

            // Prompt user to finalize the list or add another category
            System.out.println("Would you like to add another category to the list? (yes or no)");
            userInput = input.getString();
        }

        // Sort the grocery list alphabetically and group by category
        ArrayList<String> sortedCategories = new ArrayList<>(groceryList.keySet());
        Collections.sort(sortedCategories);
        System.out.println("Here is your finalized grocery list: ");
        for (String category : sortedCategories) {
            System.out.println(category + ":");
            HashMap<String, Integer> itemsInCategory = groceryList.get(category);
            ArrayList<String> sortedItems = new ArrayList<>(itemsInCategory.keySet());
            Collections.sort(sortedItems);
            for (String itemName : sortedItems) {
                System.out.println("- " + itemName + " (" + itemsInCategory.get(itemName) + ")");
            }
        }
        System.out.println("Thank you for using the Grocery List App! Good-bye.");
    }
}