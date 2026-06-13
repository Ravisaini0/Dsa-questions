class Recursion{
    public static void revarse(int idx,String str){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        revarse(idx-1, str);
       
    }
    public static void main(String[] args) {
        String str="abcd";
       int idx=str.length()-1 ;
       revarse(idx, str);
        System.out.println("time complexity = O(n)");
    }
}