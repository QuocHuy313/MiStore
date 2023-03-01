package com.MiStore.MiStore.controller.shipper;

import com.MiStore.MiStore.dto.CapNhatDonHangShipper;
import com.MiStore.MiStore.dto.SearchDonHangObject;
import com.MiStore.MiStore.entities.ChiTietDonHang;
import com.MiStore.MiStore.entities.DonHang;
import com.MiStore.MiStore.entities.NguoiDung;
import com.MiStore.MiStore.service.DonHangService;
import com.MiStore.MiStore.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/shipper/don-hang")
public class DonHangShipperApi {

    @Autowired
    private DonHangService donHangService;

    @Autowired
    private NguoiDungService nguoiDungService;

    @GetMapping("/all")
    public Page<DonHang> getDonHangByFilter(@RequestParam(defaultValue = "1") int page, @RequestParam String trangThai,
                                            @RequestParam String tuNgay, @RequestParam String denNgay, @RequestParam long idShipper)
            throws ParseException {

        SearchDonHangObject object = new SearchDonHangObject();
        object.setDenNgay(denNgay);
        object.setTrangThaiDon(trangThai);
        object.setTuNgay(tuNgay);

        NguoiDung shipper = nguoiDungService.findById(idShipper);
        Page<DonHang> listDonHang = donHangService.findDonHangByShipper(object, page, 6, shipper);
        return listDonHang;
    }

    @GetMapping("/{id}")
    public DonHang getDonHangById(@PathVariable long id) {
        return donHangService.findById(id);
    }

    @PostMapping("/update")
    public void capNhatTrangThaiDonHang(@RequestBody CapNhatDonHangShipper capNhatDonHangShipper) {
        DonHang donHang = donHangService.findById(capNhatDonHangShipper.getIdDonHang());

        for (ChiTietDonHang chiTiet : donHang.getDanhSachChiTiet()) {
            for (CapNhatDonHangShipper.CapNhatChiTietDon chiTietCapNhat : capNhatDonHangShipper
                    .getDanhSachCapNhatChiTietDon()) {
                if (chiTiet.getId() == chiTietCapNhat.getIdChiTiet()) {
                    chiTiet.setSoLuongNhanHang(chiTietCapNhat.getSoLuongNhanHang());
                }
            }
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {

            String dateStr = format.format(new Date());
            Date date = format.parse(dateStr);
            donHang.setNgayNhanHang(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        donHang.setTrangThaiDonHang("Chờ duyệt");

        String ghiChu = capNhatDonHangShipper.getGhiChuShipper();

        if (!ghiChu.equals("")) {
            donHang.setGhiChu("Ghi chú shipper: \n" + capNhatDonHangShipper.getGhiChuShipper());
        }
        donHangService.save(donHang);

    }
}
