package sk.tuke.fei.executor.factory;

import sk.tuke.fei.executor.executor.BashExecutor;
import sk.tuke.fei.executor.executor.Executor;
import sk.tuke.fei.executor.executor.JniExecutor;

/**
 * @author Šimon Hašák
 */
public class ExecutorFactoryImpl implements ExecutorFactory {

//    @SuppressWarnings("unchecked")
//    public  <T extends Executor> T of(Class<T> clz) {
//        T result = null;
//        try {
//            result = (T) Class.forName(clz.getName()).getDeclaredConstructor().newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return result;
//    }

//    public static Executor of(String executorType) {
//        if (executorType == null) {
//            return null;
//        }
//
//        if (executorType.equalsIgnoreCase("windows")) {
//            return new JniExecutor();
//        } else if (executorType.equalsIgnoreCase("linux")) {
//            return new BashExecutor();
//        }
//
//        return null;
//    }

}
