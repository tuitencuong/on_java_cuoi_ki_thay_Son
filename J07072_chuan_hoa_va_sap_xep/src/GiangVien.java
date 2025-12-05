import static java.lang.Boolean.FALSE;

public class GiangVien implements Comparable<GiangVien>{
    private String ten;

    public GiangVien(String ten) {
        this.ten = chuanHoaTen(ten);
    }
    public String chuanHoaTen(String s){
        String tmp[]=s.split("\\s+");
        String ans="";
        for(String x:tmp){
            ans+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return ans.trim();
    }
    @Override
    public String toString(){
        return ten;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public int compareTo(GiangVien o) {
        String tmp1[]=ten.split("\\s+");
        String tmp2[]=o.getTen().split("\\s+");
        int cmp1=tmp1[tmp1.length-1].compareTo(tmp2[tmp2.length-1]);
        if(cmp1!=0) return cmp1;
        String ans1="",ans2="";
        for(int i=0;i<tmp1.length-1;i++) ans1+=tmp1[i]+" ";
        for(int i=0;i<tmp2.length-1;i++) ans2+=tmp2[i]+" ";
        return ans1.compareTo(ans2);
    }
}
