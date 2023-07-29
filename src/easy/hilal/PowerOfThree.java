package easy.hilal;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {

//n=1 3^0=1
        if (n == 1) return true; // Base Condition
        if (n % 3 != 0 || n <= 0) return false;


        return isPowerOfThree(n /3);
    }

}
