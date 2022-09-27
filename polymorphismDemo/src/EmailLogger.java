public class EmailLogger extends BaseLogger{
    public void log(String message) { //overwrite
        System.out.println("Logged to email : "+ message);
    }
}
