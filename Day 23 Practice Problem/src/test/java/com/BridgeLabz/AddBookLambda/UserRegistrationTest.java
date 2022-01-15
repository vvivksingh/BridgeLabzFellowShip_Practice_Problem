package com.BridgeLabz.AddBookLambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserRegistrationTest  {
    UserRegistration userRegistration = new UserRegistration();
    //UserCase1
    @Test
    public void firstNameTestShouldReturnTrue(){
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$","Niharika","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);

    }
    @Test
    public void firstNameTestShouldReturnFalse(){
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$","niha","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);

    }
    //UserCase2
    @Test
    public void lastNameTestShouldReturnTrue() {
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$","Gowda","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);
    }
    @Test
    public void lastNameTestShouldReturnFalse() {
        boolean result = false;
        try {
         ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$","kv","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }
    //UserCase3
    @Test
    public void emailTestShouldReturnTrue() {
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","niha199831@gmail.com","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);
    }
    @Test
    public void emailTestShouldReturnFalse() {
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$","niharika199831#gmail.com","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }
    //UserCase4
    @Test
    public void phoneTestShouldReturnTrue() {
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$","917550167198","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);
    }
    @Test
    public void phoneTestShouldReturnFalse() {
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$","91550167198","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }
    //UserCase8
    @Test
    public void passwordTestShouldReturnTrue() {
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])","niha123A@","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);
    }
    @Test
    public void passwordTestShouldReturnFalse() {
        boolean result = false;
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])","niha123A","Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }
}
