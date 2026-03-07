import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String original = sc.nextLine();

        // create StringBuilder from original string
        StringBuilder sb = new StringBuilder(original);

        // reverse using StringBuilder
        sb.reverse();

        // convert reversed StringBuilder to String
        String reversed = sb.toString();

        // compare
        if(original.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
