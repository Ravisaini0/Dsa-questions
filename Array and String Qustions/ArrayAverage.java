public class ArrayAverage {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,10,3,4,10,10};
        double average=0;
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        average=sum/ arr.length;
        System.out.print(average);
    }
}
