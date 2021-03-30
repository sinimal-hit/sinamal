package number;

import java.text.DecimalFormat;

/*
    数字格式化
        DecimalFormat,专门负责数字格式化.
        DecimalFormat df = new DecimalFormat("数字格式")
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
       /*
          数字的格式有哪些
            #代表任何数字
            ,代表千分位
            .代表小数点
            0代表不够时补0
        */
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.56);
        System.out.println(s);//1,234.56

        DecimalFormat df2 = new DecimalFormat("###,###.0000");//保证4个小数位,不够补上0;
        System.out.println(df2.format(1234.56));//1,234.5600
    }
}
