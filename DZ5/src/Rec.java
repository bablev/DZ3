public class Rec {
    public static int recursion(int A, int B) {
        if (A == B) {
            System.out.println(A);
            return 0;
        }
        else if (A < B) {
            System.out.println(A);
            return recursion(A + 1, B);
        }
        else {
            System.out.println(A);
            return recursion(A-1, B);
        }
    }


    public static void main(String[] args){
        recursion(5,1);
    }
}
