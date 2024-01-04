/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pc_building_pkg;

import gaming_pcs_pkg.GamingPC;

/**
 *
 * @author yapt
 * 
 * The `GamingPCBuilding` abstract class represents a framework for building gaming PCs.
 * Subclasses must implement the `makeGamingPC` method to create specific types of gaming PCs.
 * It also provides a method `orderTheGamingPC` to order and equip the gaming PC based on the type.
 */
public abstract class GamingPCBuilding {
/**
 * 
 * Creates a specific type of gaming PC based on the provided type.
 *
 * @param typeOfGamingPC The type of gaming PC to be created.
 * @return The created gaming PC.
 */
    protected abstract GamingPC makeGamingPC(String typeOfGamingPC);
/**
 * 
 * Orders and equips the gaming PC based on the provided type.
 *
 * @param typeOfGamingPC The type of gaming PC to be ordered.
 * @return The ordered and equipped gaming PC.
 */
    public GamingPC orderTheGamingPC(String typeOfGamingPC) {
        GamingPC theGamingPC = makeGamingPC(typeOfGamingPC);
        theGamingPC.equipGamingPC();
        return theGamingPC;
    }
    
}
