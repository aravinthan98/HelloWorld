package string;

import java.util.HashMap;

public class findfirstnonrepeatingchar {
    public static void main(String[] args) {
        String s="advsasvhdt";
        //----------WAY1--------------
//        for(int i=0;i<s.length();i++){
//            boolean value=false;
//            for(int j=0;j<s.length();j++){
//                if(i!=j){
//                    if(s.charAt(i)==s.charAt(j)){
//                        value=true;
//                        break;
//                    }
//                }
//
//            }
//            if(!value){
//                System.out.print(s.charAt(i));
//                break;
//            }
//        }
        //--------------WAY2------------
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                System.out.print(s.charAt(i));
                break;
            }
        }
    }
}
