package com.naztech.dbUtil;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.naztech.model.User;
import com.naztech.service.userDAOimpl;

public class DBOperationTest {

	//@Test
	public void insertTest() throws SQLException {
		
		User user =  new User();
		userDAOimpl  userDAOimpl = new userDAOimpl();
		assertEquals(true,userDAOimpl.addUser(user));
		
		
		
		
	}
	
	
	
@Test
 public void deleteTest() throws SQLException {
		
		User user =  new User();
		
		
		user.setCity("Dhaka");
		user.setCountry("England");
		user.setName("afee");
		user.setSalary(40000);
		user.setUserId("2014052");
		user.setZipCode(1205);
		
		
	
		
	DBOperation dbOperation =  new DBOperation();
	userDAOimpl  userDAOimpl = new userDAOimpl();
	
	//assertFalse(dbOperation.deleteData(user));
	assertTrue(userDAOimpl.deleteUser(user));
	
	
	
	
		
	
}
	
	@Test
	public void updateTest() throws SQLException {
		
		User user =  new User();
		
		
		user.setCity("Patuakhali");
		user.setCountry("England");
		user.setName("Afee");
		user.setSalary(40000);
		user.setUserId("2011055");
		user.setZipCode(1203);
		
		//DBOperation dbOperation =  new DBOperation();
		//assertEquals(3,dbOperation.updateData(user));
		userDAOimpl  userDAOimpl = new userDAOimpl();
		assertEquals(true,userDAOimpl.updateUser(user));
		
		
		
		
		
	}
	
 @Test	
public void findTest() throws SQLException {
		
		User user =  new User();
		String userName="Promi";
		
	DBOperation dbOperation =  new DBOperation();
	//assertEquals(user,dbOperation.deleteData(user));
	  userDAOimpl  userDAOimpl = new userDAOimpl();
	  assertEquals("2014039", userDAOimpl.userFindIdByName(userName));
		
	
}


@Test
public void InnerJoinTest() throws SQLException {
	
	User user =  new User();
	
DBOperation dbOperation =  new DBOperation();
  userDAOimpl  userDAOimpl = new userDAOimpl();
  assertEquals(true, dbOperation.InnerJoin());
	

}
@Test
public void LeftJoinTest() throws SQLException {
	
	User user =  new User();
	
DBOperation dbOperation =  new DBOperation();
  userDAOimpl  userDAOimpl = new userDAOimpl();
  assertEquals(true, dbOperation.LeftJoin());
	

}

@Test
public void RightJoinTest() throws SQLException {
	
	User user =  new User();
	
DBOperation dbOperation =  new DBOperation();
  userDAOimpl  userDAOimpl = new userDAOimpl();
  assertEquals(true, dbOperation.RightJoin());
	

}

@Test
public void FullJoinTest() throws SQLException {
	
	User user =  new User();
	
DBOperation dbOperation =  new DBOperation();
  userDAOimpl  userDAOimpl = new userDAOimpl();
  assertEquals(true, dbOperation.FullJoin());
	

}

//@Test
public void GroupbyandhavingTest() throws SQLException {
	
	User user =  new User();
	
DBOperation dbOperation =  new DBOperation();
  userDAOimpl  userDAOimpl = new userDAOimpl();
  assertEquals(true, dbOperation.Groupbyandhaving());
	

}









}
	

	


