package sk.tuke.fei.executor.executor;

import sk.tuke.fei.executor.manager.Manager;

import java.util.Map;

/**
 * @author Šimon Hašák
 *
 * Base interface for Strategy and Factory pattern
 *
 */
public interface Executor {

    Map<String, Object> execute(Map<String, Object> request, Manager manager);

}
