public class Employee {
    public static void main(String[] args){
        Emp obj1=new Emp();
        obj1.show();
        Emp obj=new Emp(123,"sharath",0.01);
        obj.show();

        Bank b1=new Bank("Axis","12345678901","salary",1000);
        Bank b2=new Bank("HDFC","12345678901","salary",100);
        b1.show();
    }
}
