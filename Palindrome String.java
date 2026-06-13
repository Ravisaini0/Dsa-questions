import java.util.*;
class Palindromes{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");

    String str= sc.nextLine();
    String rev="";
    int coutner=0;
    for(int i=str.length()-1;i>=0;i--){
        rev+=str.charAt(i);
        coutner++;
    }
System.out.println("revarse"+ " = "+rev);
System.out.println("coutner "+coutner);
if( str.equals(rev) ){
    System.out.println("Palindrome String");
}else{
    System.out.println("Not Palindrome String");
}

}
    
}