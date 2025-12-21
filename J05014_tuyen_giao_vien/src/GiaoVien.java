public class GiaoVien implements Comparable<GiaoVien>{
    private String id,ten,maXetTuyen;
    private double tinHoc,chuyenMon;

    public GiaoVien(String id, String ten, String maXetTuyen, double tinHoc, double chuyenMon) {
        this.id = id;
        this.ten = ten;
        this.maXetTuyen = maXetTuyen;
        this.tinHoc = tinHoc;
        this.chuyenMon = chuyenMon;
    }
    public String monHoc(){
        String tmp=maXetTuyen.substring(0,1);
        if(tmp.equals("A")) return "TOAN";
        if(tmp.equals("B")) return "LY";
        if(tmp.equals("C")) return "HOA";
        return "";
    }
    public double diemUuTien(){
        int tmp=Integer.parseInt(maXetTuyen.substring(1,2));
        if(tmp==1) return 2;
        if(tmp==2) return 1.5;
        if(tmp==3) return 1;
        return 0;
    }
    public Double tongDiem(){
        return tinHoc*2+chuyenMon+diemUuTien();
    }
    public String trangThai(){
        if(tongDiem()>=18) return "TRUNG TUYEN";
        return "LOAI";
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+monHoc()+" "+tongDiem()+" "+trangThai();
    }

    @Override
    public int compareTo(GiaoVien o) {
        return o.tongDiem().compareTo(tongDiem());
    }
}
