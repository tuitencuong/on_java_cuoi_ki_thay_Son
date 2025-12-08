import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n+1];
            Stack<Integer> st=new Stack<>();
            ArrayList<Integer> res=new ArrayList<>(Collections.nCopies(n+1,0));
            for(int i=1;i<=n;i++) a[i]=sc.nextInt();

            for(int i=1;i<=n;i++){
                while (!st.empty()&&a[i]>=a[st.peek()]){
                    st.pop();
                }
                if(!st.empty()) res.set(i,st.peek());
                st.push(i);
            }
            for(int i=1;i<=n;i++) System.out.print(i-res.get(i)+" ");
            System.out.println();
        }
    }
}