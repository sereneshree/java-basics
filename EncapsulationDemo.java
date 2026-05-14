class alien{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age=a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }

}
public class EncapsulationDemo {
    public static void main(String a[]){
        alien al = new alien();
        al.setAge(21);
        al.setName("shree");

        System.out.print(al.getName() +":"+al.getAge());
    }

    
}
