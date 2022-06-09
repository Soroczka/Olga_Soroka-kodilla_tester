public class HumanValidator {

    public void validAPerson(Human human, double ageChecker, double heightChecker){
        if (human.getName() != null){
            human.validateIsOlderThan(ageChecker);
            human.validateIsHigherThan(heightChecker);
        }
    }
}
