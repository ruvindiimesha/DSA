import java.util.Collection;
import java.util.LinkedList;

public class CollectionPractical1 {

    public static void main(String[] args) {
        Collection<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Empty? " + numbers.isEmpty());
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 30? " + numbers.contains(30));

        numbers.remove(20);

        System.out.println("After removal: " + numbers);
    }
}
