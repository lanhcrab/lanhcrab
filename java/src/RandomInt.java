public class RandomInt {

    /**
     * A function returning a pseudo-random integer
     * @param n the upper bound of the generated pseudo-random number
     * @return a pseudo-random number less than @n
     */
    public static int random(int n){//n = 100
        // a pseudo-random real between 0.0 and 1.0
        double r = Math.random() * n; //r = 50 break;

        // Explicit type conversion (cast) from double to int.
        // return a pseudo-random integer between 0 and n-1
        return  (int) r;

		/* We can choose to write directly :
			return (int) (Math.random() * n); */
    }

    public static void main(String[] args) {

        int k = 100;
        //int r;
        while (true) {
            if (random(k) == 50) {
                break;
            }
            else System.out.println(random(k));
        }
    }
}

