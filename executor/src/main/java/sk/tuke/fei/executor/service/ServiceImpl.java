package sk.tuke.fei.executor.service;

import sk.tuke.fei.executor.executor.BashExecutor;
import sk.tuke.fei.executor.executor.Executor;
import sk.tuke.fei.executor.factory.ExecutorFactory;

import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class ServiceImpl {

    private final Executor executor;
//    private final ExecutorFactory executorFactory = new ExecutorFactoryImpl();

//    private final UserManagerImpl userManager;
//    private final NetworkManagerImpl networkManager;

    public ServiceImpl() {
        this.executor = ExecutorFactory.of(BashExecutor.class);

//        this.userManager = new UserManagerImpl(this.executor);
//        this.networkManager = new NetworkManagerImpl(this.executor);
    }


//    public boolean executeUser(Map<String, String> parameters) {
//
//        return this.userManager.getUserExecutor().executeUser();
//    }
//
//    public List<String> executeNetwork(Map<String, String> parameters) {
//
//        return this.networkManager.getNetworkExecutor().executeNetwork();
//    }

    public Map<String, Object> execute(Map<String, Object> request) {
        return executor.execute(request);
    }

}
// diagramy - use case