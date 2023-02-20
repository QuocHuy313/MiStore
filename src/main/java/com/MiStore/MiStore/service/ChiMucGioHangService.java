package com.MiStore.MiStore.service;

import com.MiStore.MiStore.entities.ChiMucGioHang;
import com.MiStore.MiStore.entities.GioHang;
import com.MiStore.MiStore.entities.SanPham;

import java.util.List;

public interface ChiMucGioHangService{
	
	List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g);
	
	ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp, GioHang g);
	
	ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c);
	
	void deleteChiMucGiohang(ChiMucGioHang c);
	
	void deleteAllChiMucGiohang(List<ChiMucGioHang> c);
	
}
