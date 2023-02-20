package com.MiStore.MiStore.service;

import com.MiStore.MiStore.entities.GioHang;
import com.MiStore.MiStore.entities.NguoiDung;

public interface GioHangService {
	
	GioHang getGioHangByNguoiDung(NguoiDung n);
	
	GioHang save(GioHang g);
}
