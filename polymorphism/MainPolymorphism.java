public class MainPolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Overloading 2 parameter: " + calc.add(5, 10));
        System.out.println("Overloading 3 parameter: " + calc.add(5, 10, 15));

        Calculator advCalc = new AdvancedCalculator(); // Polymorphism
        System.out.println("Overriding method: " + advCalc.add(7, 8));
    }
}
