package 继承;

public class ExtendsTest01 {
    public static void main(String[] args) {
        //创建普通账户
        Account act = new Account();
        act.setActno("111111");
        act.setBalance(1000000);
        System.out.println(act.getActno());
        System.out.println(act.getBalance());

        //创建信誉账户
        CreditAccount1 creditAccount1 = new CreditAccount1();
        creditAccount1.setActno("22222222");
        creditAccount1.setBalance(-1000000);
        creditAccount1.setCredit(0.99);
        System.out.println("账号："+creditAccount1.getActno()+"余额: "+creditAccount1.getBalance()
            +"信誉度："+creditAccount1.getCredit());
    }
}

