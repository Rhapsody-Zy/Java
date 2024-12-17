package bilibili.src.pt15.a14threadTesk.Tesk1;

public class ThreadDemo {
    public static void main(String[] args) {

        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();

        t1.start();
        t2.start();

    }
}
