package AutoClasses;

public class Auto {
    /**Open - Close принцип который должен быть открытым для расширения, но закрытым для модификации*/

    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Supra supra = new Supra();
        workInTaxi(supra);
    }

    static void workInTaxi(Car car) {
        car.workInTaxi();

    }
}

interface Car{
    void workInTaxi();
}

     class Toyota implements Car {
        void getPassengers(){
            System.out.println("Подбирает пассажиров");
        }
         @Override
         public void workInTaxi() {
             getPassengers();
         }
     }
class Supra extends Toyota{
    @Override
    public void workInTaxi() {
        getPassenger();
    }
    void getPassenger(){
        System.out.println("подбирает пассажира");
    }
}


