public class AbundantNUmber {
    public static void main(String[] args) {
        int number=18;
        int sum=0;
        for(int i=1;i<=number;i++){

            if(number%i==0){
                sum=sum+i;
            }
        }

        if(sum>number){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
