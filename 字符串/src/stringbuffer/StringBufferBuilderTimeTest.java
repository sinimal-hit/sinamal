package stringbuffer;

public class StringBufferBuilderTimeTest {
    public static void main(String[] args) {
        StringTest();
        StringBufferTest();
        StringBuilderTest();

    }
    public static void StringTest(){
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("String耗时:" + (end - start));
    }
    public static void StringBufferTest(){
        StringBuffer s1 = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s1.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer耗时:"+ (end - start));
    }

    public static void StringBuilderTest(){
        StringBuilder s2 = new StringBuilder("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s2.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder耗时:"+ (end - start));
    }
}
