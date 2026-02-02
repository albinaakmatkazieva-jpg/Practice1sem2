import java.util.ArrayList;
import java.util.Arrays;

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
        foods.add("burger");
        foods.add("pasta");
        foods.add("pizza");
        foods.add("pizza");
         int cc=0;
        for (String food : foods) {
            if (food.equals("pizza")){
                cc++;
            }
        }
        System.out.println(foods);
        System.out.println("Pizza counts "+ cc);
        System.out.println("");

        System.out.println("Remove All Matching Elements");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("kiwi");
        fruits.removeIf(f ->"banana".equals(f));
        System.out.println(fruits);
        System.out.println();

        System.out.println("Replace ALl Elements");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("pink");
        System.out.println(colors);
        for(int i=0; i< colors.size(); i++){
            colors.set(i,"black");
        }
        System.out.println(colors);
        System.out.println("");

        System.out.println("Check Sublist Replace");
        ArrayList<String> sports = new ArrayList<>();
        ArrayList<String> small = new ArrayList<>();

        sports.add("Basketball");
        sports.add("Football");
        sports.add("Volleyball");
        sports.add("Tennis");

        small.add("Football");
        small.add("Tennis");

        System.out.println(sports);
        System.out.println(small);
        if (sports.containsAll(small)){
            System.out.println("The sport list contains sublist sports: " +small);
        }else{
            System.out.println("The sport list does not contain sublist sports");
        }

        System.out.println();
        System.out.println(" Find Index of Element");
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("rose");
        flowers.add("lily");
        flowers.add("tulip");
        flowers.add("rose");
        System.out.println(flowers);
        int first = flowers.indexOf("rose");
        int last = flowers.lastIndexOf("rose");
        System.out.println("First index = "+first);
        System.out.println("Last index = "+last);
        System.out.println();

        System.out.println("Remove Duplicates");
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("lion");
        animals.add("cat");
        animals.add("dog");
        ArrayList<String> remove = new ArrayList<>();
        for (String a : animals){
            if (!remove.contains(a)){
                remove.add(a);
            }
        }
        System.out.println(remove);
        System.out.println("");

        System.out.println("Convert ArrayList to Array");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("LA");
        cities.add("Bishkek");
        cities.add("Seoul");
        cities.add("London");
        String[] arr = cities.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        System.out.println("Convert Array to ArrayList");
        Integer [] numbersArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(numbersArray));
        System.out.println(numbers);
    }
}