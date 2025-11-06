// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // Declares an int variable, and sets it to 1
       
        // Complete the program's code here:
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int total = Integer.parseInt(args[3]);
        double bill = (total / 3.0);
        double per = Math.ceil(bill);
        System.out.println("Dear " + name3 + ", " + name2 + ", " + name1 + ": pay " + per + " Shekels each");




    }
}
