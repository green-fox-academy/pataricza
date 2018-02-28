package teacherstudent;

public class Student {

  public void learn () {
    System.out.println("The student learns.");
  }

  public void question (Teacher teacher) {
    teacher.answer();
  }

}
