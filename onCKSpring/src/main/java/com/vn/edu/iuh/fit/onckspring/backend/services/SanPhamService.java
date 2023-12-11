package com.vn.edu.iuh.fit.onckspring.backend.services;

import com.vn.edu.iuh.fit.onckspring.backend.models.LoaiSanPham;
import com.vn.edu.iuh.fit.onckspring.backend.models.SanPham;
import com.vn.edu.iuh.fit.onckspring.backend.repositories.LoaiSanPhamRepository;
import com.vn.edu.iuh.fit.onckspring.backend.repositories.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;
    @Autowired
    private LoaiSanPhamService loaiSanPhamService;

    public List<SanPham> getSanPhamTheoLoai(long id){
        List<SanPham> listAll= sanPhamRepository.findAll();
        LoaiSanPham loaiSanPham= loaiSanPhamService.getLoaiTheoId(id);
        List<SanPham> listTheoLoai= new ArrayList<SanPham>();
        for (SanPham item: listAll) {
            if(item.getLoaiSanPham()==loaiSanPham)
                listTheoLoai.add(item);
        }
        return listTheoLoai;
    }

    public List<SanPham> getAll(){
        return sanPhamRepository.findAll();
    }
    public void delete(long id){
        sanPhamRepository.deleteById(id);
    }
}
