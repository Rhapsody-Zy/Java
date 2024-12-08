package bilibili.src.pt04.test09;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] arr = new Goods[3];

        //2.创建三个商品对象
        Goods g1 = new Goods("001","小米",3999,100);
        Goods g2 = new Goods("002","狗屁王",399,50);
        Goods g3 = new Goods("003","台灯",99,70);

        //3.把商品加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //4.遍历
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }
     }
}
