
/**
 * Write a description of class Ingredient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Ingredient {
    private String name;
    private double quantity;
    private IngredientUnit unit;
    
    public Ingredient(String name, double quantity, IngredientUnit unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }
    
    public void setName(String name) 
    {
        this.name = (name == null) ? "" : name;;
    }

    public String getName()
    {
        return name;
    }

    public void setQuantity(double quantity)
    {
        this.quantity = Math.max(0.0, quantity);
    }
    
    public double getQuantity()
    {
        return quantity;
    }
    
    public void setUnity(IngredientUnit unit)
    {
        this.unit = (unit == null) ? IngredientUnit.PIECE : unit;
    }
    public String format() {
        String u = (unit == null) ? "" : unit.toString();
        return String.format("%.2f %s of %s", quantity, u, name);
    }
}