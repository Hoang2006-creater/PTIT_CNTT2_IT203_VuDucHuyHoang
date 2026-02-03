package ThucHanh;

public class Student {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTB;
    private String xepLoai;

    // Constructor đầy đủ
    public Student(String maSV, String hoTen, int tuoi, String gioiTinh,
                   double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        tinhDiemTB();
        xepLoai();
    }

    // Tính điểm trung bình
    public void tinhDiemTB() {
        this.diemTB = (diemToan + diemLy + diemHoa) / 3;
    }

    // Xếp loại
    public void xepLoai() {
        if (diemTB >= 8 && diemToan >= 6.5 && diemLy >= 6.5 && diemHoa >= 6.5) {
            xepLoai = "Giỏi";
        } else if (diemTB >= 6.5 && diemToan >= 5 && diemLy >= 5 && diemHoa >= 5) {
            xepLoai = "Khá";
        } else if (diemTB >= 5 && diemToan >= 3.5 && diemLy >= 3.5 && diemHoa >= 3.5) {
            xepLoai = "Trung bình";
        } else {
            xepLoai = "Yếu";
        }
    }

    // Getter & Setter
    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }
    public String getXepLoai() { return xepLoai; }

    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }
    public void setDiemToan(double diemToan) { this.diemToan = diemToan; }
    public void setDiemLy(double diemLy) { this.diemLy = diemLy; }
    public void setDiemHoa(double diemHoa) { this.diemHoa = diemHoa; }

    // Hiển thị
    public void hienThi() {
        System.out.printf("%-10s %-20s %-5d %-8s %-6.2f %-10s\n",
                maSV, hoTen, tuoi, gioiTinh, diemTB, xepLoai);
    }
}
