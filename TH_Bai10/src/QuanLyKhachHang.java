import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachHang {
    private ArrayList<KhachHang> dskh;
    private ArrayList<KhachHang> dskhCho;
    private ArrayList<KhachHang> dskhdaMuaVe;

    public QuanLyKhachHang(){
        dskhCho = new ArrayList<KhachHang>();
        dskhdaMuaVe = new ArrayList<KhachHang>();
        dskh = new ArrayList<KhachHang>();
    }

    public void themKhachHangCho(KhachHang kh){
        dskhCho.add(kh);
    }

    public void themKhachHangDaMuaVe(KhachHang kh){
        dskhdaMuaVe.add(kh);
    }
    public void hiendsKH(){
        for (KhachHang kh : dskh) {
            System.out.println(kh);
        }
    }
    public void docFile(){
        try {
            File file = new File("dskh.txt");
            file.createNewFile();
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                String cmnd = sc.nextLine();
                String tenKH = sc.nextLine();
                String gaDen = sc.nextLine();
                String giaTien = sc.nextLine();
                double giaTien1 = Double.parseDouble(giaTien);
                KhachHang KH = new KhachHang(cmnd, tenKH, gaDen, giaTien1);
                dskh.add(KH);
            }
            sc.close();
        } catch (Exception e) {
        	
        }
    }

    public KhachHang timKhachHang(String cmnd){
        for (KhachHang kh : dskh) {
            if (kh.getCmnd().equals(cmnd)){
                return kh;
            }
        }
        return null;
    }
    public void luuKhachHangCho(String cmnd){
        try {
            FileWriter fw = new FileWriter("dskhachhangcho.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            KhachHang kh = timKhachHang(cmnd);
            if (kh != null){
                bw.write(kh.getCmnd());
                bw.newLine();
                bw.write(kh.getTenKH());
                bw.newLine();
                bw.write(kh.getGaDen());
                bw.newLine();
                bw.write(kh.getGiaTien()+"");
                bw.newLine();
                dskh.remove(kh);
            }
            else{
                System.out.println("Khong tim thay khach hang");
            }
            bw.close();
            fw.close();
            System.out.println("luu thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void luuKhachHangMuaVe(String cmnd) {
    	try {
			FileWriter fw = new FileWriter("dskhdamuave.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (KhachHang x : dskhCho) {
				if (x.getCmnd().equalsIgnoreCase(cmnd)) {
					bw.write(x.getCmnd());
	                bw.newLine();
	                bw.write(x.getTenKH());
	                bw.newLine();
	                bw.write(x.getGaDen());
	                bw.newLine();
	                bw.write(x.getGiaTien()+"");
	                bw.newLine();
				}
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			 e.printStackTrace();
		}
    }
    
    public void ghiFile() {
    	
    	try {
    		File file = new File("khachhang.txt");
    		file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream  oos = new ObjectOutputStream(fos);
			for (KhachHang x : dskh) {
				oos.writeObject(x);
			}
			oos.close();
			fos.close();
		} catch (Exception e) {
		}
    }
    public void docFileObject() {
    	try {
    		File file = new File("khachhang.txt");
    		FileInputStream fis = new FileInputStream(file);
    		ObjectInputStream ois = new ObjectInputStream(fis);
    		for (int i=0; i<dskh.size(); ++i) {
    			KhachHang kh = (KhachHang) ois.readObject();
    			dskhCho.add(kh);
    		}
    		ois.close();
    		fis.close();
		} catch (Exception e) {
		}
    }
    public void hienKhCho() {
    	for (KhachHang x : dskhCho) {
    		System.out.println(x);
    	}
    }

    
}
