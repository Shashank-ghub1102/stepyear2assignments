public class TrafficSignalAnalyzer {

    static void analyzeTrafficSignal(String signal) {

        switch (signal.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Caution");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal");
        }
    }

    public static void main(String[] args) {

        analyzeTrafficSignal("red");
        analyzeTrafficSignal("yellow");
        analyzeTrafficSignal("green");
        analyzeTrafficSignal("blue");
    }
}