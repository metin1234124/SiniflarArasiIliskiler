public class Main {

    public static void main(String[] args) {

        Student st1 = new Student("mustafa","dağ","133","AA",80);
        Student st2 = new Student("murat","çetin","144","BB",60);
        Student st3 = new Student("mert","yen","155","CC",50);
        //st2.setNote(150);
      //System.out.println(st2.getNote());
        // Student[] stu={st1,st2,st3};
        //System.out.println("ORTALAMA : "+mat.calcAvarage(stu));

        Instructor teacher=new Instructor("Baran","çet","CENG");
        //Composition, Aggregation
        // Course has a Instructor (Sınıfın bir öğretmeni vardır).
        Course mat=new Course("MAT101","MAT",teacher);
        System.out.println(mat.getInstructor().getName());




    }
}
