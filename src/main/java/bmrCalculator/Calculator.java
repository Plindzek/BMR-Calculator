package bmrCalculator;

class Calculator {
    private double bmr;
    private double bmi;
    private double tmr;
    String bmiComment;
    String choose;

    double countBmi(Person person) {
        double height = person.getHeightInCm();
        height = height/100;
        bmi = person.getWeightInKg() / (height * height);
        bmi = Math.round(bmi * 100) / 100;
        return bmi;
    }

    double countPpmBmr(Person person) {
        if (person.getFizGender() == Gender.MALE) {
            bmr = (9.99 * person.getWeightInKg() + 6.25 * person.getHeightInCm() - 4.92 * person.getAgeInYears()) + 5;
        }
        if (person.getFizGender() == Gender.FEMALE) {
            bmr = (9.99 * person.getWeightInKg() + 6.25 * person.getHeightInCm() - 4.92 * person.getAgeInYears()) - 161;
        }
        bmr = Math.round(bmr * 100) / 100;
        return bmr;
    }

    double countCpmTmr(Person person) {
        tmr = bmr * person.getActivity().getFactor();
        tmr = Math.round(tmr * 100) / 100;
        return tmr;
    }

    void count(Person person) {
        countBmi(person);
        countPpmBmr(person);
        countCpmTmr(person);

        if (person.getFizGender() == Gender.MALE)
            choose = ", wprowadziłeś";
        else if (person.getFizGender() == Gender.FEMALE)
            choose = ", wprowadziłaś";

        if (bmi < 18.5)
            bmiComment = "Masz niedowagę (BMI<18.5)";
        else if (18.5 <= bmi & bmi <= 24.9)
            bmiComment = "Twoja waga jest prawidłowa (18.5<=BMI<=24.9)";
        else if (25 <= bmi & bmi <= 29.9)
            bmiComment = "Masz nadwagę (25<=BMI<=29.9)";
        else if (bmi >= 30)
            bmiComment = "Tak wysokie BMI oznacza otyłość (BMI>=30)";

        System.out.println("Witaj " + person.getName() + choose + " dane:\n"+person.toString());
        System.out.println(person.getName() + ", Twoje BMI (indeks masy ciała) wynosi: " + bmi + ". " + bmiComment);
        System.out.println("Twoje PPM/BMR (podstawowa przemiana materii) wynosi: " + bmr + " kcal");
        System.out.println("Twoje CPM/TMR (całkowita przemiana materii) wynosi: " + tmr + " kcal");
    }
}

