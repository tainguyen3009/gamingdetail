/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_components_pkg;

/**
 *
 * @author yapt 
 * Modified by Tai Nguyen
 * The `G4LCPU` class represents a Central Processing Unit (CPU) component for a gaming PC in the G4L series.
 * It implements the `CPU` interface and provides details about the G4L Core i5-11400F CPU.
 */
public class G4LCPU implements CPU {
    /**
     * 
     * Returns a string representation of the G4L CPU configuration.
     *
     * @return A string describing the G4L CPU component, e.g., "2.6Hz G4L Core i5-11400F". 
     */
@Override
public String toString(){
    return "2.6Hz G4L Core i5-11400F";
}
}
