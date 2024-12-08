package bilibili.src.pt04.test13;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("熏",17,"小提琴");
        GirlFriend gf2 = new GirlFriend("椿",18,"青梅竹马");
        GirlFriend gf3 = new GirlFriend("凛",18,"圣杯战争");
        GirlFriend gf4 = new GirlFriend("麻衣学姐",19,"模特");
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum += gf.getAge();
        }

        int avg = sum/arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg){
                System.out.println(gf.getName()+", "+gf.getAge()+", "+gf.getHobby());
                count ++;
            }
        }
        System.out.println(count);
    }
}
