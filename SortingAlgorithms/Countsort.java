import java.util.Arrays;
import java.util.HashMap;

public class Countsort{

     //method-01
    public static void countsort(int originlarr[]){
     
        //finding the max elem 
        int max=originlarr[0];
        for (int i = 1; i < originlarr.length; i++) {
            if(max<originlarr[i]){
                max=originlarr[i];
            }
        }
        //creating the frequency array
        int[] frequencyarry=new int[max+1];
        //traversing through original array to get the frequency od each element
        for (int element :originlarr) {
            frequencyarry[element]++;
        }
        //adding the frequency howany times it repeated  modifiying the original array
        int index=0;
        for (int i = 0; i < frequencyarry.length; i++) {
            while (frequencyarry[i]>0) {
                originlarr[index]=i;
                index++;
                frequencyarry[i]--;//here repeation of the 2 repaear 2 times that we need to upadted the original array 
            }
        }

        


    }
    //method-02(using hasmap)
    public static void usingHashmap(int[] arr){
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();

        HashMap<Integer,Integer> frequenHashMap=new HashMap<>();
        for (int i : arr) {
            frequenHashMap.put(i, frequenHashMap.getOrDefault(i, 0)+1);

        }

        //step-03 addding updating the original array forming the countarry
        //by taking the start index as min and end index as max
        int index=0;
        for (int i = min; i <=max; i++) {
            int count=frequenHashMap.getOrDefault(i, 0);//here if element not prefsent means it will take the 0 as the frequency not null so we use the .getdaefault() method
            //so we need to traves upto the count
            for (int j = 0; j < count; j++) {
                arr[index]=i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={3,4,1,3,2,5,2,8};
        // countsort(arr);
        usingHashmap(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}