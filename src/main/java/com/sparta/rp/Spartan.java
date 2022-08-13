package com.sparta.rp;

import java.time.LocalDate;
import java.util.Comparator;

public class Spartan {
    private String name;

    public Spartan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    private LocalDate startDate;

    @Override
    public String toString() {
        return "Spartan{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                '}';
    }
    public class SpartanComparator implements Comparator<Spartan> {
        @Override
        public int compare(Spartan spartan, Spartan otherSpartan) {
            return spartan.getName().compareTo(otherSpartan.getName());
        }
    }



}
