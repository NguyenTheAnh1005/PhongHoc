package nguyentheanh_23709691_03;

public abstract class PhongHoc {
	public abstract double getDatChuan();
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String ma) throws Exception {
		if (ma!="") {
			this.maPhong = ma;
		} else {
			throw new Exception("loi rong");
		}
		
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
	
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public PhongHoc() {}
	String phongHocChuan = (getDatChuan())?"Dat Chuan": "Khong dat Chuan";
	public boolean duSang() {
		if (getDienTich()/getSoBongDen()<=10) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%10s|%10s|%10s|%10s|%10s|", getDayNha(), getMaPhong(), getDienTich(), getSoBongDen(), getDatChuan());
		return s;
	}

}
