package samples;

public class Greatest {
    public int  whichIsGreatest(int a , int b, int c) {
        if (a > b && a > c)
            return a;
        else if(b>c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Greatest g1 = new Greatest();
        System.out.println(g1.whichIsGreatest(3,5,8));
        String sss = "20 October 2020";
        String[]chck = sss.split(" ");
        System.out.println(chck[2]);
    }
}
