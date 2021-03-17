package people;

import exceptions.InvalidInputException;
import java.util.UUID;

public abstract class Person {

    private String id;
    private String name;

    Person() {
    }

    Person(String id, String name) throws InvalidInputException {
        if (id.equals("")){
            this.id = UUID.randomUUID().toString();
        } else {
            this.id = id;
        }
        if (name.isBlank() || name.isEmpty()){
            throw new InvalidInputException("It's not really convention to have an empty or blank name...");
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
