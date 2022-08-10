package BasicPrograms;

public class ReversingAString {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb);

    }
}
