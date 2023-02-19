package Employee1;



public class Workers {/**single responsibility класс который должен иметь всего лишь одну причину на изменение*/
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.cleanFloor() ;{
            System.out.println("Рабочий убирается на рабочем месте \n");
        }
        employeeFacade.cook();{
            System.out.println("Рабочий готовит еду");
        }
        employeeFacade.getClass();

    }
}
    interface Employee {
    int getSalary();
    }
    class Cook implements Employee{
        @Override
        public int getSalary(){
            return 0;
        }
        void cook(){}
    }
    class Janaitor implements Employee{
        @Override
        public int getSalary(){
            return 0;
        }
        void cleanFloor(){}
    }
    class EmployeeFacade{
        Cook cook = new Cook();
        Janaitor janaitor = new Janaitor();
        void cook(){
            cook.cook();
        }
        boolean cleanFloor(){
            janaitor.cleanFloor();
            return true;
        }
    }

