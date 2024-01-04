/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_components_pkg;

/**
 *
 * @author Tai Nguyen
 * 041086103
 * The `WRGRAM` class represents a RAM (Random Access Memory) component for a gaming PC.
 * It implements the `RAM` interface.
 */
public class WRGRAM implements RAM {
    
    /**
     * 
     * Returns a string representation of the RAM configuration.
     *
     * @return A string describing the RAM component, e.g., "16GB DDR4 (2 x 8GB) 3200 MHz". 
     */
    public String toString(){
        return "16GB DDR4 (2 x 8GB) 3200 MHz";
    }
}
