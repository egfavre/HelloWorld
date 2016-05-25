import java.util.Arrays;

/**
 * Created by user on 5/16/16.
 */
public class Person {
    static final int familySize = 10;
    String name;
    int age;
    boolean isAlive;
    //create Person Array in Person class- self referntial

    Person[] family = new Person[familySize];

    public Person(){

    }

    public static int getFamilySize() {
        return familySize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    public Person(String name, int age, boolean isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", family=" + Arrays.toString(family) +
                '}';
    }

    /*  public boolean isValidName(String newName){
        return newName.contains(" ");
    }
*/
}