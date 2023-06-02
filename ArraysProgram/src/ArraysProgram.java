public class ArraysProgram {
    public static void main(String[] args) {
        //Q: store  a roll number
        int a = 2918;

        //Q: store a person's name
        String name="Tarique Anwer khan";

        //Q: store 5 roll numbers.
        int rol1=23;
        int roll2=21;
        int roll3=10;

        //syntax
        //datatype[] variable_name = new datatype[size];
        //store 5 roll number:
        int[] rnos = new int[5];
        //or directly
        int[] rnos2 = {23, 32, 12, 11, 29};

        int[] ros; //declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // actually here object is being created in the heap memory.

        //System.out.println(ros[2]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}
