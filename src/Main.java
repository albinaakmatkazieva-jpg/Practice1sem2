import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merge unique elements");
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("The Count of Monte Cristo");
        books1.add("1984");
        books1.add("Animal Farm");

        System.out.println("List 1: "+books1);

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("1984");
        books2.add("Dune");
        books2.add("Pride and Prejudice ");

        System.out.println("List 2: " + books2);

        ArrayList<String> mergedBooks = new ArrayList<>();
        for (String books : books1){
            mergedBooks.add(books);
        }

        for (String books : books2){
            if (!mergedBooks.contains(books)){
                mergedBooks.add(books);
            }
        }
        System.out.println("Merged list without duplicates: " );
        for (String books : mergedBooks){
            System.out.println(books);
        }

        System.out.println();
        System.out.println("Find Maximum Element");

        ArrayList<String> films = new ArrayList<>();
        films.add("Fight Club");
        films.add("How to Lose a Guy in 10 Days");
        films.add("Harry Potter");
        films.add("Back to the Future");

        String longest = films.get(0);
        for (String film : films){
            if (film.length()>longest.length()){
                longest=film;
            }
        }
        System.out.println("List of movies: " +films);
        System.out.println("Longest movie title: "+ longest);
        System.out.println("Length:" + longest.length());

        System.out.println();
        System.out.println("Count Occurrences");
        ArrayList<String> foods = new ArrayList<>();
        foods.add("pizza");
        foods.add("pizza");
        foods.add("burger"):

    }
}