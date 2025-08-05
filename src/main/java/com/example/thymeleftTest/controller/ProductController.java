package com.example.thymeleftTest.controller;

import com.example.thymeleftTest.dto.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @GetMapping("infoPrint")
    public String productInfoPrint(Model model) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("콜라", 1000, 10));
        productList.add(new Product("사이다", 1200, 7));
        model.addAttribute("list", productList);

        return "/product/product_info";
    }
}


