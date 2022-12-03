package Task1;

public class Main {
    public static void main(String[] args) {
        User user=User.builder().name("Arseni").occupation("Student").occupation("Ucu").age(19).build();
        System.out.println(user);
    }
}
