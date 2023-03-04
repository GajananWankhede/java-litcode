package litcode;


import java.util.HashSet;

class HappyDemo {

    static int sumDigitSquare(int n)
    {
        int sq = 0;
        while (n > 0)
        {
            int digit = n % 10;
            sq += digit * digit;
            n = n / 10;
        }
        return sq;
    }


    public static boolean isHappy(int n) {

        HashSet<Integer> s = new HashSet<Integer>();
        s.add(n);

        // Keep replacing n with sum of
        // squares of digits until we either
        // reach 1 or we endup in a cycle
        while (true)
        {

            // Number is Happy if we reach 1
            if (n == 1)
                return true;

            // Replace n with sum of squares
            // of digits
            n = sumDigitSquare(n);

            // If n is already visited, a cycle
            // is formed, means not Happy

            if ((s.contains(n) && n != (int)s.toArray()[ s.size()-1 ] ))
                return false;

            // Mark n as visited
            s.add(n);
        }
    }


    public static void main(String[] args)
    {
        int n = 23;
        if (isHappy(n))
            return false;
        else
            return false;
    }


}
