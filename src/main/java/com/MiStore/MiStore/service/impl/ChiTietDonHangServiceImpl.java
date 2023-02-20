package com.MiStore.MiStore.service.impl;

import com.MiStore.MiStore.entities.ChiTietDonHang;
import com.MiStore.MiStore.repository.ChiTietDonHangRepository;
import com.MiStore.MiStore.service.ChiTietDonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService {
	
	@Autowired
	private ChiTietDonHangRepository repo;
	
	@Override
	public List<ChiTietDonHang> save(List<ChiTietDonHang> list)
	{	
		return repo.saveAll(list);
	}
}
