package org.sc.manager.commands;

import org.sc.Request;
import org.sc.data.Flat;;
import org.sc.manager.CollectionManager;
import org.sc.manager.DBmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Данная команда добавляет новый элемент в коллекцию
 *
 * @author Kemansu
 * @since 1.0
 */

public class AddCommand implements Command{
    @Override
    public String execute(Request request) throws Exception {
        Flat flat = request.getFlat();
        flat.setOwnerId(DBmanager.getUserId(request.getLogin()));

        long needed_id = DBmanager.addFlat(flat);

        flat.setId(needed_id);
        CollectionManager.add(flat);

        return "flat added!";
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return "добавить новый элемент в коллекцию";
    }
}
