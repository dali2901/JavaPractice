import java.util.Arrays;
import java.util.List;

public class Try01 {


    public static void main(String[] args) {
        List<Person> person = Arrays.asList(
                new Person("Eddie", "Peng", "I don't know", 0),
                new Person("Bill", "Gates", "1999/10/28", 21),
                new Person("Jobs", "Steve", "1996/02/24", 24),
                new Person("May", "Frank", "1976/09/12", 44),
                new Person("Judy", "James", "1978/12/24", 42),
                new Person("Ben", "Friend", "1995/02/10", 25),
                new Person("Jobs", "Yang", "1997/01/22", 23));

        // 如果今天我想要在人名中間加一個"-"會比較方便表示的話，stream就是一個很好的方法。
        person.forEach(x -> System.out.println(x.firstName + "-" + x.lastName + " " + x.birthday));
    }
}

//請幫我在Main外層加一個class這樣會比較好解釋Java stream 的厲害之處
//以下為Person的code
class Person
{
    String firstName;
    String lastName;
    String birthday;
    int age;

    Person(String firstName, String lastName, String birthday, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = lastName;
        this.age = age;
    }
    //這個對之後要印出東西，會有幫助，所以請留著他。
    public String toString ()
    {
        return new StringBuilder(getFirstName()).append("-")
                .append(getLastName()).toString();
    }
    String getFirstName() { return firstName; }
    String getLastName() { return  lastName; }
    String getBirthday() { return birthday; }
    int getAge() { return age; }

}
