package in.soundaryabavanasi.soundbricks;
import in.soundaryabavanasi.soundbricks.model.User;
import in.soundaryabavanasi.soundbricks.userservice.UserService;

public class App {
	public static void main(String[] args) {
		
		
		User newUser = new User();
		newUser.setId(3);
		newUser.setFirstname("soundarya");
		newUser.setLastname("Bavanasi");
		newUser.setEmail("soundarya@gmail.com");
		newUser.setPassword("sound@12");
		newUser.setActive(true);
		
		UserService userService;
		
		try {
			userService = new UserService();
			User newUser1 = new User();
			newUser1.setId(2);
			newUser1.setFirstname("soundarya");
			newUser1.setLastname("Bavanasi");
			newUser1.setEmail("sound@gmail.com");
			newUser1.setPassword("sound@12");
			newUser1.setActive(true);
			
			userService.create(newUser);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
//		userService.create(newUser1);
		
		User updateUser = new User();
		updateUser.setId(2);
		updateUser.setFirstname("Reddy");
		updateUser.setLastname("soundarya");
		updateUser.setEmail("reddy@gmail.com");
		updateUser.setPassword("reddy@12");
		updateUser.setActive(true);
		
		
//		userService.update(2, updateUser);
//		
//		userService.getAll();
//		
		
	}
}	
		
	
		
