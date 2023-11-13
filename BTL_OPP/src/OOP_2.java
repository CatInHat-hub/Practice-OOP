import java.lang.Math;

class Diem {
	private double tungDo;
	private double hoanhDo;

	public double getTungDo() {
		return tungDo;
	}

	public void setTungDo(double tungDo) {
		this.tungDo = tungDo;
	}

	public double getHoanhDo() {
		return hoanhDo;
	}

	public void setHoanhDo(double hoanhDo) {
		this.hoanhDo = hoanhDo;
	}

	public Diem(double tungDo, double hoanhDo) {
		this.hoanhDo = hoanhDo;
		this.tungDo = tungDo;
	}

	public void hienThiDiem() {
		System.out.println("Point (" + tungDo + "," + hoanhDo + ")");
	}

	public void distanceOfPoints(Diem d1, Diem d2) {
		System.out.print(Math.sqrt(Math.pow(d1.tungDo - d2.tungDo, 2) + Math.pow(d1.hoanhDo - d2.hoanhDo, 2)));
	}
}

class DoanThang {
	private Diem diem1;
	private Diem diem2;

	public Diem getDiem1() {
		return diem1;
	}

	public void setDiem1(Diem diem1) {
		this.diem1 = diem1;
	}

	public Diem getDiem2() {
		return diem2;
	}

	public void setDiem2(Diem diem2) {
		this.diem2 = diem2;
	}

	public DoanThang(Diem diem1, Diem diem2) {
		this.diem1 = diem1;
		this.diem2 = diem2;
	}

	public void hienThiDT(Diem diem1, Diem diem2) {
		System.out.println("Line [(" + diem1.getTungDo() + "," + diem1.getHoanhDo() + "),(" + diem2.getTungDo() + ","
				+ diem2.getHoanhDo() + "]\n");
	}

	public Diem trungDiemDT(Diem diem1, Diem diem2) {
		Diem trungDiem = new Diem((diem1.getTungDo() + diem2.getTungDo()) / 2,
				(diem1.getHoanhDo() + diem2.getHoanhDo()) / 2);
		System.out.println("Mid point (" + trungDiem.getTungDo() + "," + trungDiem.getHoanhDo() + ")");
		return trungDiem;
	}

	public boolean kiemTraSongSong(DoanThang dt1, DoanThang dt2) {
		if ((dt1.diem1.getTungDo() - dt1.diem2.getTungDo())
				/ (dt1.diem1.getHoanhDo() - dt1.diem2.getHoanhDo()) == (dt2.diem1.getTungDo() - dt2.diem2.getTungDo())
						/ (dt2.diem1.getHoanhDo() - dt2.diem2.getHoanhDo())) {
			System.out.println("Two lines are paralel");
			return true;
		} else {
			System.out.println("Two lines are not parallel");
			return false;
		}
	}
}

public class OOP_2 {
	public static void main(String[] args) {
		Diem diem1 = new Diem(6, 0);
		Diem diem2 = new Diem(0, 3);
		Diem diem3 = new Diem(-4, 0);
		Diem diem4 = new Diem(0, -2);

		diem1.hienThiDiem();
		diem2.hienThiDiem();
		System.out.print("Distance of 2 points is: ");
		diem1.distanceOfPoints(diem1, diem2);

		System.out.println();
		DoanThang line1 = new DoanThang(diem1, diem2);
		DoanThang line2 = new DoanThang(diem3, diem4);
		line1.hienThiDT(diem1, diem2);

		line1.trungDiemDT(diem1, diem2);
		System.out.print("Length of line1 is: ");
		diem1.distanceOfPoints(diem1, diem2);
		System.out.println();
		line1.kiemTraSongSong(line1, line2);
		
		//
	}
}