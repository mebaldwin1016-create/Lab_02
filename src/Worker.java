public class Worker extends Person {

    private double hourlyPayRate;

    public Worker(String firstName,
                  String lastName,
                  String ID,
                  String title,
                  int YOB,
                  double hourlyPayRate) {

        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {

        if(hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        }

        return (40 * hourlyPayRate)
                + ((hoursWorked - 40)
                * hourlyPayRate * 1.5);
    }

    public void displayWeeklyPay(double hoursWorked) {

        double regularHours =
                Math.min(hoursWorked, 40);

        double overtimeHours =
                Math.max(0, hoursWorked - 40);

        double regularPay =
                regularHours * hourlyPayRate;

        double overtimePay =
                overtimeHours *
                        hourlyPayRate * 1.5;

        System.out.println("Worker: "
                + getFirstName()
                + " "
                + getLastName());

        System.out.println("Regular Hours: "
                + regularHours);

        System.out.println("Regular Pay: $"
                + regularPay);

        System.out.println("OT Hours: "
                + overtimeHours);

        System.out.println("OT Pay: $"
                + overtimePay);

        System.out.println("Total Pay: $"
                + calculateWeeklyPay(hoursWorked));

        System.out.println();
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + hourlyPayRate;
    }

    @Override
    public String toJSON() {
        return super.toJSON();
    }

    @Override
    public String toXML() {
        return super.toXML();
    }
}