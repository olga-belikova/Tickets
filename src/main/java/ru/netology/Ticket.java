package ru.netology;
public class Ticket implements Comparable<Ticket> {

    protected int id;
    protected int price;
    protected String airportDep;
    protected String airportArr;
    protected int flightTime;

    public Ticket(int id, int price, String airportDep, String airportArr, int flightTime) {
        this.id = id;
        this.price = price;
        this.airportDep = airportDep;
        this.airportArr = airportArr;
        this.flightTime = flightTime;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getAirportDep() {
        return airportDep;
    }

    public String getAirportArr() {
        return airportArr;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAirportDep(String airportDep) {
        this.airportDep = airportDep;
    }

    public void setAirportArr(String airportArr) {
        this.airportArr = airportArr;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }


    @Override
    public int compareTo(Ticket o) {
        if (this.getPrice() < o.getPrice()) {
            return -1;
        } else if (this.getPrice() > o.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }
}
