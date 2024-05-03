package application;

import java.util.ArrayList;
import java.util.List;

public class DataClass {
    private List<Person> importList;
    private List<Person> exportList;

    public DataClass() {
        importList = new ArrayList<>();
        importList.add(new Person("Sami", "BenAli", "sami@example.com"));
        importList.add(new Person("Alia", "BenSalah", "alia@example.com"));
        importList.add(new Person("Ali", "BenSalah", "ali@example.com"));

        exportList = new ArrayList<>();
    }

    public List<Person> getImportList() {
        return importList;
    }

    public List<Person> getExportList() {
        return exportList;
    }

    public void setExportList(List<Person> exportList) {
        this.exportList.addAll(exportList);
        for (Person p : this.exportList) {
            System.out.println(p);
        }
    }
}
