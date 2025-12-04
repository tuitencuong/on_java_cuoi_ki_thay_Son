public class KhachHang {
    private String id,ten;
    private String loaiHo;
    private int soDau,soCuoi;

    public KhachHang(String id, String ten, String loaiHo, int soDau, int soCuoi) {
        this.id = id;
        this.ten = chuanHoaTen(ten);
        this.loaiHo = loaiHo;
        this.soDau = soDau;
        this.soCuoi = soCuoi;
    }
    public String chuanHoaTen(String s){
        String tmp[]=s.split("\\s+");
        String ans="";
        for(String x:tmp){
            ans+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return ans.trim();
    }
    public int dinhMuc(){
        if(loaiHo.equals("A")) return 100;
        if(loaiHo.equals("B")) return 500;
        if(loaiHo.equals("C")) return 200;
        return 0;
    }
    public int tienTrongDinhMuc(){
        if((soCuoi-soDau)>dinhMuc()) return dinhMuc()*450;
        return (soCuoi-soDau)*450;
    }
    public int tienVuotDinhMuc(){
        if((soCuoi-soDau)>dinhMuc()) return (soCuoi-soDau-dinhMuc())*1000;
        return 0;
    }
    public int thueVAT(){
        return tienVuotDinhMuc()*5/100;
    }
    public int tienPhaiNop(){
        return tienTrongDinhMuc()+tienVuotDinhMuc()+thueVAT();
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+tienTrongDinhMuc()+" "+tienVuotDinhMuc()+" "+thueVAT()+" "+tienPhaiNop();
    }
}
