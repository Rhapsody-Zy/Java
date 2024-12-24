package bilibili.src.pt18.dynamicproxy;

public interface Star {
    //可以把所有需要代理的的方法定义在接口中
    public abstract String sing(String name);

    public abstract void dance();

}

