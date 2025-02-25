public class Main {
    public static void main(String[] args) {
        int x;
        String str;
        Sign sign1 = new Sign("ABC222DE", 3);       // test case
        x = sign1.numberOfLines();
        System.out.println(x);
        str = sign1.getLines();
        System.out.println(str);

        Sign sign2 = new Sign("ABCD", 10);      // test case
        x = sign2.numberOfLines();
        System.out.println(x);
        str = sign2.getLines();
        System.out.println(str);

        Sign sign3 = new Sign("ABCDEF", 6);     // test case
        x = sign3.numberOfLines();
        System.out.println(x);
        str = sign3.getLines();
        System.out.println(str);

        Sign sign4 = new Sign("", 4);       // test case
        x = sign4.numberOfLines();
        System.out.println(x);
        str = sign4.getLines();
        System.out.println(str);

        Sign sign5 = new Sign("AB_CD_EF", 2);       // test case
        x = sign5.numberOfLines();
        System.out.println(x);
        str = sign5.getLines();
        System.out.println(str);
    }
}
