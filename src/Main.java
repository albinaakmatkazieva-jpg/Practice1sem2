import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        System.out.println("");

        System.out.println("Find Common Elements");
        ArrayList<String> aa = new ArrayList<>();
        ArrayList<String> bb = new ArrayList<>();

        aa.add("USA");
        aa.add("Korea");
        aa.add("Japan");
        aa.add("Kyrgyzstan");

        bb.add("Brazil");
        bb.add("Korea");
        bb.add("USA");
        bb.add("France");
        ArrayList<String> common = new ArrayList<>(aa);
        common.retainAll(bb);
        System.out.println(common);
        System.out.println("");

        System.out.println("Remove Even-Length Strings");
        ArrayList<String> names = new ArrayList<>();
        names.add("Alina");
        names.add("Tom");
        names.add("Bob");
        names.add("Mike");
        names.removeIf(name -> name != null && name.length() % 2 == 0);
        System.out.println(names);
        System.out.println("");

        System.out.println("Find Smallest Element");
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Hello");
        songs.add("The First Time");
        songs.add("Skyfall");
        songs.add("Dancing with a stranger");
        if (songs.isEmpty()) {
            System.out.println("List is empty");
        }
        String shortest = songs.get(0);
        for (String s : songs) {
            if (s != null && s.length() < shortest.length()) shortest = s;
        }
        System.out.println(songs);
        System.out.println("Shortest = " + shortest);
        System.out.println("");

        System.out.println("Replace All Vowels");
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("education");
        words.add("banana");
        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            if (w == null) continue;
            words.set(i, w.replaceAll("(?i)[aeiou]", "*"));
        }
        System.out.println(words);
        System.out.println("");

        System.out.println("Partition ArrayList");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (Integer n : nums) {
            if (n == null) continue;
            if (n % 2 == 0) evens.add(n);
            else odds.add(n);
        }
        System.out.println("Evens: " + evens);
        System.out.println("Odds : " + odds);
        System.out.println("");

        System.out.println("Rotate Elements");
        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        days.add("Sun");
        System.out.println(days);
        /*int positions = 2; // number of positions to rotate

        // Rotate to the right
        for (int i = 0; i < positions; i++) {
            String lastday = days.remove(days.size() - 1); // remove last element
            days.add(0, lastday); // add it at the beginning
        } */
        //I wrote this one first but then i looked for the ways I could write it in short
        Collections.rotate(days, 2);//then i found this
        System.out.println(days);
        System.out.println("");

        System.out.println("Remove Null Values");
        ArrayList<String> studnames = new ArrayList<>();
        studnames.add("Altynay");
        studnames.add("Aiperi");
        studnames.add("Zhibek");
        studnames.add(null);
        studnames.add(null);
        System.out.println("Student names: " + studnames);

        for (int i = 0; i < studnames.size(); i++) {
            if (studnames.get(i) == null) {
                studnames.remove(i);
                i--;
            }
        }
        System.out.println("Students list without nulls: " + studnames);
        System.out.println("");

        System.out.println(" Find Second Largest Element");
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Up");
        movies.add("Stranger Things");
        movies.add("Avatar");
        movies.add("Interstellar");
        movies.add("The Godfather");
        System.out.println(movies);
        if (movies.size() < 2) {
            System.out.println("Need at least 2 titles");
            return;
        }
        String longest2 = "";
        String second = "";
        for (String m : movies) {
            if (m.length() > longest2.length()) {
                second = longest2;
                longest2 = m;
            } else if (m.length() > second.length() && m.length() < longest2.length()) {
                second = m;
            }
        }
        System.out.println("Second longest: "+second);
        System.out.println("");

        System.out.println("Replace Elements with Lengths");
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Mango");
        fruits2.add("Pineapple");
        System.out.println("Fruits: " + fruits2);
        for (int i = 0; i < fruits2.size(); i++) {
            int length = fruits2.get(i).length();
            fruits2.set(i, String.valueOf(length)); // convert int to String
        }
        System.out.println("Fruits replaced by their lengths: " + fruits2);
        System.out.println("");

        System.out.println(" Create Nested ArrayList");
        ArrayList<String> itDep = new ArrayList<>();
        itDep.add("Mike");
        itDep.add("Bob");
        itDep.add("Brian");

        ArrayList<String> hrDep = new ArrayList<>();
        hrDep.add("David");
        hrDep.add("Charlote");

        ArrayList<String> salesDep = new ArrayList<>();
        salesDep.add("Frank");
        salesDep.add("Sunshine");
        salesDep.add("Jane");

        // Create an ArrayList of ArrayLists
        ArrayList<ArrayList<String>> company = new ArrayList<>();
        company.add(itDep);
        company.add(hrDep);
        company.add(salesDep);
        for (int i = 0; i < company.size(); i++) {
            ArrayList<String> department = company.get(i);
            System.out.println("Department " + (i + 1) + ": " + department);
        }
    }
}