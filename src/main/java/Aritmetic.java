public class Aritmetic {


    public Aritmetic() {
        //isPrime(7);
        //gcd(1071, 462);
        isCoprime(35,64);
    }

    private void isCoprime(int i, int i1) {
        if(gcd(i, i1) == 1) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }

    private int gcd(int a, int b)
    {
        if(b > a)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        while( b > 0)
        {
            int remainder = a%b;
            a = b;
            b = remainder;
        }

        System.out.print(a);
        return a;
    }

    private void isPrime(int number) {
        boolean isPrime = true;
        for(int i = 1; i < number; i++) {
            if(number % i == 0 && i != 1) {
                isPrime = false;
                break;
            }
        }
        System.out.print(String.valueOf(isPrime));
    }
}
