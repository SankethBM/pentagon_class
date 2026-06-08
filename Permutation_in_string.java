public class Permutation_in_string {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        String rev = new StringBuilder(s1).reverse().toString();

        if (s2.contains(s1) || s2.contains(rev)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
