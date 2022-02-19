package sk.tuke.fei.executor.manager;

import lombok.Data;
import sk.tuke.fei.executor.executor.Executor;

/**
 * @author Šimon Hašák
 */
@Data
public class NetworkManagerImpl implements Manager {

    private Executor networkExecutor;

    public NetworkManagerImpl(Executor networkExecutor) {
        this.networkExecutor = networkExecutor;
    }


}
