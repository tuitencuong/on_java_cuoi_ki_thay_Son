public class SinhVien {
    private String id,ten,lop;
    private int diemCC=10;
    private String ghiChu="";

    public SinhVien(String id, String ten, String lop) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setDiemCC(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='v') diemCC-=2;
            if(s.charAt(i)=='m') diemCC-=1;
        }
        if(diemCC<=0){
            diemCC=0;
            ghiChu="KDDK";
        }
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+lop+" "+diemCC+" "+ghiChu;
    }

}
