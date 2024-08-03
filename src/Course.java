public class Course {

    private String courseName;
    private String code;
    private Instructor instructor; //Instructor veri tipimizi aldık ve  her dersin erişim belirleyicisi olmak zorunda.
                                   // Course sınıfı Instructor sınıfından bir nesne almak zorunda.

    public Course(String courseName,String code,Instructor instructor){
        this.courseName=courseName;
        this.code=code;
        this.instructor=instructor;
    }

    public String getCourseName(){
        return this.courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code=code;
    }
    // Course user a Student (Course sınıfı Student Sınıfına Bağlı)
    public double calcAvarage(Student[] students){

      double avarage = 0.0;
      for(int i=0; i<students.length;i++){
          avarage += students[i].getNote();
      }
      return avarage / students.length;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
