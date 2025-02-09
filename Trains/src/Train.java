//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
//по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения
//должны быть упорядочены по времени отправления.

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
