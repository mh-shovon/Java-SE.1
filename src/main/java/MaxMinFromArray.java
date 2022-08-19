public class MaxMinFromArray {
    public static void main(String[] args) {
        int[] number = {2,5,6,9,9,5,4,8,93,45};

        int maxNumber = findMax(number);
        System.out.println("Max number is: " + maxNumber);

        int minNumber = findMin(number);
        System.out.println("Min number is: " + minNumber);
    }
    public static int findMax(int[] numbers){
        int max = numbers[0];
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMin(int[] numbers){
        int min = numbers[0];
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}
