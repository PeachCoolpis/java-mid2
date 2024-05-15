package generic.test.ex3;

public class Shuttle<T extends BioUnit> {
    
    private T bioUnit;
    
    
    public void in(T t) {
        this.bioUnit = t;
    }
    
    public T out() {
        return this.bioUnit;
    }
    public void showInfo() {
        System.out.println(String.format("이름: %s, HP: %s", this.bioUnit.getName(), this.bioUnit.getHp()));
    }
}
