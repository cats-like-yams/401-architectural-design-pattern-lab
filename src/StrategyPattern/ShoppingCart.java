package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> items = new ArrayList<>();
    private PaymentStrategy strategy;

    public void addItem(double price){
        items.add(price);
    }

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void checkout(){
        double total = items.stream().mapToDouble(Double::doubleValue).sum();
        if (strategy == null){
            throw new IllegalStateException("Payment strategy not set");
        }
        strategy.pay(total);
    }
}
