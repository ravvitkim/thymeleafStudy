package com.example.thymeleftTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
//request안쓰면 get안에 admin넣어야함
public class AdminController {
    @GetMapping("/info")
    public String adminInfo() {
        return "/admin/info";
    }
    @GetMapping("/report")
    public String adminReport() {
        return "/admin/report";
    }
}
