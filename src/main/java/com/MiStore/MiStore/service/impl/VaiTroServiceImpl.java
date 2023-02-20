package com.MiStore.MiStore.service.impl;

import com.mistore.entities.VaiTro;
import com.mistore.repository.VaiTroRepository;
import com.mistore.service.VaiTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaiTroServiceImpl implements VaiTroService{
	

	@Autowired
	private VaiTroRepository repo;

	@Override
	public VaiTro findByTenVaiTro(String tenVaiTro) {
		return repo.findByTenVaiTro(tenVaiTro);
	}

	@Override
	public List<VaiTro> findAllVaiTro() {
		return repo.findAll();
	}


}
