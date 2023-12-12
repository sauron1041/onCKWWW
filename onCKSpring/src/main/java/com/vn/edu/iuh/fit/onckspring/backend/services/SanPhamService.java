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

    public void add(String name, long loaiId, double donGia) {
        LoaiSanPham loaiSanPham= loaiSanPhamService.getLoaiTheoId(loaiId);
        SanPham newProduct= new SanPham(name, donGia, loaiSanPham);
        sanPhamRepository.save(newProduct);
    }

    public SanPham getById(long id) {
        return sanPhamRepository.findById(id).get();
    }

    public void update(long id, String name, long loaiId, double donGia) {
        if(sanPhamRepository.existsById(id)){
            SanPham product= sanPhamRepository.findById(id).get();
            LoaiSanPham loaiSanPham= loaiSanPhamService.getLoaiTheoId(loaiId);
            //Set new data

            product.setTenSanPham(name);
            product.setLoaiSanPham(loaiSanPham);
            product.setDonGia(donGia);
            //Save product

            sanPhamRepository.save(product);
        }
    }
}
