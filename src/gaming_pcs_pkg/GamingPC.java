/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaming_pcs_pkg;

import gaming_pc_components_pkg.CPU;
import gaming_pc_components_pkg.GraphicsAdapter;
import gaming_pc_components_pkg.RAM;
import gaming_pc_components_pkg.Storage;

/**
 *
 * @author yapt
 */
public abstract class GamingPC {
    
    private String name;
    
    // Newly defined objects that represent the CPU, RAM, storage, & graphics adapter.
    // These can be changed easily by assigning new parts 
    // in G4LGamingPCFactory or WRGGamingPCFactory
  /**
   * The CPU component of the gaming PC.
   */
    protected CPU cpu;
    /**
     * The RAM component of the gaming PC
     */
    protected RAM ram;
    /**
     * The storage component of the gaming PC.
     */
    protected Storage storage;
    /**
     * The graphics adapter component of the gaming PC.
     */
    protected GraphicsAdapter graphicsAdapter;
    
    /**
     * 
     * Gets the name of the gaming PC.
     *
     * @return The name of the gaming PC.
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the gaming PC.
     *
     * @param name The name to set for the gaming PC.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Abstract method to equip the gaming PC with components.
     */
    public abstract void equipGamingPC();
    
    // Because the toString() method is defined in CPU,
    // when it is printed the string defined in toString() appears
    // on the screen
    /**
     * Displays information about the CPU of the gaming PC.
     */
    public void displayCPUInfo() {
        System.out.println(getName() + " CPU:  " + cpu);
    }
    
    // Because the toString() method is defined in RAM,
    // when it is printed the string defined in toString() appears
    // on the screen
    /**
     * Displays information about the RAM of the gaming PC.
     */
    public void displayRAMInfo() {
        System.out.println(getName() + " RAM:  " + ram);
    }
    
    // Because the toString() method is defined in Storage,
    // when it is printed the string defined in toString() appears
    // on the screen
    /**
     * Displays information about the storage of the gaming PC.
     */
    public void displayStorageInfo() {
        System.out.println(getName() + " Storage:  " + storage);
    }

    // Because the toString() method is defined in GraphicsAdapter,
    // when it is printed the string defined in toString() appears
    // on the screen
    /**
     * Displays information about the graphics adapter of the gaming PC.
     */
    public void displayGraphicsAdapterInfo() {
        System.out.println(getName() + " Graphics Adapter:  " + graphicsAdapter);
    }
    
    // If any gaming PC object is printed to the screen,
    // the following information shows up
    /**
     * 
     * Provides a string representation of the gaming PC.
     *
     * @return A string containing information about the gaming PC.
     */
    public String toString() {
        String gamingPCInfo = "The " + getName() + " has\n\t" + cpu + ",\n\t" + 
                ram + ",\n\t" + storage + " , and\n\t" + graphicsAdapter;
        return gamingPCInfo;
    }
    
}
