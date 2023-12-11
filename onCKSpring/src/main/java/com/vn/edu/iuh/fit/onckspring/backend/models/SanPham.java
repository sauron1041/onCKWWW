package com.vn.edu.iuh.fit.onckspring.backend.models;

import jakarta.persistence.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String tenSanPham;
    @Column(nullable = false)
    private double donGia;
    @ManyToOne
    @JoinColumn(name = "loai_id")
    private LoaiSanPham loaiSanPham;

    public SanPham() {
    }

    public SanPham(String tenSanPham, double donGia, LoaiSanPham loaiSanPham) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.loaiSanPham = loaiSanPham;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public LoaiSanPham getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", donGia=" + donGia +
                ", loaiSanPham=" + loaiSanPham +
                '}';
    }
}
