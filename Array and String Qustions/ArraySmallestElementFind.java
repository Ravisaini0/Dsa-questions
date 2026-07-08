class ArraySmallestElementFind {

    public static void main(String[] args) {
        int arr[]={10,10,20,30,0,1,4,5};
        int min=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
             System.out.print(min);
    }
}