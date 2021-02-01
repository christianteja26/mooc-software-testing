package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;

public class GettingStarted {
    public int addFive (int number) {
        return number + 5;
    }

    public void addFiveToTwenty() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    public void addFiveToMinusTwenty() {
        int result = new GettingStarted().addFive(-20);

        //coba
    }
}
