/*
    顾客来调用这个菜单,厨师来实现菜单
    也就是顾客手里有这个菜单,就可以有菜单这个属性
    如果顾客这里只有中餐后者西餐厨师的属性,也就是写死了,那程序的耦合度就上去了
 */
public class Customer {
    private FoodMenu foodmenu;//属性，顾客手里有菜单
    public Customer(){

    }
    public Customer(FoodMenu foodmenu){
        this.foodmenu = foodmenu;
    }
    public void setFoodmenu(FoodMenu foodmenu) {

        this.foodmenu = foodmenu;
    }

    public FoodMenu getFoodmenu() {

        return foodmenu;
    }
    public void order(){//顾客点菜
        //FoodMenu fm = this.getFoodmenu(); 当然也可以直接访问，因为在本类中
        foodmenu.shizichaodan();
        foodmenu.yuxiangrusi();
    }
}
