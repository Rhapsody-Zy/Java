package bilibili.src.pt04.test07;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    //r.攻击(r2) - 方法的调用者攻击参数

    public void attack(Role role){
        //this表示方法的调用者
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //修改一下挨揍人的血量
        int remainBoold = role.getBlood() - hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        role.setBlood(remainBoold);
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害，" + role.getName() + "还剩" + remainBoold + "点血");
    }
}
