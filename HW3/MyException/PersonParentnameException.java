package HW3.MyException;

public class PersonParentnameException extends PersonException{
    private final String parentName;

    public PersonParentnameException(String message, String parentName) {
        super(message);
        this.parentName = parentName;
    }


    @Override
    public String getContext() {
        return parentName;
    }
}
