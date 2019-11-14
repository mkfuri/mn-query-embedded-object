package mn.query.embedded.object;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
