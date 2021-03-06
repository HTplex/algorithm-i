package week1;
import java.util.Arrays;
import java.util.Scanner;
public class BDQuickUnionImprovingUser {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    BDQuickUnionImproving a = new BDQuickUnionImproving(200000);

    // long time=0;
    // for(int n=0;n<200000;n++){
    /*
     * long i=System.nanoTime(); a.union(0, 2); a.union(3, 5); a.union(5, 6); a.union(0, 7);
     * a.union(6, 2); a.union(3, 2); System.out.println(a.connected(0, 8));
     * System.out.println(a.connected(0, 6)); System.out.println(a.connected(0, 2));
     * System.out.println(a.connected(0, 0)); time+=(System.nanoTime()-i); // }
     * System.out.println(time);
     */

//    a.union(2, 7);
//    a.union(0, 5);
//    a.union(0, 4);
//    a.union(9, 5);
//    a.union(8, 9);
//    a.union(3, 6);
//    a.union(7, 3);
//    a.union(4, 3);
//    a.union(4, 1);
//    for (int i = 0; i < a.id.length; i++) {
//      System.out.print(a.id[i] + " ");
//    }
    String[] s=new String[200000];
    for(int i=0;i<s.length;i++){
      s[i]=in.next();
    }
    for(int i=0;i<s.length;i++){
      for(int i1=1;i1<s.length;i1++){
        if(diff(s[i1],s[i])<3){
         a.union(i, i1); 
        }
      }
      if(i%1000==0) System.out.println(i);
    }
    int[] m=new int[200000];
    for(int i=0;i<200000;i++){
      m[i]=a.root(i);
    }
    int sum=200000;
    Arrays.sort(m);
    for(int i=0;i<200000-1;i++){
      if(m[i]==m[i+1])
        sum--;
    }
    System.out.println(sum);
  }

  public static int diff(String s1, String s2) {
    int sum=0;
    for (int i = 0; i < s1.length(); i++) {
      if(s1.charAt(i)!=s2.charAt(i))
        sum++;
    }
    return sum;
  }
}
