public class DatabaseLogger extends BaseLogger{
    public void log(String message) {  //overwrite
        System.out.println("Logged to database : "+ message);
    }
}
