package ph.com.bpi.hello;

public class MSExcel extends Program {

    public MSExcel(String name) {
        super(name);
    }

    @Override
    protected void onStart() {
        System.out.println("Opening MS Excel...");
    }

    @Override
    protected void onStop() {
        System.out.println("Stopping MS Excel...");
    }
}