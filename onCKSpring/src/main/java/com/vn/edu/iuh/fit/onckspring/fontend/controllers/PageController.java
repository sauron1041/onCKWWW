package com.vn.edu.iuh.fit.onckspring.fontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {
    @GetMapping("/my-home")
    public String myHome(){
        return "home";
    }
    @GetMapping("/quanLySanPham")
    public String quanLySanPham(){
        return "admin/QuanLySanPham";
    }

    @GetMapping("/hienThiSanPham")
    public String hienThiSanPham(@RequestParam long id){
        return "user/HienThiSanPham";
    }

    @GetMapping("/capNhatSanPham")
    public String capNhatSanPham(@RequestParam long id){
        return "admin/CapNhatSanPham";
    }


}
