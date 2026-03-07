import java.util.Scanner;

public class alternate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a string:");
        // String input = sc.nextLine();
        int size=sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        for(int i=0;i<size;i++){
            String s=sc.nextLine();
            if(i<size-1)
                sb.append(s+",");
            else
                sb.append(s);
        }
    System.out.println(sb.toString());
    }
    //     for(int i=0;i<sb.length();i++) {
    //         char ch = sb.charAt(i);
    //         if(i % 2 == 0)   // even index -> uppercase
    //             sb.setCharAt(i, Character.toUpperCase(ch));
    //         else             // odd index -> lowercase
    //             sb.setCharAt(i, Character.toLowerCase(ch));
    //     }

    //     System.out.println(sb);
    // }
}                      