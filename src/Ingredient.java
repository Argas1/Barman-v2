public class Ingredient {
    private String name;
    private double iloscSkladnika;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIloscSkladnika() {
        return iloscSkladnika;
    }

    public void setIloscSkladnika(double iloscSkladnika) {
        this.iloscSkladnika = iloscSkladnika;
    }

    public Ingredient(String name, double iloscSkladnika) {
        this.name = name;
        this.iloscSkladnika = iloscSkladnika;

    }
}
