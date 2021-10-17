package lab1.task2_4;

public class Test {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        Student s1 = new Student();
        s1.setYear(1);
        s1.setName("Popescu");

        Student s2 = new Student();
        s2.setYear(1);
        s2.setName("Popescu");


        Student s3 = new Student();
        s3.setYear(2);
        s3.setName("Ionescu");


        Student[] S_list = {s1, s2, s3};

        Course C = new Course();
        C.setTitle("Curs");
        C.setDescription("Descriere");
        C.setStudents(S_list);

        Student[] res = C.filterYear(year);

        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i].toString());
        }

        if(s1.equals(s2)) {
            System.out.println("Egalitate");
        }else{
            System.out.println("Inegalitate");
        }

    }
}
