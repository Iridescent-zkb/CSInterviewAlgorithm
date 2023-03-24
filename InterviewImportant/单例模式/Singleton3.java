package InterviewImportant.单例模式;

//4.双重检查锁(DLC)
//这种写法在getSingleton方法中对singleton进行了两次判空，第一次是为了不必要的同步，第二次是在singleton等于null的情况下才创建实例。
//在这里使用volatile会或多或少的影响性能，但考虑到程序的正确性，牺牲这点性能还是值得的。 DCL优点是资源利用率高，
// 第一次执行getInstance时单例对象才被实例化，效率高。缺点是第一次加载时反应稍慢一些，在高并发环境下也有一定的缺陷，虽然发生的概率很小。
// DCL虽然在一定程度解决了资源的消耗和多余的同步，线程安全等问题，但是他还是在某些情况会出现失效的问题，也就是DCL失效，
// 在《java并发编程实践》一书建议用静态内部类单例模式来替代DCL。
public class Singleton3 {
    private Singleton3(){}
    public volatile static Singleton3 instance3;
    public static Singleton3 getInstance3(){
        if (instance3 == null){
            synchronized (Singleton3.class){
                if (instance3 == null){
                    return new Singleton3();
                }
            }
        }
        return instance3;
    }
}
