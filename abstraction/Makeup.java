// Abstract Class
package abstraction;
public abstract class Makeup {
    protected String brand;

    public Makeup(String brand) {
        this.brand = brand;
    }

    // Abstract method → harus diimplementasikan oleh subclass
    public abstract void apply();

    // Concrete method → bisa langsung digunakan
    public void info() {
        System.out.println("Produk makeup dari brand: " + brand);
    }
}

