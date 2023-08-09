package atvMapaAdsisProgramação1app;

import atvMapaAdsisProgramação1Entities.ExColesterol;
import atvMapaAdsisProgramação1Entities.ExGlicemia;
import atvMapaAdsisProgramação1Entities.ExTriglicerideos;

public class Program {
    public static void main(String[] args) {
        
        ExGlicemia eg = new ExGlicemia();
        eg.cadastrarExame();
        eg.mostrarResultado(); 
       
        ExColesterol ec = new ExColesterol();
        ec.cadastrarExame();
        ec.mostrarResultado();
        
        ExTriglicerideos et = new ExTriglicerideos();
        et.cadastrarExame();
        et.mostrarResultado();
        
    }
}