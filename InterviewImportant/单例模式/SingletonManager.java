package InterviewImportant.单例模式;


import java.util.HashMap;
import java.util.Map;
//!!!严格来说，不应该称之为单例模式,只保证只get到一个实例，不保证只new一个实例。
//7.使用容器实现单例模式
//用SingletonManager 将多种的单例类统一管理，在使用时根据key获取对象对应类型的对象。这种方式使得我们可以管理多种类型的单例，
// 并且在使用时可以通过统一的接口进行获取操作，降低了用户的使用成本，也对用户隐藏了具体实现，降低了耦合度。
public class SingletonManager {
    private static Map<String,Object> objMap = new HashMap<String,Object>();
    private SingletonManager(){}
    public static void registerService(String key, Object instance){
        if (!objMap.containsKey(key)){
            objMap.put(key,instance);
        }
    }
    public static Object getService(String key){
        return objMap.get(key);
    }
}

