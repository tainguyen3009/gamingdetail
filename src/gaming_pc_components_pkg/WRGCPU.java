/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_components_pkg;

/**
 *
 * @author Tai Nguyen
 * 041086103
 * The `WRGCPU` class represents a Central Processing Unit (CPU) component for a gaming PC.
 * It implements the `CPU` interface.
 */
public class WRGCPU implements CPU {
    
    /**
     * 
     * Returns a string representation of the CPU configuration.
     *
     * @return A string describing the CPU component, e.g., "WRG Core i5-12400F 6P+0EC/12T 2.5-4.4 GHz 18MB Cache".
     */
    public String toString(){
        return "WRG Core i5-12400F 6P+0EC/12T 2.5-4.4 GHz 18MB Cache";
    }
}
