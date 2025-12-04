public class ThiSinh {
    private String maTS,ten;
    private double diemXetTuyen;

    public ThiSinh(String maTS, String ten, double m1, double m2, double m3) {
        this.maTS = maTS;
        this.ten = chuanHoaTen(ten);
        this.diemXetTuyen = m1*2+m2+m3+diemKhuVuc();
    }
    public String chuanHoaTen(String s){
        String tmp[]=s.split("\\s+");
        String ans="";
        for(String x:tmp){
            ans+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return ans.trim();
    }
    public double diemKhuVuc(){
        String tmp=maTS.substring(0,3);
        if(tmp.equals("KV1")) return 0.5;
        else if(tmp.equals("KV2")) return 1.0;
        else if(tmp.equals("KV3")) return 2.5;
        else return 0;
    }

    public double getDiemXetTuyen() {
        return diemXetTuyen;
    }

    public String getMaTS() {
        return maTS;
    }

    @Override
    public String toString(){
        return maTS+" "+ten+" "+(diemKhuVuc() % 1 == 0 ? String.valueOf((int) diemKhuVuc()) : String.valueOf(diemKhuVuc()))+" "+(diemXetTuyen % 1 == 0 ? String.valueOf((int) diemXetTuyen) : String.valueOf(diemXetTuyen))+" ";
    }
}
