public class UnderAgeException extends Exception {

    @Override
    public String getMessage() {
        return "\n\nYou are Under Age for Eligibility !";
    }

}
