@FunctionalInterface
interface DiscountCalculator {

    
    double calculate(double price);
}

public class DiscountDemo {
    public static void main(String[] args) {

        
        DiscountCalculator discount10 = price -> price - (price * 0.10); 

        
        DiscountCalculator discount25 = price -> price - (price * 0.25);
        

        double price = 100;

        
        System.out.println("Final price after 10% discount: " + discount10.calculate(price));

        
        System.out.println("Final price after 25% discount: " + discount25.calculate(price));
    }
}