package bilibili.src.pt10.test06;

public class GenericsDemo2 {
    public static void main(String[] args) {
        //泛型类MyArrayList测试类
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        String s = list.get(0);
        System.out.println(s);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(111);
        list2.add(222);
        list2.add(333);

        Integer i = list2.get(0);
        System.out.println(i);
        System.out.println(list2);
    }

}
