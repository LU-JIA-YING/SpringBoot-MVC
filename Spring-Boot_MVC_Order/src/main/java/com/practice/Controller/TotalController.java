package com.practice.Controller;

import com.practice.Model.Order;
import com.practice.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"/order"})
public class TotalController {
    @Autowired
    OrderService orderService;

    @GetMapping({"/total"})
    public String getTotal(Model model){
        int total =this.orderService.getTotal();
        model.addAttribute("total", total);

        //取得order資訊
        List<Order> orderList = this.orderService.getOrderList();
        model.addAttribute("orderList",orderList);

        return "Total";
    }


}
