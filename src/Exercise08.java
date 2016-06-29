import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 6/29/16.
 */
public class Exercise08 {
    public static void main(String[] args) throws FileNotFoundException {

        //parse people.csv into ArrayList<String> first and last names separated by space
        //prompt the user for search term
        //print out the names returned

        File f =  new File("people.csv");
        Scanner scanner = new Scanner(f);
        ArrayList<String> names= new ArrayList<>();
        scanner.nextLine();
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] lineFields = line.split(",");
            String firstName = lineFields[1];
            String lastName = lineFields[2];
            names.add(firstName + " " + lastName);
        }

        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Enter a search term");
        String term = consoleScanner.nextLine();

        ArrayList<String> results = new ArrayList<>();
        for (String name:names) {
            if (name.contains(term)){
                results.add(name);
            }
        }

        System.out.println(results);

    }
}
//Streams solution
/*
names.streat()
.map(name -> name.toLowerCase())
.filter(name -> name.contains(term))
.forEach(System.out::println);
 */