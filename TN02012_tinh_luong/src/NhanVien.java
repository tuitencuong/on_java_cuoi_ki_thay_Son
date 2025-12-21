import java.util.ArrayList;

public class NhanVien {
    private String id,ten;
    private int luongCoBan,ngayCong;
    private PhongBan phongBan;

    public NhanVien(String id, String ten, int luongCoBan, int ngayCong, PhongBan phongBan) {
        this.id = id;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        this.phongBan = phongBan;
    }
    public int heSo(){
        int[][] arr = {
                {10, 12, 14, 20},
                {10, 11, 13, 16},
                {9, 10, 12, 14},
                {8, 9, 11, 13},
        };
        String tmp1=id.substring(0,1);
        int id1=0,id2=0;
        if(tmp1.equals("A")) id1=0;
        if(tmp1.equals("B")) id1=1;
        if(tmp1.equals("C")) id1=2;
        if(tmp1.equals("D")) id1=3;
        int tmp2=Integer.parseInt(id.substring(1,3));
        if(tmp2>16) id2=3;
        else if(tmp2>8) id2=2;
        else if(tmp2>3) id2=1;
        return arr[id1][id2];
    }
    @Override
    public String toString(){
        return id+" "+ten+" "+phongBan.getTen()+" "+luongCoBan*ngayCong*heSo()+"000";
    }
}
