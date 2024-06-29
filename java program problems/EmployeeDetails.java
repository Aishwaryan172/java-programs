class Employee{
    int id;
    String name;
    int salary;
    void acceptInput(int i,String n,int s){
        id = i;
        name = n;
        salary = s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.acceptInput(001,"aishu",50000);
        e2.acceptInput(002,"chinni",45000);
        e1.display();
        e2.display();        
    }
}