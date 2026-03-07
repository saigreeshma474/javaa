import java.util.Scanner;
class box{
    int l,w,h;
    box(){
        l=w=h=1;
    }
    box(int l,int w,int h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    void display(){
        System.out.println("box:"+l+"*"+w+"*"+h);
    }
    }
class constructor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        box b=new box();
        box b1=new box(5,6,7);
        b.display();
        b1.display();

    
}
}