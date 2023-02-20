package com.MiStore.MiStore.repository;

import com.MiStore.MiStore.entities.LienHe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface LienHeRepository extends JpaRepository<LienHe, Long>, QuerydslPredicateExecutor<LienHe>{

	int countByTrangThai(String trangThai);
	
}
