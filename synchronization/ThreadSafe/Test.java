package EducationDecode.synchronization.ThreadSafe;

public class Test {
    public static void main(String[] args) {
        Student engineeringStudent = new Student() {
            @Override
            public String getBio(String name) {
                return name + " is Engineering student";
            }
        };
        Student lawStudent = (String name) -> {
            return name + "is law student";
        };
        String bio = engineeringStudent.getBio("Ram");
        System.out.println(bio);
    }
}
