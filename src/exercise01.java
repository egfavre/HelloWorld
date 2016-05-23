import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 5/23/16.
 */
public class exercise01 {
    public static void main(String[] args) {
        //array of names

        //String[] names = new String[10];
        //names[0] = "Alice";

        //alternate method to populate string
        String[] names = {"Alice", "Bob", "Charlie", "David", "Andrea", "Albert", "Beth"};
        //"A": ["Alice", "Andrea", "Albert"]

        HashMap<String, ArrayList<String>> nameMap = new HashMap<>();

        //A:[]
        //B:[] etc

        //pull names from array to put in HashMap with for loop

        for (String name : names) {
            char firstLetter = name.charAt(0);
            //cannot insert a char in a string map
            String firstLetterStr = String.valueOf(firstLetter);
            nameMap.put(firstLetterStr, new ArrayList<>());
        }

        //System.out.println(nameMap);
        //Results: {A=[], B=[], C=[], D=[]}

        //now fill values

        for (String name : names) {
            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            ArrayList<String> arr = nameMap.get(firstLetterStr);
            arr.add(name);
            //adds back to Hashmap automatically because name was already in Hashmap; if primitive add manually
        }

        //System.out.println(nameMap);
        //Results: {A=[Alice, Andrea, Albert], B=[Bob, Beth], C=[Charlie], D=[David]}

        //alternative solution: do the whole thing in one for loop by adding if statement
        nameMap = new HashMap<>();
        //wipes old nameMap

        for (String name : names) {
            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            ArrayList<String> arr = nameMap.get(firstLetterStr);

            //will return null if not in there
            if(arr == null) {
                //create new array list
                arr = new ArrayList<>();
                //add name
                arr.add(name);
                //add to HashMap
                nameMap.put(firstLetterStr, arr);
            }
            else {
                arr.add(name);
            }
        }
           //System.out.println(nameMap);
        //Results:   {A=[Alice, Andrea, Albert], B=[Bob, Beth], C=[Charlie], D=[David]}
    }
}
