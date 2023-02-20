package com.MiStore.MiStore.service;

import com.MiStore.MiStore.dto.TaiKhoanDTO;
import com.MiStore.MiStore.entities.NguoiDung;
import com.MiStore.MiStore.entities.VaiTro;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Set;

public interface NguoiDungService {

	NguoiDung findByEmail(String email);

	NguoiDung findByConfirmationToken(String confirmationToken);

	NguoiDung saveUserForMember(NguoiDung nd);

	NguoiDung findById(long id);

	NguoiDung updateUser(NguoiDung nd);

	void changePass(NguoiDung nd, String newPass);

	Page<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro> vaiTro, int page);

	List<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro> vaiTro);
	
	NguoiDung saveUserForAdmin(TaiKhoanDTO dto);

	void deleteById(long id);

}
