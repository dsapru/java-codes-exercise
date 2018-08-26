import java.util.Scanner;

public class Sol {
    static boolean isSubSequence(String S,
                                 String T, int m, int n) {
        int j = 0;

        for (int i = 0; i < n && j < m; i++)
            if (S.charAt(j) == T.charAt(i))
                j++;

        return (j == m);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String S = in.next();
        System.out.println("Enter string 2:");
        String T = in.next();
        int m = S.length();
        int n = T.length();
        boolean res = isSubSequence(S, T, m, n);

        if (res)
            System.out.println("0");
        else
            System.out.println("1");
    }
}

