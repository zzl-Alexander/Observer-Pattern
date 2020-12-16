import java.util.ArrayList;
import java.util.List;
public  abstract class Subject {
    protected ArrayList<Observer> observers= new ArrayList();
    //注册方法
    public void attach(Observer observer){
        observers.add(observer);
    }
    //注销方法
    public void detach(Observer observer){
        observers.remove(observer);
    }
    //消息通知方法
    public  abstract void Notify();
}
