package personTable;

import javafx.beans.property.SimpleStringProperty;


public class Person {
    private SimpleStringProperty k1 = new SimpleStringProperty("");
    private SimpleStringProperty k2 = new SimpleStringProperty("");


    public Person() {
    }

    public Person(String fio, String phone) {
        this.k1 = new SimpleStringProperty(fio);
        this.k2 = new SimpleStringProperty(phone);
    }

    public String getFio() {
        return k1.get();
    }

    public void setFio(String k1) {
        this.k1.set(k1);
    }

    public String getPhone() {
        return k2.get();
    }

    public void setPhone(String k2) {
        this.k2.set(k2);
    }


    public SimpleStringProperty fioProperty() {
        return k1;
    }

    public SimpleStringProperty phoneProperty() {
        return k2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + k1 + '\'' +
                ", phone='" + k2 + '\'' +
                '}';
    }
}
