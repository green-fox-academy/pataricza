package teacherstudent;

public class Teacher {

  public void answer () {
    System.out.println("The teacher answers.");
  }

  public void teach (Student student) {
    student.learn();
  }

}
