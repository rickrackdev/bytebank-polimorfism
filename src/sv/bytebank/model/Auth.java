package sv.bytebank.model;

public abstract interface Auth {
    public abstract void setPassword(int password);

    public abstract boolean logIn(int password);

}
