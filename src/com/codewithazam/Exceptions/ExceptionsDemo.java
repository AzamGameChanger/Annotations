package com.codewithazam.Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
        Account checking = new Account();
        try {
            checking.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }

    }
}
