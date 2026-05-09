import java.util.*;
class student{ // Blueprint class to group different data types (int and String) together
    int rollno;
    Str name;
    int marks;
}
public class StringArrayDemo { 

    public static void main(Str a[]){
        // Initialize individual Student objects with specific data
        student s1=new student();
        s1.rollno =1;
        s1.name= "avinash";
        s1.marks=88;
        
        student s2=new student();
        s2.rollno =2;
        s2.name= "bhumi";
        s2.marks=98;
        
        student s3=new student();
        s3.rollno =3;
        s3.name= "charu";
        s3.marks=76;

        student students[]=new student[3];  // an array created to store the values
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){  // loop
            System.out.println(students[i].name + ":" + students[i].marks);  //output printing
        }
    }   
}
