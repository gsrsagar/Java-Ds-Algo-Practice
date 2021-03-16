package Ds.src.Day2;

class Fraction {
    private int d;
    private int n;
    
    Fraction() {
        d = 1;    
    }
    
    Fraction(int n, int d) {
        if ( d < 0) {
            d = -d;
            n = -n;
        }
        this.d = d;
        this.n = n;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    
    public  Fraction add(Fraction other) {
        int d = this.d * other.d;
        int n = this.n * other.d + other.n * this.d;
        int g = gcd(n, d);
        n /= g;
        d /= g;
        return new Fraction(n, d);
    }
    
    public static Fraction fromString(String s) {
        String[] arr = s.split("/");
        return new Fraction(Integer.valueOf(arr[0]), Integer.valueOf(arr[1]));
    }
    
    @Override
    public String toString() {
        return n + "/" + d;
    }
}