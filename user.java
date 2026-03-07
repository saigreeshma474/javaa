import java.util.Scanner;
public class user {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int array[][]=new int[4][4];
        int new_arr[][]=new int[3][];
        new_arr[0]=new int[2];
        new_arr[1]=new int[6];
        new_arr[2]=new int[3];
        for(int i=0;i<new_arr.length;i++){
            for(int j=0;j<new_arr[i].length;j++)
                new_arr[i][j]=sc.nextInt();
        }
    }
     for(int i=0;i<new_arr.length;i++){
            for(int j=0;j<new_arr[i].length;j++)
                System.out.println(new_arr[i][j]+" ");
        }
        System.out.println();
    }



            // int value=sc.nextInt();
        //     new_arr[i]=new int[value];
        // }
        // System.out.println(new_arr[0].length);
        // System.out.println(new_arr[0].length);
        // System.out.println(new_arr[0].length);

        // bye:
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<5;j++){
        //         if(i==1)
        //         continue bye;
        //         System.out.println(i);
        //     }
        // }

        // int num=0;
        // int sum=0;
        // do{
        //     num=sc.nextInt();
        //     sum+=num;
        // }while(num!=0);
        // System.out.println(sum);
        // }
        
        // for(;true;){
        //     num=sc.nextInt();
        //     if(num==10){
        //         System.out.println("you got it...");
        //         break;
        //     }
        // }

    

