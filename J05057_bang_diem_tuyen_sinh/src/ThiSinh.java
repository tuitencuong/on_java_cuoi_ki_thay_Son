public class ThiSinh {
    private String id,ten;
    private double tongDiem;

    public ThiSinh(String id, String ten, double m1,double m2, double m3) {
        this.id = id;
        this.ten = ten;
        this.tongDiem = m1*2+m2+m3;
    }
    public double diemUuTien(){
        String tmp=id.substring(0,3);
        if(tmp.equals("KV1")) return 0.5;
        if(tmp.equals("KV2")) return 1.0;
        if(tmp.equals("KV3")) return 2.5;
        return  0;
    }
    public String trangThai(){
        double d=diemUuTien()+tongDiem;
        if(d>=24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+(diemUuTien()%1==0?String.valueOf((int)diemUuTien()):String.valueOf(diemUuTien()))+" "+(tongDiem%1==0?String.valueOf((int)tongDiem):String.valueOf(tongDiem))+" "+trangThai();
    }
}
