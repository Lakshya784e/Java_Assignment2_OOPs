class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}
public class ques23 {
    public static void main(String[] args) {
        
            if (args.length == 0) {
                System.out.println("Please provide a temperature value.");
                return;
            }
    
            try {
                double temperature = Double.parseDouble(args[0]);
    
                if (temperature > 35) {
                    throw new TooHot("Temperature is too hot!");
                } else if (temperature < 5) {
                    throw new TooCold("Temperature is too cold!");
                } else {
                    System.out.println("Normal temperature.");
                    double fahrenheit = (temperature * 9/5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                }
            } catch (TooHot e) {
                System.out.println(e.getMessage());
            } catch (TooCold e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid numeric value for temperature.");
            }
    }
}
