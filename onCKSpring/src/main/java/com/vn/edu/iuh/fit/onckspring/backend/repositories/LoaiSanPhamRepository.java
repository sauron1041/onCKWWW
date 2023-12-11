package com.vn.edu.iuh.fit.onckspring.backend.repositories;

import com.vn.edu.iuh.fit.onckspring.backend.models.LoaiSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiSanPhamRepository extends JpaRepository<LoaiSanPham, Long> {
}
