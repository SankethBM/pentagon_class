public class Remove_part {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        StringBuilder str = new StringBuilder(s);

        System.out.println(str.indexOf(part));

        while(str.indexOf(part) != -1){
            int idx = str.indexOf(part);
            str.replace(idx, idx+part.length(), "");
        }
        System.out.println(str);

    }
}
