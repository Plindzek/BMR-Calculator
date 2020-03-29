package bmrCalculator;

class Main {

    public static void main(String[] args) {

        new Calculator()
                .count(new ProfileBuilderImpl()
                        .setAgeInYears(40)
                        .setFizGender(Gender.MALE)
                        .setHeightInCm(174)
                        .setName("Krzyś")
                        .setActivity(Activity.MEDIUM)
                        .setWeightInKg(75.00)
                        .build());
    }

}
