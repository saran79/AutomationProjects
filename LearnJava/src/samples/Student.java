package samples;

import java.sql.SQLOutput;

public class Student {
    int StudNo;
    String Name;
    int Age;

public int StudentId(int Sid)   {
     StudNo = Sid;
     return StudNo;
}

public String StudentName(String SName){
     Name = SName;
     return SName;
}
public int StudentAge( int SAge){
     Age = SAge;
     return Age;
}

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println( s1.StudentId(001));
        System.out.println(s1.StudentName("George"));
        System.out.println(s1.StudentAge(21));
       // System.out.println(Id);
//       // System.out.println(Sage);

    }
}

