/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_building_pkg;

import gaming_pc_factories_pkg.G4LGamingPCFactory;
import gaming_pc_factories_pkg.WRGGamingPCFactory;
import gaming_pcs_pkg.G4LGamingPC;
import gaming_pcs_pkg.GamingPC;
import gaming_pcs_pkg.WRGGamingPC;
import gaming_pc_factories_pkg.GamingPCFactory;

/**
 *
 * @author yapt
 * 
 * The `ConcreteGamingPCBuilding` class is a concrete implementation of the `GamingPCBuilding` abstract class.
 * It overrides the `makeGamingPC` method to create specific types of gaming PCs using different factories.
 * This class is responsible for creating G4L and WRG gaming PCs.
 */
public class ConcreteGamingPCBuilding extends GamingPCBuilding {
    
    /**
     * 
     * Creates and returns a specific type of gaming PC based on the provided type.
     *
     * @param typeOfGamingPC The type of gaming PC to be created, e.g., "G4L" or "WRG".
     * @return The created gaming PC. 
     */
    @Override
    protected GamingPC makeGamingPC(String typeOfGamingPC) {
        GamingPC theGamingPC = null;
        if ("G4L".equalsIgnoreCase(typeOfGamingPC)) {
            GamingPCFactory theGamingPCFactory = new G4LGamingPCFactory();
            theGamingPC = new G4LGamingPC(theGamingPCFactory);
            theGamingPC.setName("G4L G15CE-RI516S-CA Gaming Desktop");
            System.out.println("Created G4L Gaming PC " + theGamingPC.getName()); 
        }
        else if ("WRG".equalsIgnoreCase(typeOfGamingPC)) {
            GamingPCFactory theGamingPCFactory = new WRGGamingPCFactory();
            theGamingPC = new WRGGamingPC(theGamingPCFactory);
            theGamingPC.setName("WRG Codex SE 12TH-054CA Gaming Desktop Computer");
            System.out.println("Created WRG Gaming PC " + theGamingPC.getName()); 
        }
        return theGamingPC;
    }

}
