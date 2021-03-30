package number;

import java.math.BigDecimal;

/*
  1,BigDecimal 属于大数据,精度极高,不属于基本数据类型,属于java对象(引用数据类型)
        这是SUN提供的一个类,专门用在财务软件当中

  2,注意:财务软件中的double是不够用的,之前有一个学生区面试,经理问了一个这样的问题:
      你处理过财务数据吗?用的哪一种类型
        千万别说double,说java.math.BigDecimal
 */
public class BigDecimalTest01 {
    public static void main(String[] args) {
        //精度极高的100
        BigDecimal v1 = new BigDecimal(100);
        //精度极高的200
        BigDecimal v2 = new BigDecimal(200);
        //v1 + v2 是不行的,v1和v2都是引用,不能直接使用+求和,通过方法来求和
        BigDecimal v3 =  v1.add(v2);
        System.out.println(v3);
    }
}
