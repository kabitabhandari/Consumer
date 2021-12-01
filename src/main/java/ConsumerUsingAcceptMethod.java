import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerUsingAcceptMethod {

    public static void main(String args[])
    {
        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);

        // Implement display using accept()
        display.accept(10);

        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer>> modify = list -> {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        // Consumer to display a list of numbers
        Consumer<List<Integer>> displayList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(11);
        list.add(3);

        // Implement modify using accept()
        modify.accept(list);

        // Implement displayList using accept()
        displayList.accept(list);


        modify.andThen(displayList).accept(list);
    }
}
