public class FIndElementInArray {
    public static void main(String[] args) {
        int[] Array = new int[]{1, 2, 3, 4, 5};
        boolean found = false;
        int searchedValue = 6;

        for(int x : Array){
            if(x == searchedValue){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Found the element in the array");
        }else{
            System.out.println("Not found");
        }
    }
}
