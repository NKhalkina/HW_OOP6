
public class Persister<User extends Saveble>{
	private User user;
	
	public Persister(User user){
		this.user = user;
	}
	
	public void save(String info){
		System.out.println("Save: " + info); 
	}
}