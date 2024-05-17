package org.sc.manager.commands;

import org.sc.Request;
import org.sc.manager.CollectionManager;
import org.sc.manager.DBmanager;

/**
 *  Данная команда очищает коллекцию
 *
 * @author Kemansu
 * @since 1.0
 */
public class ClearCommand implements Command{
    @Override
    public String execute(Request request) throws Exception {
        CollectionManager.clear();
        DBmanager.Synchronized();
        return "Collection successfully cleared!";
    }

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescription() {
        return "очистить коллекцию";
    }
}
