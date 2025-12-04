public class ThiSinh {
    private String id,ten,danToc;
    private double diem;
    private int khuVuc;

    public ThiSinh(String id, String ten, double diem ,String danToc, int khuVuc) {
        this.id = id;
        this.ten = chuanHoaTen(ten);
        this.danToc = danToc;
        this.diem = diem;
        this.khuVuc = khuVuc;
    }
    public String chuanHoaTen(String s){
        String tmp[]=s.split("\\s+");
        String ans="";
        for(String x:tmp){
            ans+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return ans.trim();
    }
    public double diemUuTien(){
        double diemUuTien=0;
        if(khuVuc==1) diemUuTien+=1.5;
        if(khuVuc==2) diemUuTien+=1.0;
        if(!danToc.equals("Kinh")) diemUuTien+=1.5;
        return diemUuTien;
    }
    public Double tongDiem(){
        return diem+diemUuTien();
    }
    public String trangThai(){
        if(tongDiem()>=20.5) return "Do";
        else return "Truot";
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString(){
        return id+" "+ten+" "+String.format("%.1f",tongDiem())+" "+trangThai();
    }
}
