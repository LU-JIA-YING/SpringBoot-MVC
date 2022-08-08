package com.practice.Service;

import com.practice.Model.Meal;
import com.practice.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {
    List<Meal> mealList ;


    public MealService(List<Meal> mealList) {
        this.mealList=new ArrayList<>();
        this.mealList.add(new Meal("hamburger", 120, "This is delicious"));
    }

    public Meal getMealByName(String name) {
        for(int i = 0; i < this.mealList.size(); i++) {
            if ((this.mealList.get(i)).getName().toLowerCase().equals(name.toLowerCase())) {
                return this.mealList.get(i);
            }
        }
        return null;
    }
}
