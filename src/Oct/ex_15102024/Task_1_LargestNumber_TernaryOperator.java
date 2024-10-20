package Oct.ex_15102024;

public class Task_1_LargestNumber_TernaryOperator {
    public static void main(String[] args) {

 //       result= condition ? expression 1 : expression 2

        int x=105;
        int y=665;
        int z=534;

        int Max_num= x>y && x> z ? x : (y > z ? y :z);
        System.out.println("The maximum number="+ Max_num);

    }
}
