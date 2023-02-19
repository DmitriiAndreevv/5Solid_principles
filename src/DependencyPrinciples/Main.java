package DependencyPrinciples;

public class Main {/**Dependency Inversion Principle связывает классы между собой делая классы зависимыми друг от друга, создавая цепочки слоёв класса связывая их.  */
    public static void main(String[] args) {

    }

}
interface DAO {
    void execute();
}
class DateAccess implements DAO {
    public void execute() {
        System.out.println("выполняет");
    }

    class Client {
        DAO dateAccess = new DateAccess();

        void doJob() {
            dateAccess.execute();
        }
    }
}

