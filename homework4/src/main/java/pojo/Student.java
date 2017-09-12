package pojo;

public class Student extends StudentGroup {


    private String studentName;

    private int pointOfstudy;

    public Student(int groupNumber, String studentName, int pointOfstudy) {
        super(groupNumber);
        this.studentName = studentName;
        this.pointOfstudy = pointOfstudy;

    }

    public String getStudentName() {
        return studentName;
    }

    public int getPointOfstudy() {
        return pointOfstudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student Name= '" + studentName + '\'' +
                ", Point= " + pointOfstudy +
                ", Group= "+getGroupNumber()+
                '}'+"\n";
    }

}
