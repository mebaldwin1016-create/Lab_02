public class Person {

    private String firstName;
    private String lastName;
    private final String ID;
    private String title;
    private int YOB;

    public Person(String firstName, String lastName,
                  String ID, String title, int YOB) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public int getYOB() {
        return YOB;
    }

    public String toCSV() {
        return firstName + "," + lastName + "," +
                ID + "," + title + "," + YOB;
    }

    public String toJSON() {
        return "{ \"firstName\":\"" + firstName +
                "\", \"lastName\":\"" + lastName +
                "\", \"ID\":\"" + ID +
                "\", \"title\":\"" + title +
                "\", \"YOB\":" + YOB + " }";
    }

    public String toXML() {
        return "" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<ID>" + ID + "</ID>" +
                "<title>" + title + "</title>" +
                "<YOB>" + YOB + "</YOB>" +
                "";
    }

    @Override
    public String toString() {
        return title + " " + firstName + " " +
                lastName + " ID:" + ID;
    }
}