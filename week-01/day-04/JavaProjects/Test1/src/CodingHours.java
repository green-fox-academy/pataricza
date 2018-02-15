public class CodingHours {
    public static void main(String[] args) {
        int hours = 6;
        double weeks = 17;
        int workdays = 5;

        System.out.println("An average Green Fox attendee spent " + (int) (weeks*workdays*hours) + " hours with coding.");

        double percentage = ((weeks*52)/(weeks*168)*100);

        System.out.println("If the average work hours weekly are 52, " + (int) percentage + "% of the semester is spent with coding.");

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}
