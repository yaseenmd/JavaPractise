public class Main {

    public static void main(String args[])
    {
             Runnable runnable = new Runnable() {
                 @Override
                 public void run() {
                     String name = Thread.currentThread().getName();
                     System.out.println("Thread Name :" +name);
                 }
             };

             Thread thread = new Thread(runnable);
             thread.start();

             //Output: Thread Name :Thread-0
    }
}
