package com.bilibili.pt07.test06.demo3;

public class SharPei extends Dog{

    //因为沙皮狗吃的狗粮和骨头
    //父类中的方法不能满足我们的需求，所以需要进行重写

    @Override
    public void eat() {

        //可以用到父类中的狗粮，所以直接调用父类中的方法
        super.eat();    //吃狗粮
        //再而外增加一个啃骨头
        System.out.println("啃骨头");
    }
}
