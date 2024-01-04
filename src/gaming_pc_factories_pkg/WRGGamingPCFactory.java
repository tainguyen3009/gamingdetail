/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_factories_pkg;

import gaming_pc_components_pkg.CPU;
import gaming_pc_components_pkg.GraphicsAdapter;
import gaming_pc_components_pkg.RAM;
import gaming_pc_components_pkg.Storage;
import gaming_pc_components_pkg.WRGCPU;
import gaming_pc_components_pkg.WRGGraphicsAdapter;
import gaming_pc_components_pkg.WRGRAM;
import gaming_pc_components_pkg.WRGStorage;

/**
 *
 * @author yapt
 * Modified by Tai Nguyen
 * The `WRGGamingPCFactory` class implements the `GamingPCFactory` interface.
 * It defines the components that will be used for creating a WRG gaming PC.
 * Each method specifies a specific component that will be associated with the WRG gaming PC.
 */
// This factory implements the GamingPCFactory interface.
// This is where we define all of the components the WRG gaming PC
// will use by implementing the methods from the interface.
// The returned object by each method specifies a specific component that will 
// be used for this gaming PC.
public class WRGGamingPCFactory implements GamingPCFactory {

    // Defines the CPU object to associate with the WRG gaming PC
    /**
     * 
     * Creates and returns a WRG CPU object.
     *
     * @return The WRG CPU component.
     */
    @Override
    public CPU createCPU() {
        return new WRGCPU();
    }
    
    // Defines the RAM object to associate with the WRG gaming PC
    /**
     * 
     * Creates and returns WRG RAM object.
     *
     * @return The WRG RAM component.
     */
    @Override
    public RAM createRAM() {
       return new WRGRAM();
    }

    // Defines the Storage object to associate with the WRG gaming PC
    /**
     * 
     * Creates and returns WRG Storage object.
     *
     * @return The WRG Storage component.
     */
    @Override
    public Storage createStorage() {
        return new WRGStorage();
    }

    // Defines the GraphicsAdapter object to associate with the WRG gaming PC
    /**
     * 
     * Creates and returns WRG GraphicsAdapter object.
     *
     * @return The WRG GraphicsAdapter component.
     */
    @Override
    public GraphicsAdapter createGraphicsAdapter() {
        return new WRGGraphicsAdapter();
    }
    
}
