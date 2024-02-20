
public class Arrofobjects 
{
 public static void main(String arg[])
 {
    Student s1=new Student();
    s1.rollno=45;
    s1.name="mohith";
    s1.marks=90;

    Student s2=new Student();
    s2.rollno=40;
    s2.name="mohan";
    s2.marks=95;


    Student s3=new Student();
    s3.rollno=34;
    s3.name="kumar";
    s3.marks=100;

    Student students[]=new Student[10];
    students[1]=s1;
    students[2]=s2;
    students[3]=s3;

    for( int i=1;i<=3;i++)
    {
        System.out.println(students[i].name+":"+students[i].marks);
    }
 }
}
class Student
{
    int rollno;
    String name;
    int marks;
}