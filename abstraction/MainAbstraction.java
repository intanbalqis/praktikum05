package abstraction;
public class MainAbstraction {
    public static void main(String[] args) {
        Lipstick lip = new Lipstick("Maybelline", "Red Velvet");
        lip.info();            // dari abstract class
        lip.apply();           // implementasi abstract method
        lip.skincareRoutine(); // dari interface
    }
}
