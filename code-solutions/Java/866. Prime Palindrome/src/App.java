interface Prime{
    public int primePalindrome(int n);
    public boolean isPrime(int n);
    public boolean isPalindrome(int n);
}

public class App implements Prime {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("hello");
        App x = new App();
        int i = x.primePalindrome(9989900);
        System.out.println(i);
        
    }

    public int primePalindrome(int n){
        int currentNumber = n;
        while(n<=currentNumber){
            if(isPalindrome(currentNumber)){
                if(isPrime(currentNumber)){
                    return currentNumber;
                }
            }
            currentNumber++;

        }
        return 0;

    }

    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    public boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        String r = "";
        for(int i = s.length() - 1; i >= 0; i--){
            r = r + s.charAt(i);
        }
        if(r.equals(s)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
