package InterviewImportant.单例模式;


//5. 静态内部类单例模式
//第一次加载Singleton类时并不会初始化sInstance，只有第一次调用getInstance方法时虚拟机加载SingletonHolder 并初始化sInstance ，
// 这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
public class Singleton4 {
    private Singleton4(){}
    public static class SingletonHolder{
        private static final Singleton4 sInstance = new Singleton4();
    }
    public static Singleton4 getInstance(){
        return SingletonHolder.sInstance;
    }

}
