package main.java;

public class Main {
    public static void main(String[] args) {
        Person harvey = new Person();
        harvey.setName("Harvey");
        harvey.setSurname("Specter");
        harvey.setGender("masculino");
        harvey.imprimirPerson();

        Person louis = new Person("Louis", "Litt", "masculino");
        louis.imprimirPerson(); 

        Person donna = new Person("Donna", "Paulsen", "feminino");
        donna.imprimirPerson();

        Law rand = new Law("Rand, Kaldor & Zane e Pearson-Specter-Litt", "foundation","f1", "gA1");
        rand.info();

        Law pearson = new Law("Pearson-Specter-Litt", null, null, null);

        Tech velocity = new Tech("Velocity Data Solutions","f2", "nd", "ia1");
        velocity.info();

        Person mike = new Person("Mike", "Ross", "masculino");
        mike.imprimirPerson();

        Person robert = new Person("Robert", "Zane", "masculino");
        robert.imprimirPerson();

        pearson.setEmployeers(harvey);
        pearson.setEmployeers(louis);
        pearson.setEmployeers(donna);

        rand.setEmployeers(robert);

        velocity.setEmployeers(mike);

        donna.setJob(new COO());
        mike.setJob(new Attorney());
        louis.setJob(new Attorney());
        harvey.setJob(new NameParther());
    }
}
