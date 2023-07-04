package in.soundaryabavanasi.soundbricks.userservice;
import in.soundaryabavanasi.soundbricks.dao.UserTaskDAO;

import in.soundaryabavanasi.soundbricks.model.UserTask;
import in.soundaryabavanasi.soundbricks.validation.TaskValidator;

public class UserService {
	public UserTask[] getAll() {
		
		UserTaskDAO userDao = new UserTaskDAO();
		
		UserTask[] userList = userDao.findAll();
		
		for(int i=0; i<userList.length; i++) {
			
			System.out.println(userList[i]);
			
		}
				
		return userList;
	}
	
	public void create(UserTask newUser) throws Exception {
		
		TaskValidator.validate(newUser);
		
		UserTaskDAO userDao = new UserTaskDAO();
		userDao.create(newUser);		
		
	}
	
	public void update(int id, UserTask updateUser) {
				
		UserTaskDAO userDao = new UserTaskDAO();
		userDao.update(1,updateUser);
		
	}
	
//	public void delete() {
//		
//		User deleteUser = new User();
//		
//		UserDAO userDao = new UserDAO();
//		userDao.delete(1);
//		
//	}
	
	public UserTask findById(int id) {
		UserTaskDAO userDao = new UserTaskDAO();
		UserTask user = userDao.findById(id);
//		this.printUser(user);
		return user;
	}
}