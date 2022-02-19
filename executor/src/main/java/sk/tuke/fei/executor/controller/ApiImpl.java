package sk.tuke.fei.executor.controller;

import sk.tuke.fei.executor.service.ServiceImpl;

import java.util.Map;

/**
 * @author Šimon Hašák
 */
public class ApiImpl implements Api {

    private final ServiceImpl serviceImpl = new ServiceImpl();

    public Map<String, Object> execute(Map<String, Object> request) {
        return serviceImpl.execute(request);
    }

    // pouzivatelia, sietove interfacy, servisy => ciel (mvp)

}
