package InterviewImportant.单例模式;

//2.懒汉模式（线程不安全)
//懒汉模式申明了一个静态对象，在用户第一次调用时初始化，虽然节约了资源，但第一次加载时需要实例化，反映稍慢一些，而且在多线程不能正常工作。
public class Singleton1{
    private Singleton1(){}
    public static Singleton1 instance1;
    public static Singleton1 getInstance1(){
        if (instance1 == null){
            return new Singleton1();
        }
        return instance1;
    }
}



