import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        if(str==null || n==0) System.out.println("Invalid input");
        int start = -1;
        int end = -1;
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='I' && count>0 ){
                start = i;
                break;
            } 
            else if(str.charAt(i)=='I'){
                count++;
            }
        }
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i)=='I'){
                end = i;
                break;
            } 
        }

        if(end!=-1 && start!=-1){
            System.out.println(end-start+1);
        }
        else{
            System.out.println(0);
        }
    }   
}
