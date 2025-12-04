public class SinhVien {
    private String id,ten;
    private int m1,m2,m3;

    public SinhVien(String id,String ten, int m1, int m2, int m3) {
        this.id=id;
        this.ten = chuanHoaTen(ten);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public String chuanHoaTen(String s){
        String tmp[]=s.split("\\s+");
        String ans="";
        for(String x:tmp){
            ans+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return ans.trim();
    }
    public Double diemTrungBinh(){
        return m1*0.25+m2*0.35+m3*0.4;
    }

    public String getId() {
        return id;
    }
    public String xepLoai(){
        if(diemTrungBinh()>=8) return "GIOI";
        if(diemTrungBinh()>=6.5) return "KHA";
        if(diemTrungBinh()>=5) return "TRUNG BINH";
        return "KEM";
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+String.format("%.2f",diemTrungBinh())+" "+xepLoai();
    }
}