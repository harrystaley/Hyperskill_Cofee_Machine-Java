class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String name_tmp = p1.name;
        int age_tmp = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = name_tmp;
        p2.age = age_tmp;
    }
}