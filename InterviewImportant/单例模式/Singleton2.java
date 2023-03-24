package InterviewImportant.单例模式;

//3.懒汉模式（线程安全)
//这种写法能够在多线程中很好的工作，但是每次调用getInstance方法时都需要进行同步，造成不必要的同步开销，
// 而且大部分时候我们是用不到同步的，所以不建议用这种模式。
public class Singleton2 {
    private Singleton2() {}
    public static Singleton2 instance2;

    public static synchronized Singleton2 getInstance2() {
        if (instance2 == null) {
            return new Singleton2();
        }
        return instance2;
    }
}
