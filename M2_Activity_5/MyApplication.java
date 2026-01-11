package ph.com.bpi.hello;

public class MyApplication {

    public static void main(String[] args) {
        Program excel = new MSExcel("MS Excel");
        Program word = new MSWord("MS Word");

        runProgram(excel);
        runProgram(word);

        checkProgramStatus(excel);
        checkProgramStatus(word);

        stopProgram(excel);
        stopProgram(word);

        checkProgramStatus(excel);
        checkProgramStatus(word);
    }

    private static void runProgram(Program executableProgram) {
        executableProgram.start();
    }

    private static void stopProgram(Program executableProgram) {
        executableProgram.stop();
    }

    private static void checkProgramStatus(Program executableProgram) {
        if (executableProgram.isRunning()) {
            System.out.println("Program " + executableProgram.getName() + " is running.");
        } else {
            System.out.println("Program " + executableProgram.getName() + " is stopped.");
        }
    }
}