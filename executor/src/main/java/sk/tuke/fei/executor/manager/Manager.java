package sk.tuke.fei.executor.manager;

/**
 * @author Šimon Hašák
 */
public interface Manager {

    default void parse() {
        System.out.println("Manager parsing data...");
    }

}
