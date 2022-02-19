package sk.tuke.fei.custom;

import sk.tuke.fei.executor.controller.Api;
import sk.tuke.fei.executor.service.Service;

import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class CustomApi implements Api {

    private final Service service = new CustomService();

    @Override
    public Map<String, Object> execute(Map<String, Object> request) {
        return service.execute(request);
    }

    // pouzivatelia, sietove interfacy, servisy => ciel (mvp)

}
