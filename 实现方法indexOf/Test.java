package 实现方法indexOf;

public class Test {
    public static void main(String[] args) {
        String str = "hello";
        int index = indexOf(str,"ll");
        System.out.println(index);
    }

    public static int indexOf(String str, String toFind) {
        char[] littleChars = toFind.toCharArray();
        char[] bigChars = str.toCharArray();
        if (str.contains(toFind)) {
            Character character = littleChars[0];
            for (int i = 0; i < bigChars.length; i++) {
                if(character.equals(bigChars[i])){
                    return i;
                }
            }
        }else {
            return -1;
        }
        return -1;
    }
}
