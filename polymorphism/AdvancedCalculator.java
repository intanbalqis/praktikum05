// Method Overriding
public class AdvancedCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        System.out.println("Menggunakan metode add() yang dioverride di AdvancedCalculator");
        return super.add(a, b);
    }
}

