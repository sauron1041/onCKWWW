package com.vn.edu.iuh.fit.onckspring.backend.services;

import com.vn.edu.iuh.fit.onckspring.backend.models.LoaiSanPham;
import com.vn.edu.iuh.fit.onckspring.backend.repositories.LoaiSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiSanPhamService {
    @Autowired
    private LoaiSanPhamRepository loaiSanPhamRepository;

    public List<LoaiSanPham> getAll(){
        return loaiSanPhamRepository.findAll();
    }
    public LoaiSanPham getLoaiTheoId(long id){
        return loaiSanPhamRepository.findById(id).get();
    }
}
