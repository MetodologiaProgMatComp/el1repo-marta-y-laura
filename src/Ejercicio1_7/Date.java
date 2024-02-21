package Ejercicio1_7;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y){
        day = d;
        month =m;
        year =y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int d, int m, int y){
        this.day =d;
        this.month = m;
        this.year =y;
    }
    public String toString(){
        String days;
        String months;
        String years;
        if (day<10){
            days= "0"+String.valueOf(day);
        } else {
            days = String.valueOf(day);
        }
        if (month<10){
            months="0"+String.valueOf(month);
        }else{
            months=String.valueOf(month);
        }
        years = String.valueOf(year);
        return days+"/"+months+"/"+years;
    }
}
