public class CountNotes {
    public static void main(String[] args) {
        int amount = 26587;
        countNotes(amount);
    }

    public static void countNotes(int amount){
         int[] notes = {1000,500,100,50,20,10,5,2};
         int[] notesCounter = new int[8];

        for(int i = 0; i < notes.length; i++){
            if (amount >= notes[i]){
                notesCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        System.out.println("Notes Count ===> ");
        for(int i= 0; i < 8; i++){
            if(notesCounter[i] != 0){
                System.out.println(notes[i] + " : "
                        + notesCounter[i]);
            }
        }
    }
}
