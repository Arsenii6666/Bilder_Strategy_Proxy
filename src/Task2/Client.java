package Task2;

import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter
    Integer id;
    private static Integer count=0;
    public Client(String name, Integer age, Sex sex, String email){
        id=count++;
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.email=email;
    }
    @Getter @Setter
    String name;
    @Getter @Setter
    Integer age;
    @Getter @Setter
    Sex sex;
    @Getter @Setter
    String email;
}
