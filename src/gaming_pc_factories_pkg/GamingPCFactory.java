/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_factories_pkg;

import gaming_pc_components_pkg.CPU;
import gaming_pc_components_pkg.GraphicsAdapter;
import gaming_pc_components_pkg.RAM;
import gaming_pc_components_pkg.Storage;

/**
 *
 * @author yapt
 * The `GamingPCFactory` interface defines the required components for creating a gaming PC.
 * Any class that implements this interface must provide methods to create a CPU, RAM, Storage, and GraphicsAdapter.
 */
// Here is where the required components are defined
public interface GamingPCFactory {
    /**
     * 
     * Creates and returns a CPU object.
     *
     * @return The CPU component. 
     */
    public CPU createCPU();
    /**
     * 
     * Creates and returns a RAM object.
     *
     * @return The RAM component. 
     */
    public RAM createRAM();
    /**
     * 
     * Creates and returns a Storage object.
     *
     * @return The Storage component. 
     */
    public Storage createStorage();
    /**
     * 
     * Creates and returns a GraphicsAdapter object.
     *
     * @return The GraphicsAdapter component.
     */
    public GraphicsAdapter createGraphicsAdapter();
    
}
