public class NhanVien implements Comparable<NhanVien>{
    private String id,ten;
    private double lyThuyet,thucHanh;

    public NhanVien(String id, String ten, double lyThuyet, double thucHanh) {
        this.id = id;
        this.ten = ten;
        this.lyThuyet = chuanHoa(lyThuyet);
        this.thucHanh = chuanHoa(thucHanh);
    }
    public Double chuanHoa(double d){
        if(d>10) return d/10;
        return  d;
    }
    public Double diemTrungBinh(){
        return (lyThuyet+thucHanh)/2;
    }
    public String xepLoai(){
        if(diemTrungBinh()>9.5) return "XUAT SAC";
        if(diemTrungBinh()>=8) return "DAT";
        if(diemTrungBinh()>5) return "CAN NHAC";
        return "TRUOT";
    }
    @Override
    public String toString() {
        return id+" "+ten+" "+String.format("%.2f",diemTrungBinh())+" "+xepLoai();
    }

    @Override
    public int compareTo(NhanVien o) {
        return o.diemTrungBinh().compareTo(diemTrungBinh());
    }
}
