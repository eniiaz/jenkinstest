package tests;

import org.junit.Assert;
import org.junit.Test;

public class AmazonLogin {

    @Test
    public void login(){
        System.out.println("Login successful");
    }


    @Test
    public void negative(){
        System.out.println("Trying to login");
        Assert.fail("on Purpose failiure");
    }
}
