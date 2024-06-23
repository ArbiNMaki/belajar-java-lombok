package com.belajar.java.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testCreate() {
        var login = Login.createEmpty();
        Assertions.assertNull(login.getUsername());
        Assertions.assertNull(login.getPassword());

        var login2 = Login.create("arbi", "secret");
        Assertions.assertEquals("arbi", login2.getUsername());
        Assertions.assertEquals("secret", login2.getPassword());
    }
}
