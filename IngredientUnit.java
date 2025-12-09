
/**
 * Enumeration class IngredientUnit - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum IngredientUnit
{
    
    TEASPOON("teaspoon"), TABLESPOON("tablespoon"), CUP("cup"), MILLILITER("milliliter"), LITER("liter"), GRAM("gram"), KILOGRAM("kilogram"), OUNCE("ounce"), POUND("pound") , PIECE("piece");
    
    private final String label;
    
    IngredientUnit(String label) {
        this.label = label;
    }
    
    @Override
    public String toString(){
        return label;
    }
}