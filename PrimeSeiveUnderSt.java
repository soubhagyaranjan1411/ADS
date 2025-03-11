public class PrimeSeiveUnderSt {
    public static void main (String [] args){
        //What is prime Sieve?
        //The prime sieve is an algo to efficiently generate all the prime
        //numbers up to a specified limit N

        //Steps
        //Create a boolean array "isPrime" where each index represents a number
        //if the number is prime
        //initially mark all the numbers from 2 to n
        //as true
        //starting from the first prime number 2, mark all the multiples of 2 as false
        //move to the next nuber that is still mark true
        //ans mark its all multiples as false
        //continue this until you reach square root of n
        int n=100;
        seive(n);

    }
    public static void seive(int n){
        boolean[] isprime=new boolean[n+1];
        for(int i=0;i<n;i++){
            isprime[i]=true;
        }
        isprime[0]=isprime[1]=false;
        for(int p=2;p*p<=n;p++){
            if(isprime[p]){
                for(int i=p*p;i<=n;i+=p){
                    isprime[i]=false;
                }
            }
        }
        System.out.println("Prime number up to: "+n);
        for(int i=0;i<n;i++){
            if(isprime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
