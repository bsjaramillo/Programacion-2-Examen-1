/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo;

/**
 *
 * @author BJ
 */
public class Calculo { 
    public static float promedio (float nota1){
        float result=0;
        result=((nota1)/3);
        return result;
    }
    public static String comprobacion (float prom){
        String resultado=" ";
        if (prom<14){
            resultado="no pasa";
        }else if (prom>=14){
            resultado="pasa";
        }else if(prom<14||prom>=12){
            resultado="supletorio";
        }
        return resultado;
    }
    public static String resultadoFinal (String materia1,String materia2, String materia3){
        String resultado=" ";
        if (((materia1.compareTo("pasa"))==0)&&((materia1.compareTo("pasa"))==0)&&(materia1.compareTo("pasa"))==0){
            resultado = "Aprobado";
        }else if (((materia1.compareTo("pasa"))==0)&&((materia2.compareTo("pasa"))==0)){
            resultado="Aprobado";
        }else if (((materia2.compareTo("pasa"))==0)&&((materia3.compareTo("pasa"))==0)){
            resultado="Aprobado";
        }else if (((materia1.compareTo("pasa"))==0)&&((materia3.compareTo("pasa"))==0)){
            resultado="Aprobado";
        }else{
            resultado="Reprobado";
        }
        return resultado;
    }
    
}
