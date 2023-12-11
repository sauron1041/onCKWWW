package com.vn.edu.iuh.fit.onckspring.backend.repositories;

import com.vn.edu.iuh.fit.onckspring.backend.models.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
}
