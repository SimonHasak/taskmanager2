package sk.tuke.fei.clientrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.tuke.fei.custom.CustomApi;
import sk.tuke.fei.executor.controller.Api;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Šimon Hašák
 */
@RestController
public class ApiController {

    private final Api api = new CustomApi();

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

//    @GetMapping("/network")
//    public List<String> getNetworkData() {
//        return this.apiImpl.networkExecutor(new HashMap<>());
//    }
//
//    @GetMapping("/user")
//    public Boolean getUserData() {
//        return this.apiImpl.userExecutor(new HashMap<>());
//    }

    @GetMapping("/execute")
    public Map<String, Object> getExecuteData() {
        return this.api.execute(new HashMap<>());
    }

}
