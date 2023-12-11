package com.vn.edu.iuh.fit.onckspring.fontend.controllers;

import com.vn.edu.iuh.fit.onckspring.backend.models.LoaiSanPham;
import com.vn.edu.iuh.fit.onckspring.backend.services.LoaiSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoaiSanPhamController {
    @Autowired
    private LoaiSanPhamService loaiSanPhamService;
    @GetMapping("/getListLoaiSanPham")
    public List<LoaiSanPham> getListLoaiSanPham(){
        return  loaiSanPhamService.getAll();
    }
}
