package sk.tuke.fei.custom;

import sk.tuke.fei.executor.executor.Executor;
import sk.tuke.fei.executor.factory.ExecutorFactory;
import sk.tuke.fei.executor.service.Service;

import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class CustomService implements Service {

    private final Executor executor;

    public CustomService() {
        this.executor = ExecutorFactory.of(CustomExecutor.class);
    }

    public Map<String, Object> execute(Map<String, Object> request) {
        return executor.execute(request, new CustomManager());
    }

}
