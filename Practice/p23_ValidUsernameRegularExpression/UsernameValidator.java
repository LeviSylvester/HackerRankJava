package Practice.p23_ValidUsernameRegularExpression;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}
//Other solutions:

//"^[a-zA-Z][a-zA-Z0-9_]{7,29}$"
//"([a-zA-Z])(\\w){7,29}" //As the task uses string.matches ^ and $ are added by default
