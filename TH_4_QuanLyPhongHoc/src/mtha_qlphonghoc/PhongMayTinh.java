package mtha_qlphonghoc;


public class PhongMayTinh extends PhongHoc {
	int slMayTinh;

	public PhongMayTinh(String maPhong, int dayNha, 		
			int dienTich, int slBongDen, int slMayTinh) {
		super(maPhong, dayNha, dienTich, slBongDen);
		this.slMayTinh = slMayTinh;
	}

	public PhongMayTinh() {
		super();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		slMayTinh =(int)(dienTich/1.5);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "so luong may tinh: "+ slMayTinh;
	}

	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		if(super.datChuan()) {
			if(slMayTinh>0) {
				return true;
			}
			return false;
		}else
			return false;
	}
	
	

}
