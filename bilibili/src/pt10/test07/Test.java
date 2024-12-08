package bilibili.src.pt10.test07;

import java.util.ArrayList;

    /*
    要求1：该方法能养所有品种的猫，但是不能养狗
    要求2：该方法能养所有品种的狗，但是不能养猫
    要求3：该方法能养所有的动物，但是不能传递其他类型
    */
public class Test {
    public static void main(String[] args) {
        ArrayList<PersianCat> list1 = new ArrayList<>();
        ArrayList<LiHuaCat> list2 = new ArrayList<>();
        ArrayList<HuskyDog> list3 = new ArrayList<>();
        ArrayList<TeddyDog> list4 = new ArrayList<>();

        keepPet(list1);
        keepPet(list2);
        keepPet(list3);
        keepPet(list4);
    }

    /*
    public static void keepPet(ArrayList<? extends Cat> list){}
    */

    /*
    public static void keepPet(ArrayList<? extends Dog> list){}
    */

    public static void keepPet(ArrayList<? extends Animal> list){

    }
}
