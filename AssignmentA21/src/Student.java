import java.util.ArrayList;

public class Student
{
  private int studentNumber;
  private String name;
  private ArrayList<Grade> grades;
  private ArrayList<Course> courses;
  private CoronaPassport coronaPassport;
  public Student(int studentNumber, String name){
    this.studentNumber = studentNumber;
    this.name = name;
    grades = new ArrayList<>();
    courses = new ArrayList<>();
    coronaPassport = null;
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

  public String getName()
  {
    return name;
  }
  public void addCourse(Course course){
    courses.add(course);
  }
  public void addGrade(int grade, Course course){
    grades.add(new Grade(grade, course));
  }
  public void addCoronaPassport(CoronaPassport passport){
    coronaPassport = passport;
  }
  public void removeCoronaPassport(){
    coronaPassport = null;
  }
  public CoronaPassport getCoronaPassport(){
    return coronaPassport;
  }
  public boolean hasValidCoronaPassport(){
    return coronaPassport != null;
  }
  public double getGradeAverage(){
    int gradeCount = 0;
    for (int i = 0; i < grades.size(); i++)
    {
      gradeCount += grades.get(i).getGrade();
    }
    return (double) gradeCount /grades.size();
  }
  public Grade[] getAllGrades(){
    Grade[] gradesArray = new Grade[grades.size()];
    for (int i = 0; i < grades.size(); i++)
    {
      gradesArray[i] = grades.get(i);
    }
    return gradesArray;
  }
  public Course[] getAllCourses(){
    Course[] courseArray = new Course[courses.size()];
    for (int i = 0; i < courses.size(); i++)
    {
      courseArray[i] = courses.get(i);
    }
    return courseArray;
  }
}
