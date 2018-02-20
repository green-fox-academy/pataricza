import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {

        ArrayList<String> pairs = new ArrayList<>();
        int counter = 0;

        if(girls.size() < boys.size()){
            for (int i = 0; i < girls.size(); i++) {
                pairs.add(girls.get(i));
                pairs.add(boys.get(i));
                counter++;
            }
            pairs.add("And " + boys.get(counter) + " has no pair :( ");
        } else {
            for (int i = 0; i > boys.size(); i++) {
                pairs.add(girls.get(i));
                pairs.add(boys.get(i));
            }
            pairs.add("And " + girls.get(counter) + " has no pair :( ");
        }
     return pairs;
    }
}