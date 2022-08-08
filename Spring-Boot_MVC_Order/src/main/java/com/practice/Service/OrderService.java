package com.practice.Service;

import com.practice.Model.Meal;
import com.practice.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    List<Meal> mealList = new ArrayList();
    List<Order> orderList = new ArrayList<>();

    public OrderService(){
        this.mealList.add(new Meal("hamburger", 120, "This is delicious"));
        this.mealList.add(new Meal("ice cream", 50, "YM~YM~"));

        this.orderList.add(new Order("1", 400, "Joey", this.mealList));
        this.orderList.add(new Order("2", 1000, "Maggie", this.mealList));
    }
    public Order getOrderBySeq(String seq) {
        for(int i = 0; i < this.orderList.size(); i++) {
            if ((this.orderList.get(i)).getSeq().equals(seq)) {
                return this.orderList.get(i);
            }
        }
        return null;
    }

//    public Order getOrderBySeq(String seq) {
//
//        for (Order order : this.orderList) {
//            if (order.getSeq().equals(seq)) {
//                return order;
//            }
//        }
//        return null;
//    }

    public int getTotal() {
        int total=0;

        for(int i = 0; i < this.orderList.size(); i++){
            total += this.orderList.get(i).getTotalPrice();
        }
        return total;
    }

    //取得order資訊
    public List<Order> getOrderList(){
        return this.orderList;
    }
}
