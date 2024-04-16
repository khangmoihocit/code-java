package mtha_qlphonghoc;


import java.util.Scanner;

public class PhongThiNghiem extends PhongHoc {
	boolean isBonRua;

	public PhongThiNghiem(String maPhong, int dayNha, 
			int dienTich, int slBongDen, boolean isBonRua) {
		super(maPhong, dayNha, dienTich, slBongDen);
		this.isBonRua = isBonRua;
	}

	public PhongThiNghiem() {
		super();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		while(true) {
			System.out.println("Nhap thong tin bon rua: 1. co \n2. khong");
			int chon = new Scanner(System.in).nextInt();
			if(chon==1) {
				isBonRua=true;
				break;
			}
			else if(chon==2) {
				isBonRua = false;
				break;
			}else {
				System.out.println("nhap lai thong tin");
			}
		}		
	}

	@Override
	public String toString() {
		String msg="";
		if(isBonRua)
			msg="co bon rua";
		else
			msg ="khong co bon rua";
		return "PhongThiNghiem [" + msg + 		
				", " + super.toString() + "]";
	}

	@Override
	public boolean datChuan() {
		if(super.datChuan()) {
			if(isBonRua)
				return true;
			else
				return false;
			
		}else {
			return false;
		}
	}
	
	

}

