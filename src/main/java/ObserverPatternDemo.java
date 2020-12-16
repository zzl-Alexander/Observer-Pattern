public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject = new ConcreteSubject();
        ConcreteObserver1 x=new ConcreteObserver1();
        ConcreteObserver2 y=new ConcreteObserver2();
        subject.attach(x);
        subject.attach(y);
        subject.Notify();

        System.out.println("\n移除工人核查后....................");

        subject.detach(y);
        subject.Notify();
    }
}
