public class FindMaxElement{
     
    public static void main(String[] args){
        
        int[] arr = {1,10,25,48};
        int firstElement=arr[0];
      
        for(int i=0;i<4;++i){
          if(arr[i]>=firstElement){
             firstElement=arr[i];
          }
        }
        
        System.out.println(firstElement);//최댓값 출력 
         
    }
  
}
