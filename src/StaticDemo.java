class Employee
{
    String name;                        //Static Variables are same for all objects
    int age;                            //Non-Static variables are different for all objects
    String eid;                         //Cannot use non-static variable in static block
    int salary;
    static String ceo;

    static                              //When you load on class
    {                                   //Class loads first
        ceo = "Mark";
        System.out.println("In Static");
    }

    public Employee()                   // When you load on constructor
    {
        System.out.println("In Constructor");
    }

    public void show()
    {
        System.out.println(name + " : "+ age + " : "+ eid +" : "+ salary + " : " + ceo);
    }
}
public class StaticDemo {

    public static void main(String[] args)
    {
        Employee Immanuel = new Employee();
        Immanuel.age = 22;
        Immanuel.name = "Immanuel";
        Immanuel.eid = "UR15ME190";
        Immanuel.salary = 36000;


        Employee Ashina = new Employee();
        Ashina.age = 20;
        Ashina.name = "Ashina";
        Ashina.eid = "UR15EC090";
        Ashina.salary = 40000;


        Immanuel.show();
        Ashina.show();

    }
}
