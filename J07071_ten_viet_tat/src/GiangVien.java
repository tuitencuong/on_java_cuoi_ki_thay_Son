import static java.lang.Boolean.FALSE;

public class GiangVien implements Comparable<GiangVien>{
    private String ten,tenVietTat;

    public GiangVien(String ten) {
        this.ten = ten;
        this.tenVietTat = chuanHoa(ten);
    }
    public String chuanHoa(String s){
        String ans="";
        String tmp[]=s.split("\\s+");
        for(int i=0;i<tmp.length;i++){
            ans+=tmp[i].charAt(0);
            if(i!= tmp.length-1) ans+=".";
        }
        return ans;
    }
    public boolean soSanh(String s){
        int cnt=0;
        if(s.length()!=tenVietTat.length()) return FALSE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=tenVietTat.charAt(i)) cnt+=1;
        }
        return cnt==1;
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
        for(int i=0;i<tmp2.length-1;i++) ans2+=tmp1[i]+" ";
        return ans1.compareTo(ans2);
    }
}
