import WorkSchedule.WorkSchedule;

public class Demo {
    public static void main(String[] args) {
        WorkSchedule t1 = new WorkSchedule(5);

        t1.setRequiredNumber(3,0,2);

        WorkSchedule.Hour x= t1.readSchedule(0);

        System.out.println(x.toString());


}}
