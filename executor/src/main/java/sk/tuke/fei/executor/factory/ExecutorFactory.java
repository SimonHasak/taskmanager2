package sk.tuke.fei.executor.factory;

import sk.tuke.fei.executor.executor.Executor;

/**
 * @author Šimon Hašák
 */
public interface ExecutorFactory {

    @SuppressWarnings("unchecked")
    static  <T extends Executor> T of(Class<T> clz) {
        T result = null;
        try {
            result = (T) Class.forName(clz.getName()).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
