package week04.day2;

public class NameValidator {

    public boolean isValidName(String name){

        String[] nameParts = name.strip().replaceAll(" +", " ").split(" ");

        if (checkFewParts(nameParts)){
            return false;
        }

        return checkFirstLetterUpperCase(nameParts);

    }

    private boolean checkFewParts(String[] nameParts) {
        return nameParts.length < 2;
    }

    private boolean checkFirstLetterUpperCase(String[] nameParts) {
        for (String actual: nameParts) {
            if (!Character.isUpperCase(actual.charAt(0))){
                return false;
            }
        }
        return true;
    }

}
