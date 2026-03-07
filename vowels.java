import java.util.Scanner;
public class vowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                String s = sc.nextLine();
                StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {

                str.deleteCharAt(i);
                i--;   // adjust index after deletion
            }
        }

        System.out.println(str);
    }
}
