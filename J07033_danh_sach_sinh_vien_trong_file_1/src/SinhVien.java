public class SinhVien implements Comparable<SinhVien>{
    private String id,ten,lop,email;

    public SinhVien(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = chuanHoaTen(ten);
        this.lop = lop;
        this.email = email;
    }
    public String chuanHoaTen(String s){
        String tmp[]=s.split("\\s+");
        String ans="";
        for(String x:tmp){
            ans+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return ans.trim();
    }
    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+lop+" "+email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return id.compareTo(o.getId());
    }
}
