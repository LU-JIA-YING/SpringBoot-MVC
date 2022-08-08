package com.practice.Service;

import com.practice.Model.Meal;
import com.practice.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    List<Order> orderList = new ArrayList<>();

    public OrderService() {
        List<Meal> mealList1 = new ArrayList();
        mealList1.add(new Meal("hamburger", 120, "This is delicious"));
        mealList1.add(new Meal("ice cream", 50, "YM~YM~"));


        List<Meal> mealList2 = new ArrayList();
        mealList2.add(new Meal("rice", 50, "QQ"));
        mealList2.add(new Meal("ice cream", 50, "YM~YM~"));

        this.orderList.add(new Order(1, "Joey", mealList1));
        this.orderList.add(new Order(2, "Maggie", mealList2));
    }

    public Order getOrderBySeq(int seq) {
        for (int i = 0; i < this.orderList.size(); i++) {
            if (this.orderList.get(i).getSeq() == seq) {
                return this.orderList.get(i);
            }
        }
        return null;
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < this.orderList.size(); i++) {
            total += this.orderList.get(i).getTotalPrice();
        }
        return total;
    }

    //取得order資訊
    public List<Order> getOrderList(){
        return this.orderList;
    }
}
