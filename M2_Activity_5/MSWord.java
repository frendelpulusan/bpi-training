package ph.com.bpi.hello;

public class MSWord extends Program {

    public MSWord(String name) {
        super(name);
    }

    @Override
    protected void onStart() {
        System.out.println("Opening MS Word...");
    }

    @Override
    protected void onStop() {
        System.out.println("Stopping MS Word...");
    }
}