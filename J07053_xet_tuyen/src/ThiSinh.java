public class ThiSinh {
    private String id,ten,ns;
    private double diemLT,diemTH;

    public ThiSinh(String id, String ten, String ns, double diemLT, double diemTH) {
        this.id = id;
        this.ten = chuanHoaTen(ten);
        this.ns = chuanHoaNgay(ns);
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public String chuanHoaTen(String s){
        String tmp[]=s.split("\\s+");
        String ans="";
        for(String x:tmp){
            ans+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return ans.trim();
    }
    public String chuanHoaNgay(String s){
        StringBuilder tmp=new StringBuilder(s);
        if(tmp.charAt(1)=='/') tmp.insert(0,"0");
        if(tmp.charAt(4)=='/') tmp.insert(3,"0");
        return tmp.toString();
    }
    public int tinhTuoi(){
        String tmp[]=ns.split("/");
        return 2021-Integer.parseInt(tmp[tmp.length-1]);
    }
    public int tinhDiem(){
        double diemCong=0;
        if(diemLT>=8&&diemTH>=8) diemCong=1;
        else if(diemLT>=7.5&&diemTH>=7.5) diemCong=0.5;
        int diem= Math.toIntExact(Math.round((diemLT + diemTH) / 2.0 + diemCong));
        if(diem>=10) return 10;
        return diem;
    }
    public String xepLoai(){
        if(tinhDiem()>=9) return "Xuat sac";
        else if(tinhDiem()>=8) return "Gioi";
        else if(tinhDiem()>=7) return "Kha";
        else if(tinhDiem()>=5) return "Trung binh";
        return "Truot";
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+tinhTuoi()+" "+tinhDiem()+" "+xepLoai();
    }
}
