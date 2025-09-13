public class PrimeNUmber {
    public static void main(String[] args) {
        int n=33;

        boolean isPrime=true;
        if(n<2){
            isPrime=false;
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        String result=isPrime?"prime":"not ";
        System.out.println(result);



    }
}
