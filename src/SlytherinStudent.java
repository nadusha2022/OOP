public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determinatin;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determinatin, int ambition,
                            int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determinatin = determinatin;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDeterminatin() {
        return determinatin;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int ability() {
        return cunning + determinatin + ambition + ingenuity + thirstForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 < ability2) {
            System.out.printf("Слизиренец %s лучше, чем Слизиренец %s: %d VS %d%n", getName(),
                    slytherinStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизиренец %s лучше, чем Слизиренец %s: %d VS %d%n", slytherinStudent.getName(),
                    getName(), ability2, ability1);
        } else {
            System.out.printf("Слизиренец %s такой же, как и Слизиренец %s: %d VS %d%n", slytherinStudent.getName(),
                    getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; хитрость: %d;решительность: %d;амбициозность: %d;находчивость: %d;жажда власти: %d",
                super.toString(), cunning, determinatin, ambition, ingenuity, thirstForPower);
    }
}
