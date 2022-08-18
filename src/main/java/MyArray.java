public class MyArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 20;
        arr[4] = 30;
        System.out.println(arr[4]);

        String[] Name = new String[50];
        Name[0] = "Mehedi";
        Name[1] = "Hasan";
        Name[2] = "Shovon";
        System.out.println(Name[0] + Name[1] + Name[2]);

        String[] name = new String[]{"Mehedi", "Hasan", "Shovon"};
        //String name[]={"Mehedi", "Hasan", "Shovon"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println(name.length);

        String fruits[] = {"Mango", "Banana", "Litchi", "Jackfruit", "Pineapple"};
        for (int j = 0; j < fruits.length; j++) {
            System.out.println("I like to eat " + fruits[j]);
        }
    }
}
