package sk.tuke.fei.executor.executor;

import sk.tuke.fei.executor.entity.Request;
import sk.tuke.fei.executor.entity.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Šimon Hašák
 *
 * Strategy2 class
 */
public class JniExecutor implements Executor {

    @Override
    public Map<String, Object> execute(Map<String, Object> request) {
        System.out.println("Executing JNI...");
        return null;
    }

    public boolean executeUser() {
        System.out.println("Executing user JNI script...");

        return true;
    }

    public List<String> executeNetwork() {
        System.out.println("Executing network JNI script...");
        return new ArrayList<String>();
    }
}
