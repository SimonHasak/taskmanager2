package sk.tuke.fei.custom;

import sk.tuke.fei.executor.executor.Executor;
import sk.tuke.fei.executor.manager.Manager;

import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class CustomExecutor implements Executor {

    @Override
    public Map<String, Object> execute(Map<String, Object> request, Manager manager) {
        System.out.println("Console Executor...");
        manager.parse();
        return null;
    }
}
