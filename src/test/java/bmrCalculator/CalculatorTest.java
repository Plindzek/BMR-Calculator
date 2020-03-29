package bmrCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    ProfileBuilder builder = new ProfileBuilderImpl().setAgeInYears(40).setFizGender(Gender.MALE).setHeightInCm(174)
            .setName("Krzyś").setActivity(Activity.MEDIUM).setWeightInKg(75.00);
    Person person = builder.build();

    @Test
    public void ShouldReturnCorrectBmi() {
        double bmi = calculator.countBmi(person);
        assertEquals(24.00, bmi , 0.00);
    }

    @Test
    public void ShouldReturnCorrectBmrAndTmr() {
        double bmr = calculator.countPpmBmr(person);
        assertEquals(1644.00, bmr , 0.00);
        double tmr = calculator.countCpmTmr(person);
        assertEquals(2630.00, tmr , 0.00);
    }

    @Test
    public void ShouldReturnCorrectText() {
calculator.count(person);
assertEquals("Twoja waga jest prawidłowa (18.5<=BMI<=24.9)", calculator.bmiComment);
assertEquals(", wprowadziłeś", calculator.choose);

    }

}
