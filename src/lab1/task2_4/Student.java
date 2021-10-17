package lab1.task2_4;

public class Student {
    private String name;
    private Integer year;

    String getName() {
        return name;
    }

    void setName(String s) {
        name = s;
    }

    Integer getYear() {
        return year;
    }

    void setYear(int i) {
        year = i;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
