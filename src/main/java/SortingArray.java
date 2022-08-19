import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int num[] = {6,8,1,4,9,2};

        System.out.println("Print the Array in Ascending order: ");
        doSortAscending(num);

        System.out.println("Print the Array in Descending order: ");
        doSortDescending(num);
    }

    public static void doSortAscending(int[] numbers){
        Arrays.sort(numbers);
        for(int number: numbers){
            System.out.println(number);
        }
    }

    public static void doSortDescending(int[]numbers){
        Arrays.sort(numbers);
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
