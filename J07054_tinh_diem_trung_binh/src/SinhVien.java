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
        return (m1*3+m2*3+m3*2)/8.0;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return id+" "+ten+" "+String.format("%.2f",diemTrungBinh());
    }
}
