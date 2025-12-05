public class SinhVien implements Comparable<SinhVien>{
    private String id,ten,sdt,email;

    public SinhVien(String id, String ten, String sdt, String email) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+sdt+" "+email;
    }

    @Override
    public int compareTo(SinhVien o) {
        String tmp1[]=ten.split("\\s+");
        String tmp2[]=o.getTen().split("\\s+");
        int cmp1=tmp1[tmp1.length-1].compareTo(tmp2[tmp2.length-1]);
        if(cmp1!=0) return cmp1;
        String ans1="",ans2="";
        for(int i=0;i<tmp1.length-1;i++) ans1+=tmp1[i]+" ";
        for(int i=0;i<tmp2.length-1;i++) ans2+=tmp2[i]+" ";
        int cmp2=ans1.compareTo(ans2);
        if(cmp2!=0) return cmp2;
        return id.compareTo(o.getId());
    }
}
