package az.edu.turing.userprofileapp.exception;

public class ProfileNotFoundException extends RuntimeException {

    public ProfileNotFoundException(String message){
        super(message);
    }

}
