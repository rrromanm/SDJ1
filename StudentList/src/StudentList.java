import java.util.ArrayList;

public class StudentList
{
  private int size;
  private ArrayList<Student> list;
  public StudentList(){
    list = new ArrayList<Student>();
  }
  public void addStudent(Student student){
    list.add(student);
  }
  public Student getStudent(int index){
    return list.get(index);
  }
  public void removeStudent(Student student){
    list.remove(student);
  }
  public int getNumberOfStudents(){
    return list.size();
  }
  public int getNumberOfStudentsByEducation(Education education){
    int studentByEducation = 0;
    for(int i = 0; i < list.size(); i++){
      if(list.get(i).getEducation() == education){
        studentByEducation += 1;
      }
    }
    return studentByEducation;
  }
  public Student[] getStudentsByEducation(Education education){
    Student[] studentArray = new Student[list.size()];
    for(int i = 0; i < list.size(); i++){
      if(list.get(i).getEducation() == education){
        studentArray[i] = list.get(i);
      }
    }
    return studentArray;
  }
  public int getNumberOfHighSchoolStudents() {
    int highSchoolStudent = 0;

    for (int i = 0; i < list.size(); i++) {
      Education currentEducation = list.get(i).getEducation();

      if (currentEducation != null && currentEducation instanceof School) {
        School currentSchool = (School) currentEducation;

        if ("High school".equals(currentSchool.getSchoolType())) {
          highSchoolStudent += 1;
        }
      }
    }

    return highSchoolStudent;
  }
  public void doubleTheListCapacity(){
    list = new ArrayList<Student>(list.size()*2);
  }
}
