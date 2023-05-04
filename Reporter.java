public class Reporter <User extends Reportable>{
    private User user;

    public Reporter(User user){
        this.user = user;
    }
    public void report(String info){
        System.out.println("Report: " + info); 
    }
}