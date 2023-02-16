package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        boolean condition = true;

        while(condition){

            System.out.println("Welcome the Movie App! Please choose from the options below to get started:\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the sci-fi category\n" +
                    "6 - view movies in the comedy category\n" +
                    "7 - view movies in the musical category\n" +
                    "8 - add your own movie to the Movie App database\n" +
                    "Enter your choice: ");

            int userInput = input.getInt(0,8);

            //Exits the program if user selects 0;
            if(userInput == 0){
                condition = false;
                break;
            }

            //Returns all the movies if user selects 1;
            if(userInput == 1){
                Movie[] movies = MoviesArray.findAll();
                for(Movie movie : movies){
                    if(movie == null){
                        System.out.println("Sorry. There aren't any movies in the database for that category.");
                        break;
                    }
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }

            //Returns all the animated movies if user selects 2;
            if(userInput == 2){
                Movie[] movies = MoviesArray.findAll();
                for(Movie movie : movies){
                    if(movie == null){
                        System.out.println("Sorry. There aren't any movies in the database for that category.");
                        break;
                    } else if (movie.getCategory() == "animated") {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }

            //Returns all the drama movies if user selects 3;
            if(userInput == 3){
                Movie[] movies = MoviesArray.findAll();
                for(Movie movie : movies){
                    if(movie == null){
                        System.out.println("Sorry. There aren't any movies in the database for that category.");
                        break;
                    } else if (movie.getCategory() == "drama") {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }

            //Returns all the horror movies if user selects 4;
            if(userInput == 4){
                Movie[] movies = MoviesArray.findAll();
                for(Movie movie : movies){
                    if(movie == null){
                        System.out.println("Sorry. There aren't any movies in the database for that category.");
                        break;
                    } else if (movie.getCategory() == "horror") {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }

            //Returns all the horror movies if user selects 5;
            if(userInput == 5){
                Movie[] movies = MoviesArray.findAll();
                for(Movie movie : movies){
                    if(movie == null){
                        System.out.println("Sorry. There aren't any movies in the database for that category.");
                        break;
                    } else if (movie.getCategory() == "scifi") {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }

            //Returns all the horror movies if user selects 6;
            if(userInput == 6){
                Movie[] movies = MoviesArray.findAll();
                for(Movie movie : movies){
                    if(movie == null){
                        System.out.println("Sorry. There aren't any movies in the database for that category.");
                        break;
                    } else if (movie.getCategory() == "comedy") {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }

            //Returns all the horror movies if user selects 7;
            if(userInput == 7){
                Movie[] movies = MoviesArray.findAll();
                for(Movie movie : movies){
                    if(movie == null){
                        System.out.println("Sorry. There aren't any movies in the database for that category.");
                        break;
                    } else if (movie.getCategory() == "musical") {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }

            //Allows the user to add a movie to the MoviesArray.java file
            if(userInput == 8){
                System.out.println("Enter the name of the movie: ");
                String userMovieName = input.getString();
                System.out.println("Enter the category of the movie: ");
                String userMovieCategory = input.getString();
                Movie movie = new Movie(userMovieName, userMovieCategory);
                MoviesArray.addMovie(movie);
                System.out.println(String.format("%s, belonging to the movie category of %s, has been added to the Movie App database.", userMovieName, userMovieCategory));
            }

            //Asks the user if they want to continue
            System.out.print("Do you want to select another movie category? (yes/no): ");
            condition = input.yesNo();
        }
        //Goodbye message
        System.out.println("Thanks for using the Movie App. Goodbye");

    }
}
