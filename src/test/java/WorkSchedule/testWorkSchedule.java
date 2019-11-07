package WorkSchedule;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testWorkSchedule {

    private WorkSchedule tmp;

    @Test
    public void teste1() {

        // montagem de cenario
        tmp = new WorkSchedule(10);
        tmp.setRequiredNumber(3, 0, 2);
        WorkSchedule.Hour h = tmp.readSchedule(0);

        Assertions.assertEquals(3, h.requiredNumber, "erro");



    }
}
