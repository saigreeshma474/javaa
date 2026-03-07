class A{
        void speak(int i){
            System.out.println("class a int i");
        }
        void speak(double d){
            System.out.println("class a double b");
        }
     }
     class b extends A{
       @Override
        void speak(int i){
            System.out.println("class b int i");
        }
}
class method{
    public static void main(String[] args){
        b ob=new b();
        ob.speak(10);
    
     }
}