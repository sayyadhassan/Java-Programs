package Java_8_Features;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Person{
    int id;
    String name;
    List<String> items;

    Person(int id,String name,List<String> items){
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public  List<String> getItems() {
        return items;
    }
}
public class Question02_Stream_flatMap {
    public static void main(String main[]) {
        Person p = new Person(202, "Javed", Arrays.asList("Sports", "Grocery"));
        Person p2 = new Person(203, "Kamlesh", Arrays.asList("Men Coths", "Women Colthes"));
        Person p3 = new Person(204, "Majid", Arrays.asList("Steels", "Food"));

        List<Person> list = Arrays.asList(p, p2, p3);
//        Can't we use 'Method Refrence' in map() method because 'getItems method' is not static here
//        List<String> newList = list.stream().map(Person::getItems).flatMap(Collection::stream).collect(Collectors.toList());
//        List<String> newList = list.stream().map(Person -> Person.getItems()).flatMap(Collection::stream).collect(Collectors.toList());
//        System.out.println(newList);

                       //  OR
        List<Person> list2 = Arrays.asList(p,p2,p3);
        list2.stream().map(Person :: getItems).flatMap(Collection::stream).forEach(e-> System.out.println(e));
                                      // OR
        list2.stream().map(e-> e.getItems()).flatMap(Collection::stream).forEach(e-> System.out.println(e));
    }
}


// Map() method : If we have Collection or List of similar type elements and want to transform or perform
//                    operation on each element then there we can use it.

//flatMap() method : If we have Collection or List of user define objects and

