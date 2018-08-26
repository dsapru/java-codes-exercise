package insy.java.hw6;

public class OurDate {
    private int month, day, year;
    private static int count = 0;

    // OurDate constructors
    public OurDate() {
        this(0, 0, 0);
    }

    public OurDate(int m, int d, int y) {
        setMonth(m);
        setDay(d);
        setYear(y);

        count++;
    }

    // all the selectors
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // all the mutators
    public void setMonth(int m) {
        if ((m >= 0) && (m <= 12))
            month = m;
    }

    public void setDay(int d) {
        if ((d >= 0) && (d <= 31))
            day = d;
    }

    public void setYear(int y) {
        if (y >= 0)
            year = y;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public boolean equals(Object o) {
        OurDate date = (OurDate) o;

        if ((month == date.getMonth()) &&
                (day == date.getDay()) &&
                (year == date.getYear()))
            return true;

        return false;
    }

    public OurDate clone() {
        return new OurDate(month, day, year);
    }
}


