package ph.com.bpi.hello;

public abstract class Program {

    private String name;
    private boolean isRunning = false;

    protected Program(String name) {
        this.name = name;
    }

    public final void start() {
        if (!isRunning) {
            isRunning = true;
            onStart();
        } else {
            System.out.println("Program " + name + " is already running.");
        }
    }

    public final void stop() {
        if (isRunning) {
            isRunning = false;
            onStop();
        } else {
            System.out.println("Program " + name + " is already stopped.");
        }
    }

    protected abstract void onStart();
    protected abstract void onStop();

    public String getName() {
        return name;
    }

    public boolean isRunning() {
        return isRunning;
    }
}