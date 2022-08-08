package com.practice.Service;

import com.practice.Model.Meal;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {
    List<Meal> mealList;


    public MealService(List<Meal> mealList) {
        this.mealList = new ArrayList<>(); //配置物件空間
        this.mealList.add(new Meal("hamburger", 120, "This is delicious"));
    }

    public Meal getMealByName(@NotNull String name) {
        //java bean validation @NotNull
        for (int i = 0; i < this.mealList.size(); i++) {
            //equals 要確認前面的不能是null會變成nullPointException
            if ((this.mealList.get(i)).getName().toLowerCase().equals(name.toLowerCase())) {
                return this.mealList.get(i);
            }
        }
        return null; //應該回傳not found exception
    }
}
