public enum Days {
    MONDAY("Дуйшонбу куну техникалык сабак"),
    TUESDAY("Шейшемби куну толкин клаб"),
    WEDNESDAY("Шаршемби куну техникалык англиский"),
    THURSDAY("Бейшемби гуну практикалык сабак"),
    FRIDAY("Жума куну ивент болот"),
    SATURDAY("Ишемби куну кайталоо"),
    SUNDAY("Жекшемби куну эсалуу") ;

      private  String day;

    Days(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}


