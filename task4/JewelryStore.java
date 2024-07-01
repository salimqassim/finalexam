package finalexam.task4;

import java.util.ArrayList;
import java.util.List;

public class JewelryStore implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Designer> designers;

    public JewelryStore(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
        this.designers = new ArrayList<>();
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addDesigner(Designer designer) {
        designers.add(designer);
    }

    public boolean removeDesigner(Designer designer) {
        return designers.remove(designer);
    }

    public List<Designer> getDesigners() {
        return designers;
    }

    @Override
    public String toString() {
        return "JewelryStore{" +
                "address='" + address + '\'' +
                ", vatNumber='" + vatNumber + '\'' +
                ", designers=" + designers +
                '}';
    }
}
