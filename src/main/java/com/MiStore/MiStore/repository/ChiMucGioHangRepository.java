package com.MiStore.MiStore.repository;

import com.MiStore.MiStore.entities.ChiMucGioHang;
import com.MiStore.MiStore.entities.GioHang;
import com.MiStore.MiStore.entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChiMucGioHangRepository extends JpaRepository<ChiMucGioHang, Long>{
	
	ChiMucGioHang findBySanPhamAndGioHang(SanPham sp, GioHang g);
	
	List<ChiMucGioHang> findByGioHang(GioHang g);
}
