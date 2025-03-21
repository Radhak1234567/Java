// 2. Holi class
class Holi {
    String festivalName;
    int year;
    boolean isNationalHoliday;
    String location;
    double budget;
    int numberOfPeople;

    
    Holi() {}
    Holi(String festivalName) { this.festivalName = festivalName; }
    Holi(String festivalName, int year) { this.festivalName = festivalName; this.year = year; }
    Holi(String festivalName, int year, boolean isNationalHoliday) {
        this.festivalName = festivalName;
        this.year = year;
        this.isNationalHoliday = isNationalHoliday;
    }
    Holi(String festivalName, int year, boolean isNationalHoliday, String location) {
        this.festivalName = festivalName;
        this.year = year;
        this.isNationalHoliday = isNationalHoliday;
        this.location = location;
    }
    Holi(String festivalName, int year, boolean isNationalHoliday, String location, double budget) {
        this.festivalName = festivalName;
        this.year = year;
        this.isNationalHoliday = isNationalHoliday;
        this.location = location;
        this.budget = budget;
    }
    Holi(String festivalName, int year, boolean isNationalHoliday, String location, double budget, int numberOfPeople) {
        this.festivalName = festivalName;
        this.year = year;
        this.isNationalHoliday = isNationalHoliday;
        this.location = location;
        this.budget = budget;
        this.numberOfPeople = numberOfPeople;
    }

    void display() {
        System.out.println("Holi [Festival=" + festivalName + ", Year=" + year + ", National Holiday=" + isNationalHoliday +
            ", Location=" + location + ", Budget=" + budget + ", People=" + numberOfPeople + "]");
    }
}