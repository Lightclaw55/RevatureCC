public class Convert {
    public static void main(String[] args) {

        System.out.println(convert(5));
        System.out.println(convert(1));
        System.out.println(convert(3));

    }

    public static int convert(int minutes)
    {
        return minutes * 60;
    }
}
