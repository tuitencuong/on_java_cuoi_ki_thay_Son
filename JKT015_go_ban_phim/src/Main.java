import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> left=new Stack<>();
        Stack<Character> right=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='-'){
                if(!left.empty()) left.pop();
            }
            else if(c=='<'){
                if(!left.empty()) {
                    right.push(left.peek());
                    left.pop();
                }
            }
            else if(c=='>'){
                if(!right.empty()){
                    left.push(right.peek());
                    right.pop();
                }
            }
            else{
                left.push(c);
            }
        }
        Stack<Character> tmpStack = new Stack<>();
        while (!left.empty()) tmpStack.push(left.pop());

        StringBuilder result = new StringBuilder();

        while (!tmpStack.empty()) result.append(tmpStack.pop());
        while (!right.empty()) result.append(right.pop());
        System.out.println(result);
    }
}