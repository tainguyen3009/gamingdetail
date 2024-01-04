/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_factories_pkg;

import gaming_pc_components_pkg.CPU;
import gaming_pc_components_pkg.G4LCPU;
import gaming_pc_components_pkg.G4LGraphicsAdapter;
import gaming_pc_components_pkg.G4LRAM;
import gaming_pc_components_pkg.G4LStorage;
import gaming_pc_components_pkg.GraphicsAdapter;
import gaming_pc_components_pkg.RAM;
import gaming_pc_components_pkg.Storage;

/**
 *
 * @author yapt
 * Modified by Tai NGuyen
 * The `G4LGamingPCFactory` class implements the `GamingPCFactory` interface.
 * It defines the components that will be used for creating a G4L gaming PC.
 * Each method specifies a specific component that will be associated with the G4L gaming PC.
 */
// This factory implements the GamingPCFactory interface.
// This is where we define all of the components the G4L gaming PC
// will use by implementing the methods from the interface.
// The returned object by each method specifies a specific component that will 
// be used for this gaming PC.
public class G4LGamingPCFactory implements GamingPCFactory {

    // Defines the CPU object to associate with the G4L gaming PC
    /**
     * 
     * Creates and returns a G4L CPU object.
     *
     * @return The G4L CPU component. 
     */
    public CPU createCPU() {
        return new G4LCPU();
    }
    
    // Defines the RAM object to associate with the G4L gaming PC
    /**
     * 
     * Creates and returns G4L RAM object.
     *
     * @return The G4L RAM component.
     */
    public RAM createRAM() {
        return new G4LRAM();
    }

    // Defines the Storage object to associate with the G4L gaming PC
    /**
     * 
     * Creates and returns G4L Storage object.
     *
     * @return The G4L Storage component.
     */
    public Storage createStorage() {
        return new G4LStorage();
    }

    // Defines the GraphicsAdapter object to associate with the G4L gaming PC
    /**
     * 
     * Creates and returns G4L GraphicsAdapter object.
     *
     * @return The G4L GraphicsAdapter component. 
     */
    public GraphicsAdapter createGraphicsAdapter() {
        return new G4LGraphicsAdapter();
    }
    
}
