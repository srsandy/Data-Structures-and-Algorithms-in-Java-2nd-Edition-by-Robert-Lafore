import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    String firstName;
    String lastName;
    float mark;
    public Student(String fn,String ln,float mark){
        this.firstName = fn;
        this.lastName = ln;
        this.mark = mark;
    }

    public float getMark(){
        return mark;
    }

@Override
public int compareTo(final Student student) {
    if(this.mark <= student.getMark())
        return -1;
    else
        return 1;

    /*Values of 1 should be given for that condition which you want it to be true. -1 is like ! operator reversing the condition.*/
}
}





class Main {
  public static void main(String[] args) {
    ArrayList<Student> studentsList = new ArrayList<Student>();
    Student student;
    for(int i = 100;i>=0;i--){
        String fn = "FN"+i;
        String ln = "LN"+i;
        student = new Student(fn,ln,i);
        studentsList.add(student);
    }
    Collections.sort(studentsList);
    for(int i = 0;i<=100;i++){
        System.out.println(studentsList.get(i).getMark()+"\n");
    }
  }
}
