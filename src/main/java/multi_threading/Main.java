package multi_threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // multithreading =    Process of executing multiple thread simulateously
        //                     Helps maximum utilization of CPU
        //                     Thread are independent, they don't affect thr execution of other threads.
        //                     an exception in one thread will not interrupt other threads
        //                     useful for serving multiple clients, multiplayer games, or other mutually independent tasks

        // Create a subclass of Thread
        Mythread thread1 = new Mythread();

        //or

        //implement Runnable interface and pass instance as an argument to Thread()
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        // thread1.join(3000);  //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
        thread2.start();

//      System.out.println(1/0);
    }
}
