class Main {
    public static void main(String[] args) {
        System.out.println("Second Largest Number.");
        int []arr={10,20,30,40,50,40,32,60,53};
        int max=0;
        int sec=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                sec=max;
                max=arr[i];
            }
            if(sec<arr[i]&&arr[i]!=max){
            sec=arr[i];
        }
        }
        
        System.out.println(sec+"="+"sec");
         System.out.println(max+"="+"max");
         System.out.println("Time complextiy O(n)");
    }
}