package bilibili.src.pt04.test08;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("jojo",100,"男");
        Role r2 = new Role("dio",100,"不是人");

        r1.showRoleInfo();
        r2.showRoleInfo();

        //开始格斗
        while (true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + " KO了 " + r2.getName());
                break;
            }

            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + " KO了 " + r1.getName());
                break;
            }
        }
    }

}
