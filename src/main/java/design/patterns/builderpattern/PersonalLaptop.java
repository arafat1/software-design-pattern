package design.patterns.builderpattern;

public class PersonalLaptop extends AbstractLaptop {
    public enum Suite{BASIC, HOME, PREMIUM}
    private final Suite officeSuite;

    public static class Builder extends AbstractLaptop.Builder<Builder> {
        private Suite officeSuite;

        public Builder(Suite officeSuite) {
            this.officeSuite = officeSuite;
        }

        @Override
        PersonalLaptop build() {
            return new PersonalLaptop(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private PersonalLaptop(Builder builder) {
        super(builder);
        this.officeSuite = builder.officeSuite;
    }

    public Suite getOfficeSuite() {
        return officeSuite;
    }
}
