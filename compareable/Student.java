package compareable;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student rahul = new Student(3, 88.3f);
        Student rohan = new Student(4, 33.9f);

        if(rahul.compareTo(rohan) > 0){
            System.out.println("rohan have more marks");
        }

    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
     
}