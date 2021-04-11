public class StringMethodsDemo {
    public static void main(String[] args) {
        char[] ch = { ' ', ' ', 'a', 'k', 'a', 's', 'h', ' ', 'd', 'a', 's', ' ' };
        String s = new String(ch);

        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.substring(6, 9));
        System.out.println(s.replace(' ', '_'));
        System.out.println(s.indexOf('a', 5));
        System.out.println(s.toUpperCase());
        System.out.println(s.trim().length());
    }
}
