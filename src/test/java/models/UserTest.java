package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest{
    public User newUser(){
        return new User("Mr", "Kinuthia", "Janitor", "Cleaning", 8);
    }

    @Test
    public void testifUserInstantiatesCorrectly(){
        User newUser = newUser();
        assertTrue(newUser instanceof User);
    }
    @Test
    public void getName_returnsCorrectName_String() {
        User newUser = newUser();
        User user = newUser;
        assertEquals(newUser.getName(), user.getName());
    }
    @Test
    public void getCorrectPosition() {
        User newUser = newUser();
        User user = newUser;
        assertEquals(user.getPosition(), user.getPosition());
    }
    @Test
    public void getRole_returnsCorrectRole_true() {
        User users = newUser();
        User user = newUser();
        assertEquals(user.getPosition(), users.getPosition());
    }

    @Test
    public void getCorrectID(){
        User users = newUser();
        User user = newUser();
        assertEquals(8, user.getDepartmentId());
    }

}