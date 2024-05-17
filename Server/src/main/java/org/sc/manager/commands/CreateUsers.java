package org.sc.manager.commands;

import org.sc.Request;
import org.sc.manager.UserManager;

import java.security.MessageDigest;
import java.sql.*;

public class CreateUsers implements Command{
    @Override
    public String execute(Request request) throws Exception {
        return UserManager.createUser(request);
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }
}
