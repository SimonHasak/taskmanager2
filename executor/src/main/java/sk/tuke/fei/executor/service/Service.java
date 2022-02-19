package sk.tuke.fei.executor.service;

import java.util.Map;

/**
 * @author Šimon Hašák
 */
public interface Service {

    Map<String, Object> execute(Map<String, Object> request);

}
