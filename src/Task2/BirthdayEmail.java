package Task2;

public class BirthdayEmail implements EmailType{
    @Override
    public String getMessage(Client client) {
        String output="Dear ";
        if (client.getSex().equals(Sex.MALE)){
            output+="Mr ";
        }
        else {
            output+="Ms ";
        }
        output+=client.getName();
        output+="\nHappy Birthday.";
        return output;
    }

    @Override
    public String getSubject() {
        return "Birthday";
    }
}
