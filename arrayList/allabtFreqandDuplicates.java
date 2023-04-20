package arrayList;

import java.util.*;

public class allabtFreqandDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        Arrays.sort(arr);
        for(int i=0;i<n;i++){
           if(!list.contains(arr[i])) {
                list.add(arr[i]);

            }
        }
        int max=Integer.MIN_VALUE;
        int freq=0;
        for(Integer i:list){
            int count=0;
            for(int j=0;j<n;j++){
                if(i.equals(arr[j])){
                    count++;
                }
            }
            if(max<count){
                freq=i;
            }
            max=Math.max(max,count);

        }
        System.out.println(freq+":"+max);
//        int max=Integer.MIN_VALUE;
//        int num=0;
//        for(Integer i:list){
//            int count=0;
//            for(int j=0;j<n;j++){
//                if(i.equals(arr[j])){
//                    count++;
//                }
//            }
//            if(count>max){
//                num=i;
//            }
//            else if(count==max){
//              num=i>num?i:num;
//            }
//             max=Math.max(max,count);
//
//        }
//        System.out.print(num);

    }
}
