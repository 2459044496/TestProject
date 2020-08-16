package com.cui.leetcode;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/4/19 12:35
 */
public class numsChange {
    public static void main(String[] args) {
        System.out.println(get(123));
        System.out.println(1/10);
        System.out.println(1%10);
        System.out.println(revers(-120));
    }

    static int get(int num) {
        String hexNum = Integer.toHexString(num);
        return 1;
    }

    /**
     * 好思路，但是只能用int，不能用long
     * @param x
     * @return
     */
    static int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }

    static int revers(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

}
