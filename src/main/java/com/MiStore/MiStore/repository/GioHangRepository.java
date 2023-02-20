package com.MiStore.MiStore.repository;

import com.MiStore.MiStore.entities.GioHang;
import com.MiStore.MiStore.entities.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GioHangRepository extends JpaRepository<GioHang, Long>{
	
	GioHang findByNguoiDung(NguoiDung n);
	
}
