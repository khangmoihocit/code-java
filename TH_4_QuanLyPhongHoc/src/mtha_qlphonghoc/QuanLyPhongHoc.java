package mtha_qlphonghoc;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.Comparator;

public class QuanLyPhongHoc {
	List<PhongHoc> dsPhongHoc;
	public QuanLyPhongHoc() {
		//khoi tao list
		dsPhongHoc = new Vector<PhongHoc>();
	}
	/**
	 * 
	 * @param maPhong- thuc hien tim kiem tren danh sach phong hoc
	 * @return: false -neu ma phong chua ton tai
	 * - true: ma phong da ton tai
	 */
	public boolean isCheckMaPhong(String maPhong) {
		Iterator<PhongHoc> it = dsPhongHoc.iterator();
		while(it.hasNext()) {
			//kiem tra xem ma phong da ton tai hay chua
			PhongHoc phongHoc = it.next();
			if(phongHoc.maPhong.equals(maPhong)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * 
	 * @param loai: 1- phong ly thuyet, 2- phong may tinh
	 * 3- phong thi nghiem
	 * @return true- them moi thanh cong, false - them that bai
	 */
	public boolean themPhongHoc(int loai) {
		if(loai==1) {
			while(true) {
				PhongLyThuyet phongLyThuyet = new PhongLyThuyet();
				phongLyThuyet.input();
				if(isCheckMaPhong(phongLyThuyet.maPhong)==false) {
					//them moi phong vao ds
					dsPhongHoc.add(phongLyThuyet);
					return true;
				}
			}
		}else if(loai==2) {
			while(true) {
				PhongMayTinh phongMT = new PhongMayTinh();
				phongMT.input();
				if(isCheckMaPhong(phongMT.maPhong)== false) {
					dsPhongHoc.add(phongMT);
					return true;
				}
			}
		}else if(loai==3) {
			while(true) {
				PhongThiNghiem phongTN = new PhongThiNghiem();
				phongTN.input();
				if(isCheckMaPhong(phongTN.maPhong)== false) {
					dsPhongHoc.add(phongTN);
					return true;
				}
			}
		}
		return false;
	}
	public PhongHoc searchByMaPhong(String maPhong) {
		Iterator<PhongHoc> it = dsPhongHoc.iterator();
		while(it.hasNext()) {
			//kiem tra xem ma phong da ton tai hay chua
			PhongHoc phongHoc = it.next();
			if(phongHoc.maPhong.equals(maPhong)) {
				return phongHoc;
			}
			
		}
		return null;
	}
	public void dsPhongDatChuan() {
		Iterator<PhongHoc> it = dsPhongHoc.iterator();
		while(it.hasNext()) {
			PhongHoc phongHoc = it.next();
			if(phongHoc.datChuan()) {
				System.out.println(phongHoc.toString());
			}
		}
	}
	
	public void sortByDayNha() {
		Collections.sort(dsPhongHoc, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				return ((Integer)o1.dayNha).compareTo((Integer)o2.dayNha);
			}			
		});
		
		/*
		 * cach su dung thuat toan de sap xep danh sach
		for(int i=0; i< dsPhongHoc.size()-1;i++)
			for(int j=i+1; j<dsPhongHoc.size();j++) {
				if(dsPhongHoc.get(i).dayNha>dsPhongHoc.get(j).dayNha) {
					//doi cho phan tu
					PhongHoc tmp = dsPhongHoc.get(i);
					dsPhongHoc.set(i, dsPhongHoc.get(j));
					dsPhongHoc.set(j, tmp);
				}
			}
		*/
	}
	
	public boolean updMayTinh(String maPhong) {
		Iterator<PhongHoc> it = dsPhongHoc.iterator();
		while(it.hasNext()) {
			
			PhongHoc phong = it.next();
			if(phong instanceof PhongMayTinh) {
				if(phong.maPhong.compareTo(maPhong)==0) {
					//thuc hien cap nhat so luong may tinh
					System.out.println("Nhap so luong may tinh: ");
					int sl = new Scanner(System.in).nextInt();
					((PhongMayTinh) phong).slMayTinh = sl;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean delPhongHoc(String maPhong) {
		PhongHoc phongHoc = searchByMaPhong(maPhong);
		if(phongHoc !=null) {
			System.out.println("Ban co muon xoa phong "+phongHoc.maPhong 
					+"? \n1-xoa, 2- khong xoa");
			int chon = new Scanner(System.in).nextInt();
			if(chon ==1) {
				dsPhongHoc.remove(phongHoc);
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public void hienDS() {
		for (PhongHoc phongHoc : dsPhongHoc) {
			System.out.println(phongHoc.toString());
		}
	}
}
