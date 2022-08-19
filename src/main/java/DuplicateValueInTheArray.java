public class DuplicateValueInTheArray {
    public static void main(String[] args) {
        int num[] = {6,8,1,4,8,9,9,2};
        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[i] == num[j]){
                    System.out.println(num[i]);
                }
            }
        }
    }
}
