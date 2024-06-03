interface Prime{
    public int primePalindrome(int n);
    public boolean isPrime(int n);
}

public class App implements Prime {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("hello");
    }

    public int primePalindrome(int n){
        return 0;
    }

    public boolean isPrime(int n){
        for(int i = 0; i < n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
