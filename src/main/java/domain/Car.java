package domain;

public class Car {

    private static final int CAR_NAME_LIMIT_LENGTH = 5;
    private String name;
    private Integer step;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        validateLength(name);
        this.name = name;
    }

    private void validateLength(String name) {
        if (name.isEmpty()
            || name.length() > CAR_NAME_LIMIT_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public Integer getStep() {
        return this.step;
    }

    public void setStep(Integer step) {
        validateStep(step);
        this.step = step;
    }

    private void validateStep(Integer step) {
        if (step < 0 || step > 9) {
            throw new IllegalArgumentException();
        }
    }
}
