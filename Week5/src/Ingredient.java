import java.util.Scanner;

public class Ingredient {
    private String name;
    private String measurementUnit;


    public Ingredient(String name, String measurementUnit) {
        this.name = name;
        setMeasurementUnit(measurementUnit);
    }

    public static Ingredient createIngredient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of the ingredient:");
        String name = scanner.nextLine();
        System.out.println("Please input the measurement of the ingredient:");
        String measurementUnit = scanner.nextLine();

        Ingredient ingredient = new Ingredient(name, measurementUnit);
        return ingredient;
    }

    public void displayIngredient() {
        System.out.printf("The ingredient is: %s and the measurement unit is %s", name, measurementUnit);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        boolean matched = false;
        do {
            if (measurementUnit.equals("spoon") || measurementUnit.equals("teaspoon") || measurementUnit.equals("mg") || measurementUnit.equals("kg"))
            { matched = true;
            }


            if (matched) {
                this.measurementUnit = measurementUnit;
            } else {
                System.out.println("Error unit! Please re-enter again:");
                Scanner scanner = new Scanner(System.in);
                measurementUnit = scanner.nextLine();
            }
        } while (!matched);
    }
}
