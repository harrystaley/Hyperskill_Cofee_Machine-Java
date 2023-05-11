import javax.print.Doc;

class Army {

    public static void createArmy() {
        Unit ua = new Unit("ua");
        Unit ub = new Unit("ub");
        Unit uc = new Unit("uc");
        Unit ud = new Unit("ud");
        Unit ue = new Unit("ue");
        Knight ka = new Knight("ka");
        Knight kb = new Knight("kb");
        Knight kc = new Knight("kc");
        General g = new General("g");
        Doctor d = new Doctor("d");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}