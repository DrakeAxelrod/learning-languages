import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<Person> people = List.of(
                new Person("Bob", "310-748-3985", 38, Gender.MALE),
                new Person("Karl", "310-783-1234", 18, Gender.MALE),
                new Person("Axel", "310-458-9235", 100, Gender.MALE),
                new Person("Vernita", "310-646-5735", 51, Gender.FEMALE)
        );
    }



    static class Person
    {
        private static int age;
        private final String name;
        private final String number;
        private final Gender gender;

        public Person(String name, String number, int age, Gender gender) {
            this.name = name;
            this.number = number;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getNumber() {
            return number;
        }

        public static int getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", number='" + number + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    enum Gender
    {
        MALE, FEMALE
    }
}
