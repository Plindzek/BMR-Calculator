package bmrCalculator;

interface ProfileBuilder {
    
    Person build();
    
    ProfileBuilder setFizGender(final Gender fizGender);
    ProfileBuilder setActivity(final Activity strength);
    ProfileBuilder setName(final String name);
    ProfileBuilder setWeightInKg(final double weight);
    ProfileBuilder setHeightInCm(final int height);
    ProfileBuilder setAgeInYears(final int age);
}
