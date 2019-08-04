package personTable;


import javafx.beans.property.SimpleStringProperty;
import org.springframework.stereotype.Component;


@Component
public class PersonTableVievColumn {
       private  String colum1;
       private  String colum2;
       private  String colum3;

    @Override
    public String toString() {
        return "PersonTableVievColumn{" +
                "colum1='" + colum1 + '\'' +
                ", colum2='" + colum2 + '\'' +
                ", colum3='" + colum3 + '\'' +
                '}';
    }

    public PersonTableVievColumn(String colum1, String colum2) {
        this.colum1 = colum1;
        this.colum2 = colum2;
    }

    public String getColum1() {
        return colum1;
    }

    public void setColum1(String colum1) {
        this.colum1 = colum1;
    }

    public String getColum2() {
        return colum2;
    }

    public void setColum2(String colum2) {
        this.colum2 = colum2;
    }

    public String getColum3() {
        return colum3;
    }

    public void setColum3(String colum3) {
        this.colum3 = colum3;
    }

    public PersonTableVievColumn() {
    }

    public PersonTableVievColumn(String colum1, String colum2, String colum3) {
        this.colum1 = colum1;
        this.colum2 = colum2;
        this.colum3 = colum3;
    }
}
