public class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honar;
    private int bravery;

    public GriffindorStudent(String name, int magic, int transgression, int nobility, int honar, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honar = honar;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonar() {
        return honar;
    }

    public void setHonar(int honar) {
        this.honar = honar;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int ability() {
        return nobility + honar + bravery;
    }

    public void compareGriffindor(GriffindorStudent griffindorStudent) {
        int ability1 = ability();
        int ability2 = griffindorStudent.ability();
        if (ability1 < ability2) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s: %d VS %d%n", getName(),
                    griffindorStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем Гриффиндорец %s: %d VS %d%n", griffindorStudent.getName(),
                    getName(), ability2, ability1);
        } else {
            System.out.printf("Гриффиндорец %s такой же, как и Гриффиндорец %s: %d VS %d%n", griffindorStudent.getName(),
                    getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d;честь: %d;храбрость: %d", super.toString(), nobility, honar, bravery);
    }
}


