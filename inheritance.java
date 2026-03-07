
     class Animal{
        void speak(){
            System.out.println("animal makes a sound");
        }
     }
     class Dog extends Animal{
       
        void speak(){
            super.speak();
            System.out.println("dog barks");
        }
}
class inheritance{
    public static void main(String[] args){
     
        Dog ob=new Dog();
        ob.speak();
       
     }
}


