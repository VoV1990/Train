import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Train[] trains = new Train[5];
        trains[0] = new Train("Minsk", 1360, "12.20");
        trains[1] = new Train("Vilnius", 1400, "09.30");
        trains[2] = new Train("Moscow", 1020, "11.30");
        trains[3] = new Train("Minsk", 1510, "10.30");
        trains[4] = new Train("Kiev", 1305, "10.00");

        sortTrainsByNumber(trains);
        System.out.println("Please enter the train number:");
        int train = Integer.parseInt(reader.readLine());
        getInfo(train, trains);
        sortTrainsByDestination(trains);
        for (Train t : trains) System.out.println(t);
    }

    private static void sortTrainsByDestination(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train t1, Train t2) {
                if(t1.destination.compareTo(t2.destination) == 0)
                    return Double.compare(Double.parseDouble(t1.departureTime), Double.parseDouble(t2.departureTime));
                else return t1.destination.compareTo(t2.destination);
            }
        });
    }

    private static void sortTrainsByNumber(Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train t1, Train t2) {
                return Integer.compare(t1.trainNumber, t2.trainNumber);
            }
        });
    }

    private static void getInfo(int number, Train[] trains) {
        for (Train train : trains) {
            if(train.trainNumber == number) System.out.println("Info by train: " + train);
        }
    }
}
