package mtha_qlphonghoc;


import java.util.Scanner;

public class PhongLyThuyet extends PhongHoc {
	boolean mayChieu;

	public PhongLyThuyet(String maPhong, int dayNha, 	
			int dienTich, int slBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, slBongDen);
		this.mayChieu = mayChieu;
	}

	public PhongLyThuyet() {
		super();
	}

	@Override
	public String toString() {
		String msg="";
		if(mayChieu)
			msg="co may chieu";
		else
			msg ="khong co may chieu";
		return "PhongLyThuyet [" + msg + 		
				", " + super.toString() + "]";
	}

	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		if(super.datChuan()) {
			if(mayChieu)
				return true;
			else
				return false;
			
		}else {
			return false;
		}
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		while(true) {
			System.out.println("Nhap thong tin may chieu: 1. co \n2. khong");
			int chon = new Scanner(System.in).nextInt();
			if(chon==1) {
				mayChieu=true;
				break;
			}
			else if(chon==2) {
				mayChieu = false;
				break;
			}else {
				System.out.println("nhap lai thong tin");
			}
		}		
		
	}
	
	

}
