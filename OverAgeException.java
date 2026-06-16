public class OverAgeException extends Exception {

    @Override
    public String getMessage() {
        return "\n\nYou are Over Age for Eligibility !";
    }

}
