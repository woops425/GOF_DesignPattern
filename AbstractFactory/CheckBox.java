package AbstractFactory;

public abstract class CheckBox {
    protected boolean bChecked;

    public CheckBox(boolean bChecked) {
        this.bChecked = bChecked;
    }

    public void setbChecked(boolean bChecked) {
        this.bChecked = bChecked;
        render();
    }

    abstract void render();
}
