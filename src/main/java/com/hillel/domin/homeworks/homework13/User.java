package com.hillel.domin.homeworks.homework13;

public class User {


    final String name;
    final int dateBirthDay;
    final int dateBirthMonth;
    final int dateBirthYear;
    final String email;
    final String telephone;
    String surname;
    int weight;
    String pressure;
    int numberStepsDay;
    int ageUser;

    int a = 2020;

    public User(String name, int dateBirthDay, int dateBirthMonth, int dateBirthYear, String email, String telephone, String surname, int weight, String pressure, int numberStepsDay) {
        this.name = name;
        this.dateBirthDay = dateBirthDay;
        this.dateBirthMonth = dateBirthMonth;
        this.dateBirthYear = dateBirthYear;
        this.email = email;
        this.telephone = telephone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberStepsDay = numberStepsDay;


    }

    public String getName() {
        return name;
    }

    public int getDateBirthDay() {
        return dateBirthDay;
    }

    public int getDateBirthMonth() {
        return dateBirthMonth;
    }

    public int getDateBirthYear() {
        return dateBirthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getNumberStepsDay() {
        return numberStepsDay;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setNumberStepsDay(int numberStepsDay) {
        this.numberStepsDay = numberStepsDay;
    }

    public int getAge() {
        ageUser = a - dateBirthYear;
        return ageUser;
    }

    public String printAccountInfo(String name, int dateBirthDay, int dateBirthMonth, int dateBirthYear, String email, String telephone, String surname, int weight, String pressure, int numberStepsDay) {
        return "Name: " + name + "\n" + "Surname: " + surname + "\n" + "Date Birth Day: " + dateBirthDay + "\n" + "Date Birth Month: " + dateBirthMonth + "\n" + "Date Birth Year: " + dateBirthYear + "\n" + "Email: " + email + "\n" + "Telephone: " + telephone + "\n" + "Weight: " + weight + "\n" + "Pressure: " + pressure + "\n" + "The number of steps taken per day: " + numberStepsDay;

    }
}


