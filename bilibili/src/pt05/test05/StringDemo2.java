package bilibili.src.pt05.test05;

public class StringDemo2 {
    public static void main(String[] args) {
        String result = reverser("abc");
        System.out.println(result);
    }

    public static String reverser(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            //快捷键.forr
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
