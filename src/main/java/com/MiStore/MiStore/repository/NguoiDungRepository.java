package com.MiStore.MiStore.repository;

import com.MiStore.MiStore.entities.NguoiDung;
import com.MiStore.MiStore.entities.VaiTro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface NguoiDungRepository extends JpaRepository<NguoiDung, Long>{

	NguoiDung findByEmail(String email);

	Page<NguoiDung> findByVaiTro(Set<VaiTro> vaiTro, Pageable of);

	List<NguoiDung> findByVaiTro(Set<VaiTro> vaiTro);
}
