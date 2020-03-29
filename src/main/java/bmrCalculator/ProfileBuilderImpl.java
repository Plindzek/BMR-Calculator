package bmrCalculator;

class ProfileBuilderImpl implements ProfileBuilder {

    private Person person;

    ProfileBuilderImpl() {
        person = new Person();
    }

    @Override
    public Person build() {
        return person;
    }

    @Override
    public ProfileBuilder setFizGender(Gender fizGender) {
        person.setFizGender(fizGender);
        return this;
    }

    @Override
    public ProfileBuilder setActivity(Activity activity) {
        person.setActivity(activity);
        return this;
    }

    @Override
    public ProfileBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    @Override
    public ProfileBuilder setWeightInKg(double weight) {
        person.setWeightInKg(weight);
        return this;
    }

    @Override
    public ProfileBuilder setHeightInCm(int height) {
        person.setHeightInCm(height);
        return this;
    }

    @Override
    public ProfileBuilder setAgeInYears(int age) {
        person.setAgeInYears(age);
        return this;
    }
}