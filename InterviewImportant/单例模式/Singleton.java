package InterviewImportant.单例模式;

//定义：
//        https://blog.csdn.net/itachi85/article/details/50510124
//        https://www.runoob.com/design-pattern/singleton-pattern.html



//1.饿汉模式（线程安全）
//这种方式在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快。 这种方式基于类加载机制避免了多线程的同步问题，
// 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance显然没有达到懒加载的效果。
public class Singleton{
    public static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
