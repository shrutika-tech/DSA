import java.util.*;
public class arrays{

    public static int linearsearch(int num[], int key){
         
         for (int i =0; i<num.length; i++){

                if (num[i]==key
                ){
                    return i;
                }
         }
        return -1;
    }

    public static int largest(int num[]){
        int largest= Integer.MIN_VALUE;

        for(int i = 0; i< num.length; i++){
            if(largest < num[i])
            {
                largest= num[i];
            }
        }
         return largest;
    }

    public static int binarysearch(int num[],int key){
        int start=0;
        int end= num.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(key==num[mid])
            {
                return mid;
            }
            if(key<num[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void reverse(int num[]){
        int first=0;
        int last=num.length-1;

        while(first<last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last--;
        }
    }

    public static void pairs(int num[]){
         
         for (int i=0; i<num.length; i++){
                int curr=num[i];
        
            for (int j = i+1; j<num.length; j++){
                    System.out.print("("+curr +"," + num[j]+")");
            }
             System.out.println();
         }
        
    }

    public static void subarrays(int num[]){
         
         for (int i=0; i<num.length; i++){
                int start= i;

            for (int j =i; j<num.length;j++){
                int end= j;
            
                for (int k = start; k<=end ; k++){
                    System.out.print(num[k]+" ");
            }
             System.out.println();
            }
         }s
       
    }


    public static void main(String[] args) {
         int num[] = {2, 4, 6, 8, 10};
       int key= 8;
       /* int index=linearsearch(num,key);  
        if (index==-1){
            System.out.println("Notfound");
        }
        else{
            System.out.println("Element is at index:" + index);
        }*/
       //System.out.println(largest(num));
       /*int index=binarysearch(num,key);
       if(index==-1){
           System.out.println("Element not found");
       }
       else{
           System.out.println("Element is at index:" + index);
       }*/

      /*reverse(num);
      for(int i=0; i<num.length; i++){
          System.out.print(num[i]+" ");
      }     
      System.out.println();*/
      //pairs(num);
      subarrays(num);
    }
}
