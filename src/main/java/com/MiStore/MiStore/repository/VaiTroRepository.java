package com.MiStore.MiStore.repository;

import com.MiStore.MiStore.entities.VaiTro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaiTroRepository extends JpaRepository<VaiTro, Long> {

	VaiTro findByTenVaiTro(String tenVaiTro);
}
