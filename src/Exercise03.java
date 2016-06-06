import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by user on 6/6/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "fred", "george", "henry", "issac", "jack", "andrew"};

        ArrayList<String> capNameArray = new ArrayList<>();

        //ArrayList of strings that contains the names with only caiptal letters
//        for (String name:names) {
//            String nameCap = name.toUpperCase();
//            capNameArray.add(nameCap);
//        }

        //remove names that don't start with "a"
        /*What I did threw an error
        for (String name:capNameArray) {
            if (!name.startsWith("a")){
                capNameArray.remove(name);
            }

        }*/

        //solutions 1:
//        for (int i = 0; i < capNameArray.size(); i++){
//            String name = capNameArray.get(i);
//            if (!name.startsWith("a")){
//                capNameArray.remove(i);
//                i--;
//            }
//        }

//        //solution 2:
//        ArrayList<String> tempNames = new ArrayList<>()>;
//        for (String name: capNameArray){
//            if (name.startsWith("a")){
//                tempNames.add(name);
//            }
//        }

        //solutino 3: use iterator
//        capNameArray = new ArrayList<>();
//        for (String name:names){
//            capNameArray.add(name.toUpperCase());
//        }
//        Iterator<String> iter = capNameArray.iterator();
//        while (iter.hasNext()){
//            String name = iter.next();
//            if(!name.startsWith("a")){
//                iter.remove();
//            }
//        }

        //solution 4: lambdas
        ArrayList<String> newNames = new ArrayList<>();
        for (String name:names) {
            newNames.add(name);
        }
        newNames = newNames.stream()
                .map((name -> {
                    return name.toUpperCase();
                }))
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        //can also run .parallelStream to improve speed during large collection overwriting

        System.out.println(newNames);
    }
}
