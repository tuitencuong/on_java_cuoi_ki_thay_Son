public class GiangVien {
    private String maGiangVien,ten;
    private double gio=0;
    public GiangVien(String maGiangVien, String ten) {
        this.maGiangVien = maGiangVien;
        this.ten = ten;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public String getTen() {
        return ten;
    }

    public void setGio(double gio) {
        this.gio += gio;
    }
    @Override
    public String toString(){
        return ten+" "+String.format("%.2f",gio);
    }
}

