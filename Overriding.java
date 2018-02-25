//This code is to check overridding
import java.io.*;
import java.util.*;

class Manager{
  private String name;
  public int salary;
  protected String dept;

  public void setDetails(String name,int salary,String dept){
      this.name = name;
      this.salary = salary;
      this.dept = dept;
  }

  public String getName(){
    return name;
  }

  public int getSalary(){
    return salary;
  }

  public String getDept(){
    return dept;
  }

  public void calculate(){
    salary = salary + (salary*(25/100));
  }

  public void all(){
    System.out.println("Name:" + getName());
    System.out.println("Salary:" + getSalary());
    System.out.println("Dept:" + getDept());
  }
}

class Eng extends Manager{
  public void calculate(){
    salary = salary + (salary*(20/100));
  }
}

class Overriding{
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  Manager man = new Manager();
  Eng en = new Eng();

  System.out.println("Enter the values for manager");
  String name = s.next();
  int salary = s.nextInt();
  String dept = s.next();
  man.setDetails(name,salary,dept);

  System.out.println("Enter the values for engineer");
  name = s.next();
  salary = s.nextInt();
  dept = s.next();
  en.setDetails(name,salary,dept);

  man.all();
  en.all();

  System.out.println("Incrementing salary");
  man.calculate();
  en.calculate();

  System.out.println(man.getSalary());
  System.out.println(en.getSalary());
}
}
