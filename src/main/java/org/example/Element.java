package org.example;

import java.util.ArrayList;

//Json file for elements is form https://github.com/Bowserinator/Periodic-Table-JSON
public class Element {
    public String name;
    public String symbol;
    public int number;
    public int period;
    public String category;
    public double atomic_mass;
    public String appearance;
    public String phase;
    public double melt;
    public double boil;
    public double density;
    public String discovered_by;
    public double molar_heat;
    public String source;
    public String named_by;
    public String spectral_img;
    public String summary;
    public int ypos;
    public int xpos;
    public ArrayList<Integer> shells;
    public String electron_configuration;
    public String electron_configuration_semantic;
    public double electron_affinity;
    public double electronegativity_pauling;
    public ArrayList<Double> ionization_energies;
    public String cpkHex;

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    public int getPeriod() {
        return period;
    }

    public String getCategory() {
        return category;
    }

    public double getAtomic_mass() {
        return atomic_mass;
    }

    public String getAppearance() {
        return appearance;
    }

    public String getPhase() {
        return phase;
    }

    public double getMelt() {
        return melt;
    }

    public double getBoil() {
        return boil;
    }

    public double getDensity() {
        return density;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public double getMolar_heat() {
        return molar_heat;
    }

    public String getSource() {
        return source;
    }

    public String getNamed_by() {
        return named_by;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public String getSummary() {
        return summary;
    }

    public int getYpos() {
        return ypos;
    }

    public int getXpos() {
        return xpos;
    }

    public ArrayList<Integer> getShells() {
        return shells;
    }

    public String getElectron_configuration() {
        return electron_configuration;
    }

    public String getElectron_configuration_semantic() {
        return electron_configuration_semantic;
    }

    public double getElectron_affinity() {
        return electron_affinity;
    }

    public double getElectronegativity_pauling() {
        return electronegativity_pauling;
    }

    public ArrayList<Double> getIonization_energies() {
        return ionization_energies;
    }

    public String getCpkHex() {
        return cpkHex;
    }
}
