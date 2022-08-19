public class PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        int numbers[] = {2,5,7,8,45,30,45,78,55,49,44};

        for(int i = 0; i< numbers.length; i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i] + " is an even numnber");
            }
        }

        //Using for each loop
        int[]  numbers1 = {2,5,7,8,45,30,45,78,55,49,44};
        for( int number: numbers1){
            if(number % 2 == 0){
                System.out.println(number + " is a even number ");
            }
        }
    }
}