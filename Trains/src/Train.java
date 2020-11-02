public class Train {
    String destination;
    int trainNumber;
    String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Train number " + trainNumber +
                ", destination: " + destination +
                ", departure time: " + departureTime;
    }
}
