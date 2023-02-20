package com.MiStore.MiStore.service.impl;

import com.MiStore.MiStore.entities.ChiMucGioHang;
import com.MiStore.MiStore.entities.GioHang;
import com.MiStore.MiStore.entities.SanPham;
import com.MiStore.MiStore.repository.ChiMucGioHangRepository;
import com.MiStore.MiStore.service.ChiMucGioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiMucGioHangServiceImpl implements ChiMucGioHangService {
	
	@Autowired
	private ChiMucGioHangRepository repo;
	
	@Override
	public ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp, GioHang g)
	{
		return repo.findBySanPhamAndGioHang(sp,g);
	}
	
	@Override
	public ChiMucGioHang saveChiMucGiohang(ChiMucGioHang c)
	{
		return repo.save(c);
	}
	
	@Override
	public void deleteChiMucGiohang(ChiMucGioHang c)
	{
		repo.delete(c);
	}
	
	@Override
	public List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g)
	{
		return repo.findByGioHang(g);
	}
	
	@Override
	public void deleteAllChiMucGiohang(List<ChiMucGioHang> c)
	{
		repo.deleteAll(c);
	}

}
