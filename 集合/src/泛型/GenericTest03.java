package 泛型;
/*
自定义泛型
    自定义泛型的时候,<>尖括号是一个标识符,可以随便写
    java源代码中经常出现的:
        <E>和<T>
        E是Element单词首字母
        T是Type单词首字母
 */
public class GenericTest03<saivjasoivas> {  //saivjasoivas 这是随便写的,只要是标识符
    public void doSome(saivjasoivas o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        //new对象的时候指定了泛型是String类型 ,所以类型也必须是String类型
        GenericTest03<String> gt = new GenericTest03<>();
        gt.doSome("abc");

        GenericTest03<Integer> gt1 = new GenericTest03<>();
        gt1.doSome(100);

        //不使用泛型就是Object类型
        GenericTest03 gt2 = new GenericTest03();
        gt2.doSome("0");
    }
}
