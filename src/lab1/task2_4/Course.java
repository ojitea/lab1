package lab1.task2_4;

public class Course {
    private String title;
    private String description;
    private Student[] students;

    String getTitle() {
        return title;
    }

    void setTitle(String s) {
        title = s;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String s) {
        description = s;
    }

    Student[] getStudents() {
        return students;
    }

    void setStudents(Student[] arr) {
        students = new Student[arr.length];
        for(int i = 0; i < arr.length; i++) {
            students[i] = arr[i];
        }
    }

    Student[] filterYear(int y) {
        int index = 0;
        for(int i = 0; i < students.length; i++) {
            if(students[i].getYear() == y){
                index++;
            }
        }
        Student[] res = new Student[index];
        index = 0;
        for(int i = 0; i < students.length; i++) {
            if(students[i].getYear() == y){
                res[index] = students[i];
                index++;
            }
        }

        return res;
    }
}
