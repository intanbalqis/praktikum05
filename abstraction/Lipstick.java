package abstraction;
// Lipstick extends Makeup (abstract class) dan implements Skincare (interface)
public class Lipstick extends Makeup implements Skincare {
    private String color;

    public Lipstick(String brand, String color) {
        super(brand);
        this.color = color;
    }

    @Override
    public void apply() {
        System.out.println("Mengaplikasikan lipstick warna " + color + " dari " + brand);
    }

    @Override
    public void skincareRoutine() {
        System.out.println("Gunakan lip balm sebelum memakai lipstick agar bibir tetap sehat.");
    }
}
