package pojo;

public class Profession {

    String profession;

    public Profession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "profession = '" + profession + '\'' +
                '}';
    }
}
