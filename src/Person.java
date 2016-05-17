/**
 * Created by user on 5/16/16.
 */
public class Person {
    static int familySize = 10;
    String name;
    int age;
    boolean isAlive;
    //create Person Array in Person class- self referntial

    Person[] family = new Person[familySize];

    public Person(String name, int age, boolean isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
    }

  /*  public boolean isValidName(String newName){
        return newName.contains(" ");
    }
*/
}