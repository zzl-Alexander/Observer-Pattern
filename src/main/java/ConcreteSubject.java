public class ConcreteSubject extends Subject{

    @Override
    public void Notify() {
        for(Observer obs:observers){
            obs.update();
        }
    }
}
