class Service{
    static void Process(Task t){
        System.out.println(t);

    }
}
class Task extends Service{
    static  Task o=new Task();  //Reference variable as static
    static void start(){
        Service.Process(o); //passing Task object address
    }
}
public class argument {
    public static void main(String[] args) {
        Task.start();  //calling static start method
    }
}