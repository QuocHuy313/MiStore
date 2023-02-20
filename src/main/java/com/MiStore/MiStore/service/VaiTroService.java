package com.MiStore.MiStore.service;

import com.MiStore.MiStore.entities.VaiTro;

import java.util.List;

public interface VaiTroService {

	VaiTro findByTenVaiTro(String tenVaiTro);
	List<VaiTro> findAllVaiTro();
}
