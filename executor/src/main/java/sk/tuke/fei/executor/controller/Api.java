package sk.tuke.fei.executor.controller;

import java.util.Map;

/**
 * @author Šimon Hašák
 */
public interface Api {

    Map<String, Object> execute(Map<String, Object> request);

}
