package InterfaceSugre;

public class InterfaceSug {/** Interface Segregation Principle: мы не должны зависеть от интерфейса который мы не используем*/
    public static void main(String[] args) {
        Iworker iworker = new Waiter();
        Worker worker = new Cook();
        worker.work();
        iworker.work();
        iworker.work();
        iworker.eat();
    }
}
interface Worker{
    void work();
}
interface Eater{
    void eat();
}
interface Iworker extends Worker, Eater{

}
class Waiter implements Iworker{
    @Override
    public void work() {
        System.out.println("работает");
    }

    @Override
    public void eat() {
        System.out.println("ест");
    }
}
class Cook implements Worker{
    @Override
    public void work() {
        System.out.println("Готовит еду");

    }
}
