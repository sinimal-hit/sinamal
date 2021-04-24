package 用户业务作业;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
           
            userService.register("jacklove","1234");
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
