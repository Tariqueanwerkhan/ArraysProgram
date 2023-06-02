import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(233);
        list.add(133);
        list.add(33);
        list.add(79);
        list.add(23);
        list.add(200);
        list.add(301);

        //System.out.println(list.contains(9087));
        System.out.println(list);
        list.set(0, 99);
        list.remove(2);
        System.out.println(list);
    }
}
