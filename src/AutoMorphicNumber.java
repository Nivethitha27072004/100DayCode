public class AutoMorphicNumber {
    public static void main(String[] args) {
        int number=5;
        System.out.println(isAutoMorphicNumber(number));
    }

    private static boolean isAutoMorphicNumber(int number) {
        int square=number*number;
        while(number!=0){

            if(number%10==square%10){
                return true;
            }
            number=number/10;
            square/=10;
        }
        return false;

    }
}
