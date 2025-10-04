import java.util.HashMap;

public class MurkyCount {
    public static void main(String[] args) {
       String s = "mumurry";
        HashMap <Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }
        int uni=0;
        for(int value:map.values()){
            if(value==1){
                uni++;
            }
        }
        System.out.println(uni);
    }
}
