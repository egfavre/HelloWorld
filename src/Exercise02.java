import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 5/26/16.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Message e1 = new Message("Hi", "", "alice@theironyard.com");
        Message e2 = new Message("Hi", "", "bob@theironyard.com");
        Message e3 = new Message("Hi", "", "charlie@theironyard.com");
        Message e4 = new Message("Hi", "", "alice@theironyard.com");
        Message e5 = new Message("Hi", "", "bob@theironyard.com");

    //hashmap organizing the emails by destination
        //"alice@ --> [e1, e4]
        //bob@ --> [e2, e5]
        //charlie -> [e3]

        //start with array primitive

        Message[] emails = {e1, e2, e3, e4, e5};
        //need to loop over arrayt to build HashMap

                          /*  ArrayList<Message> aliceEmails = new ArrayList<Message>();
                            ArrayList<Message> bobEmails = new ArrayList<Message>();
                            ArrayList<Message> charlieEmails = new ArrayList<Message>();

                    */
                            HashMap<String, ArrayList<Message>> map = new HashMap<>();
                           /* for (Message.destination.startsWith("alice")){
                                aliceEmails.set(0,)
*/

      /*  for(Message message : emails) {
            ArrayList<Message> arr = map.get(Message.destination);
            if (arr == null) {
                arr = new ArrayList<>();
                arr.add(message);
                map.put(Message.destination, arr);
            }
            else {
                arr.add(message);


            }

            //if (!map.containsKey(Message.destination)){
        }
        System.out.println(map);

*/
        map = new HashMap<>();
        for (Message message : emails) {
            if (!map.containsKey(Message.destination)){
                map.put(Message.destination, new ArrayList<>());
            }
            ArrayList<Message> arr = map.get(Message.destination);
            arr.add(message);
        }
        System.out.println(map);

    }


}