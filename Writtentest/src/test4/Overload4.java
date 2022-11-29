package test4;

public class Overload4 {
	
    double series(double n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double term = 1.0 / i;
            sum += term;
        }
        return sum;
    }
    
    double series(double a, double n) {
        double sum = 0;
        int x = 1;
        for (int i = 1; i <= n; i++) {
            int e = x + 1;
            double term = x / Math.pow(a, e);
            sum += term;
            x += 3;
        }
        return sum;
    }
    
    public static void main(String args[]) {
    	Overload4 obj = new Overload4();
        System.out.println("First series sum = " + obj.series(5));
        System.out.println("Second series sum = " + obj.series(3, 8));
    }
}

	
	


