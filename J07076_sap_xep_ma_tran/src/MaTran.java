import java.util.Arrays;
import java.util.Collections;

public class MaTran {
    private int n,m,i;
    private int a[][];

    public MaTran(int n, int m, int i) {
        this.n = n;
        this.m = m;
        this.i = i-1;
        this.a = new int[n][m];
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public int getI() {
        return i;
    }

    public void setA(int a[][]) {
        int tmp[]=new int[n];
        for(int k=0;k<n;k++){
            tmp[k]=a[k][i];
        }
        Arrays.sort(tmp);
        for(int k=0;k<n;k++){
            a[k][i]=tmp[k];
        }
        this.a = a;
    }

    public void in(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
