package services;

import someTransport.Car;
import someTransport.FreightCar;
import someTransport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> serviceQueue = new LinkedList<>();

    public void addToQueue (Car car){
        serviceQueue.add(car);
    }
    public void addToQueue (FreightCar freightCar) {
        serviceQueue.add(freightCar);
    }
    public void service(){
        Transport next = serviceQueue.poll();
        if (next != null) {
            System.out.println("На сервисе " + next.getModel() + " " + next.getBrand());
        }
    }
}
