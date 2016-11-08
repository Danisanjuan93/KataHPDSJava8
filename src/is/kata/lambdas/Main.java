package is.kata.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Carlos", 20));
        persons.add(new Person("Ana", 23));
        persons.add(new Person("Juan", 18));
        persons.add(new Person("Daniel", 24));

        Person eldestPerson = persons.stream().max(byAge()).get();
        Person youngestPerson = persons.stream().min(byAge()).get();
        List<Integer> list = persons.stream().map(Person::getAge).collect(Collectors.toList());
        List<Integer> lists = persons.parallelStream().map(Person::getAge).filter(person->person<24).collect(Collectors.toList());
        Integer value = persons.parallelStream().map(Person::getAge).filter(person->person<24).reduce(average()).get();
        double val = persons.stream().mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(eldestPerson.getName());
        System.out.println(youngestPerson.getName());
        System.out.println(val);
    }

    private static BinaryOperator<Integer> average() {
        return (accumulated, value) -> accumulated + value;

    }

    private static Comparator<Person> byAge() {
        return (o1, o2) -> o1.getAge() - o2.getAge();
    }


    // ABC programacion funcional MAC FILTER REDUCE
}
