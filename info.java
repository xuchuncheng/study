
public class info {
    public static void main(String[] args) {
        int i = 1;
        for (int j = 0; j < 99; j++) {
            i = i++;
        }
        System.out.println("i=" + i);
        int l = 1;
        for (int k = 0; k < 99; k++) {
            l = ++l;
        }
        System.out.println("l=" + l);
        int a = 10;
        int b = 20;
        System.out.println(2<<3);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a=" + a + ",b=" + b);
		System.out.println("a=" + a + ",b=" + b+"我修改了这个文件");
	}
}
