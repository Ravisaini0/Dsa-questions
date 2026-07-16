public class SecondLargestElement {
    public static void main(String[] args) {
        
    
    //logic

    //sab se phail 1st index ko largest no. mana ga fir pura array me trevese kra ga 
    //jo bhi element first index ke valuse se bada hoga use switch ke ga or sath he 
    //jo last max h use sec bana daga
    // ab pura loop complete hona ka baad aapan ko max or sec dono mil jaya gai
    // or sath me ya bhe check kra ga ki arr me sec koi baada to nhi h or sath he ya 
    //bhe ke arr me vo mix ke baraber bhe nhi ho
    //ager esa h too sec ko usesa replase kr da ga 

    //dry 


    //arr[]
    //max=arr[0];
    //sec;
    //arr too trverse kiya sath he
    //if(max<arr[i])
    ////sec=max;
    //max=arr[i];
    //else if(sec<arr[i]&&arr[i]!=max)
    //sec=arr[i];

    
    //Time complexity
    //O(n)

    //code
  int arr[] = {10};
    int max=arr[0];
    int Sec=0;
    if(arr.length < 2){
    System.out.println("Second largest not possible");
    return;
}
    for(int i=0;i<arr.length;i++){
        if (max<arr[i]) {
            Sec=max;
            max=arr[i]; 
        }else if(arr[i]>Sec&& arr[i]!=max){
            Sec=arr[i];
        }
        
    }
     System.out.println(Sec +" Second largest Number");
}
}
