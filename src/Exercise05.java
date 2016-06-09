import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 6/9/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob", "Albert"};
        ArrayList<String> sortedNames = new ArrayList<>();
        /*
        int index=0;

        for (String name:names
             ) {

            float value = names[index].compareTo(names[index + 1]);
            if (!(value > 0)){
                String temp;
                name[index] = temp;
            }



            for(String name:names){

            }
*/
        //Zach's solution

        for (String name:names) {
            int index = 0;
            for (String sortedName: sortedNames){
                if (name.compareTo(sortedName) > 0){
                    index++;
                }
                else{
                    break;
                }
            }
            sortedNames.add(index,name);
        }

        System.out.println(sortedNames);
        }

    }

