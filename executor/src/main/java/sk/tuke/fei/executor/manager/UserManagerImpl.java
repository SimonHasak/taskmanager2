package sk.tuke.fei.executor.manager;

import lombok.Data;
import sk.tuke.fei.executor.executor.Executor;

/**
 * @author Šimon Hašák
 */
@Data
public class UserManagerImpl implements Manager {

    private Executor userExecutor;

    public UserManagerImpl(Executor userExecutor) {
        this.userExecutor = userExecutor;
    }

}
