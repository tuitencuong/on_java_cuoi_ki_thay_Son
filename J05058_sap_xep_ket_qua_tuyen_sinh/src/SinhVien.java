public class SinhVien implements Comparable<SinhVien>{
    private String id,ten;
    private double diem;

    public SinhVien(String id, String ten, double m1,double m2,double m3) {
        this.id = id;
        this.ten = ten;
        this.diem = m1*2+m2+m3;
    }

    public String getId() {
        return id;
    }

    public double diemUuTien(){
        String tmp=id.substring(0,3);
        if(tmp.equals("KV1")) return 0.5;
        if(tmp.equals("KV2")) return 1.0;
        if(tmp.equals("KV3")) return 2.5;
        return 0;
    }
    public double diemXetTuyen(){
        return diem+diemUuTien();
    }
    public String trangThai(){
        if(diemXetTuyen()>=24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+
                (diemUuTien()%1==0?String.valueOf((int)diemUuTien()):String.valueOf(diemUuTien()))+" "+
                (diemXetTuyen()%1==0?String.valueOf((int) diemXetTuyen()):String.valueOf(diemXetTuyen()))+" "+
                trangThai();
    }

    @Override
    public int compareTo(SinhVien o) {
        if(o.diemXetTuyen()!=(diemUuTien())) return  Double.compare(o.diemXetTuyen(),diemXetTuyen());
        return id.compareTo(o.getId());
    }
}
