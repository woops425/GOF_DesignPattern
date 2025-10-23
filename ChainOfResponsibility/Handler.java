package ChainOfResponsibility;

public abstract class Handler {
    protected Handler nextHandler = null;

    public Handler setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    protected abstract void process(String url);

    public void run(String url) {
        process(url);
        if (nextHandler != null) {
            nextHandler.run(url);
        }
    }
}
