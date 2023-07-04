package leedecodePregram;

import java.util.Arrays;

public class Increasing_Decreasing_String_1370 {
    public static void main(String[] args) {
        String s="aaaabbbbcccc";
        System.out.println(sortString(s));
    }
    public static String sortString(String s) {
//        char[] charr=s.toCharArray();
//        Arrays.sort(charr);
//        StringBuilder sb=new StringBuilder();
//        StringBuilder sb2=new StringBuilder();
//
//        StringBuilder sb3=new StringBuilder();
//        String str=new String(charr);
//
//        sb2.append(str);
//
//        boolean flag=true;
//        //  int len=sb2.length()
//        while(sb2.length()>0){
//
//
//            sb.append(sb2.charAt(0));
//            char dup=sb2.charAt(0);
//            sb2.deleteCharAt(0);
//            for(int i=0;i<sb2.length();i++){
//                char ch=sb2.charAt(i);
//                if(dup!=ch){
//                    sb.append(ch);
//                    dup=ch;
//                    sb2.deleteCharAt(i);
//                    i--;
//                }
//            }
//            if(!flag){
//                sb3.append(sb.reverse().toString());
//                sb.setLength(0);
//            }
//            else{
//                sb3.append(sb.toString());
//                sb.setLength(0);
//
//            }
//            flag^=true;
//        }
//        return sb3.toString();



        //------------Better aproach---------------

            int[] arr = new int[26];

            for(int i=0; i<s.length(); i++){
                arr[s.charAt(i)-'a']++;
            }
            // System.out.print(Arrays.toString(arr));

            StringBuilder sb = new StringBuilder();
            while(sb.length() < s.length()){
                for(int i=0; i<26; i++){
                    if(arr[i]>0){
                        sb.append((char)('a'+i));
                        arr[i]--;
                    }
                }
                for(int i=25; i>=0; i--){
                    if(arr[i]>0){
                        sb.append((char)('a'+i));
                        arr[i]--;
                    }

                }
            }
            return sb.toString();
        }
//    }
}
