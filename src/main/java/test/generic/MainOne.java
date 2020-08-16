package test.generic;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/1/4 16:59
 */
public class MainOne {
    public static void main(String[] args) {
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p') {
                break;
            }
            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
