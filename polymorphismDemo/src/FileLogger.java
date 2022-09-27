public class FileLogger extends BaseLogger{
    public void log(String message) { //overwrite
        System.out.println("Logged to file : "+ message);
    }
}
