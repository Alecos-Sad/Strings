package CreateTxtObject;

public class Demo {
    public static void main(String[] args) {
        char[] symbs = {'J', 'A', 'V', 'A', ' ', 'L', 'A', 'N', 'G'};
        String A = new String(symbs);
        System.out.println(symbs);
        String B = new String(symbs, 5, 4);
        System.out.println(B);
        System.out.println(A);
        byte[] nums = {65, 66, 67, 68, 69, 70};

        String D = new String(nums);
        System.out.println(D);
        String E = new String(nums,2,3);
        System.out.println(E);
    }


}
