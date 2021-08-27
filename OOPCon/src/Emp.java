public class Emp {
    private int empId;
    private String name;
    private double salary;


    public Emp() {
        empId=0;
        name="";
        salary=0;
    }

    public Emp(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public void show(){
        System.out.println(empId+"\n"+name+"\n"+salary);
    }
}
