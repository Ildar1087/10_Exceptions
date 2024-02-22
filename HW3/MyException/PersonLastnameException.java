package HW3.MyException;

public class PersonLastnameException extends PersonException{
    private final String lastname;

    public PersonLastnameException(String message, String lastname) {
        super(message);
        this.lastname = lastname;
    }


    @Override
    public String getContext() {
        return lastname;
    }
}
