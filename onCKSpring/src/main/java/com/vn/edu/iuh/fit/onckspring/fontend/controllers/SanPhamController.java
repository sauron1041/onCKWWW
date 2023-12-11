package com.vn.edu.iuh.fit.onckspring.fontend.controllers;

import com.vn.edu.iuh.fit.onckspring.backend.models.SanPham;
import com.vn.edu.iuh.fit.onckspring.backend.services.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("/getListSanPhamTheoLoai")
    public List<SanPham> getListSanPhamTheoLoai(@RequestParam long id){
        return sanPhamService.getSanPhamTheoLoai(id);
    }

    @GetMapping("/getListSanPham")
    public List<SanPham> getListSanPham(){
        return sanPhamService.getAll();
    }

    @PostMapping ("/deleteProduct")
    public void xoaSanPham(@RequestParam long id){
        sanPhamService.delete(id);
    }
}
