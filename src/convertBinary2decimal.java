public class convertBinary2decimal {
    public static void main(String[] args) {
        String binary="101";
        System.out.println(convertBinary(binary));

    }
    public static int convertBinary(String num){
        int power=1;
        int result=0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='1'){
                result=result+power;
            }
            power=power*2;
        }
        return result;
    }
}
