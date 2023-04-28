class License extends Thread
{
    public void run()
    {
        System.out.println("License work started  of "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("License work completed of "+Thread.currentThread().getName());
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
//      License license = new License();
        License customer1 = new License();
        customer1.start();
        customer1.setName("Hinal");
        customer1.join();
        License customer2 = new License();
        customer2.start();
        customer2.setName("Pinal");
        License customer3 = new License();
        customer3.start();
        customer3.setName("Mitansh");
    }
}