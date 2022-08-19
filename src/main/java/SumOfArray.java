public class SumOfArray {
    public static void main(String[] args) {
        int numbers[] = {2,5,7,8,45,30,45,78,55,49,44};
        int sum = 0;
        for(int i = 0; i< numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("Sum is : " + sum);

        // Using For Each Loop
        int[] number = {10,22,55,4,89,78,9,87,63,54,66,44,52};
        int sum1 = 0;
        for (int num: number){
            sum1 = sum1 + num;
        }
        System.out.println("Sum is : " + sum1);
    }
}
