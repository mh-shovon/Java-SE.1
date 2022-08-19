import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Litchi");
        fruits.add("Jackfruit");
        fruits.add("Guava");
        System.out.println(fruits);

        String[] arr= fruits.toArray(new String[0]); //converting arraylist to array
        System.out.println(arr.length);
        System.out.println(arr[0]);
    }
}
