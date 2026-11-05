import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        ArrayList<Worker> workers =
                new ArrayList<>();

        workers.add(new Worker(
                "John",
                "Smith",
                "W001",
                "Mr.",
                1990,
                20.0));

        workers.add(new Worker(
                "Mary",
                "Jones",
                "W002",
                "Ms.",
                1988,
                25.0));

        workers.add(new Worker(
                "David",
                "Brown",
                "W003",
                "Mr.",
                1995,
                30.0));

        workers.add(new SalaryWorker(
                "Sarah",
                "Wilson",
                "S001",
                "Dr.",
                1980,
                65000));

        workers.add(new SalaryWorker(
                "James",
                "Taylor",
                "S002",
                "Prof.",
                1975,
                80000));

        workers.add(new SalaryWorker(
                "Emma",
                "Davis",
                "S003",
                "Mrs.",
                1985,
                90000));

        double[] weeks = {40, 50, 40};

        for(int week = 0;
            week < weeks.length;
            week++) {

            System.out.println(
                    "\n========================");

            System.out.println(
                    "WEEK " + (week + 1));

            System.out.println(
                    "========================");

            for(Worker worker : workers) {

                double pay =
                        worker.calculateWeeklyPay(
                                weeks[week]);

                System.out.printf(
                        "%-20s $%.2f%n",
                        worker.getFirstName()
                                + " "
                                + worker.getLastName(),
                        pay);
            }
        }
    }
}