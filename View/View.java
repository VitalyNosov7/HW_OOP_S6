package homework.View;

public class View {
    private final String  outputResult;

    public View(String  outputResult){
        this.outputResult = outputResult;
    }

    public static void printResult(String  outputResult){
        System.out.println(outputResult);
    }
}
