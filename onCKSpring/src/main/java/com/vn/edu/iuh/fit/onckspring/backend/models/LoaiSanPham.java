package com.vn.edu.iuh.fit.onckspring.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "loai_san_pham")
public class LoaiSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String tenLoaiSanPham;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenLoaiSanPham() {
        return tenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" +
                "id=" + id +
                ", tenLoaiSanPham='" + tenLoaiSanPham + '\'' +
                '}';
    }
}
