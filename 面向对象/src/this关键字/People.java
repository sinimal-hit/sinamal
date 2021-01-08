package this关键字;

public class People {

    private String name;

    public People() {

    }

    public People(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public static void run(){
        People he = new People();
        System.out.println(he.name+"在跑步");
    }
}
