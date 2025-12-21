public class KhachHang implements Comparable<KhachHang>{
    private String id,ten;
    private int chiSoCu,chiSoMoi;

    public KhachHang(String id, String ten, int chiSoCu, int chiSoMoi) {
        this.id = id;
        this.ten = ten;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    public int tongTien(){
        int cnt=chiSoMoi-chiSoCu;
        int tien=0;
        double phuPhi=1.02;
        if(cnt>100) phuPhi=1.05;
        else if(cnt>50) phuPhi=1.03;
        if(cnt>100){
            tien+=(cnt-100)*200;
            cnt=100;
        }
        if(cnt>50){
            tien+=(cnt-50)*150;
            cnt=50;
        }
        if(cnt>0){
            tien+=(cnt)*100;
            cnt=0;
        }
        return Math.toIntExact(Math.round(tien * phuPhi));
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+tongTien();
    }

    @Override
    public int compareTo(KhachHang o) {
        return o.tongTien()-tongTien();
    }
}
