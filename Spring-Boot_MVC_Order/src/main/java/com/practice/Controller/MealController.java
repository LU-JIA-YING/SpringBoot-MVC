package com.practice.Controller;

import com.practice.Model.Meal;
import com.practice.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"/meal"})
public class MealController {
    @Autowired
    MealService mealService;

    @GetMapping
    public String getMealByName(@RequestParam String name, Model model) {
        Meal meal = this.mealService.getMealByName(name);
        model.addAttribute("meal", meal);
        // return值必須和html的檔名相同，
        // 如 file 的名稱為 user.html 時， return 值為 "user"
        return "Meal";
    }
}
