package bmrCalculator;

class Person {
    private Gender fizGender;
    private Activity activity;
    private String name;
    private double weightInKg;
    private int heightInCm;
    private int ageInYears;

    public void setFizGender(Gender fizGender) {
        this.fizGender = fizGender;
    }

    public void setActivity(Activity strength) {
        this.activity = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public Gender getFizGender() {
        return fizGender;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getName() {
        return name;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    @Override
    public String toString() {
       return "Płeć= " + fizGender + ", aktywność= " + activity + ", \nwaga= " + weightInKg
                + "kg, wzrost= " + heightInCm + "cm, wiek= " + ageInYears + " lat.\n";
    }
}