/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.studentdata;

import ec.edu.espe.modelo.Estudiante;
import ec.edu.espe.modelo.Materia;
import ec.edu.espe.modelo.Calculo;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author BJ
 */
public class Student {
    public static void main(String[] args) {
        int num;
        int j=0;
        Scanner keyboard=new Scanner(System.in);
        do{ 
        System.out.println("Cuantos estudiantes va a ingresar (Ingrese cantidad valida 1-25) ?");
            while(!keyboard.hasNextInt()){
                System.out.print("Ingrese numero valido->");
                keyboard.next();
            }
            num=keyboard.nextInt();
        }while((num)<1||num>25);
        Estudiante[] estudiante=new Estudiante[num];
        Materia[] materia=new Materia[num*3];
        for (j=0;j<num*3;j++){
            materia[j]=new Materia();
        }
        j=0;
        for (int i=0;i<num;i++){
            estudiante[i]=new Estudiante();
            System.out.println("Ingreso de Datos para Estudiante: "+(i+1)+"");
            System.out.println ("Ingrese Nombre: ");
            estudiante[i].setName(keyboard.next());
            System.out.println ("Ingrese nombre materia 1: ");
            materia[j].setName(keyboard.next());
            System.out.println ("Ingrese Nota 1 materia 1: ");
            materia[j].setNota1(keyboard.nextFloat());
            System.out.println ("Ingrese Nota 2 materia 1: ");
            materia[j].setNota2(keyboard.nextFloat());
            System.out.println ("Ingrese Nota 3 materia 1: ");
            materia[j].setNota3(keyboard.nextFloat());
            materia[j].setProm(Calculo.promedio(materia[j].getNota1()+materia[j].getNota2()+materia[j].getNota3()));
            estudiante[i].setMateria1(Calculo.comprobacion(materia[j].getProm()));
            j++;
            System.out.println ("Ingrese nombre materia 2: ");
            materia[j].setName(keyboard.next());
            System.out.println ("Ingrese Nota 1 materia 2: ");
            materia[j].setNota1(keyboard.nextFloat());
            System.out.println ("Ingrese Nota 2 materia 2: ");
            materia[j].setNota2(keyboard.nextFloat());
            System.out.println ("Ingrese Nota 3 materia 2: ");
            materia[j].setNota3(keyboard.nextFloat());
            materia[j].setProm(Calculo.promedio(materia[j].getNota1()+materia[j].getNota2()+materia[j].getNota3()));
            estudiante[i].setMateria2(Calculo.comprobacion(materia[j].getProm()));
            j++;
            System.out.println ("Ingrese nombre materia 3: ");
            materia[j].setName(keyboard.next());
            System.out.println ("Ingrese Nota 1 materia 3: ");
            materia[j].setNota1(keyboard.nextFloat());
            System.out.println ("Ingrese Nota 2 materia 3: ");
            materia[j].setNota2(keyboard.nextFloat());
            System.out.println ("Ingrese Nota 3 materia 3: ");
            materia[j].setNota3(keyboard.nextFloat());
            materia[j].setProm(Calculo.promedio(materia[j].getNota1()+materia[j].getNota2()+materia[j].getNota3()));
            estudiante[i].setMateria3(Calculo.comprobacion(materia[j].getProm()));
            estudiante[i].setResult(Calculo.resultadoFinal(estudiante[i].getMateria1(),estudiante[i].getMateria2(),estudiante[i].getMateria3()));
            j++;
        }
        j=0;
        for (int i=0;i<num;i++){
            System.out.println("Estudiante: "+(i+1)+" "+estudiante[i].getName()+" ");
            System.out.println("Materia 1: "+materia[j].getName()+"");
            System.out.println("Nota1:"+materia[j].getNota1()+"\nNota2: "+materia[j].getNota2()+"\nNota3: "+materia[j].getNota3()+"\n");
            System.out.println("Promedio: "+materia[j].getProm()+" Resultado: "+estudiante[i].getMateria1()+"");
            j++;
            System.out.println("Materia 2: "+materia[j].getName()+"");
            System.out.println("Nota1:"+materia[j].getNota1()+"\nNota2: "+materia[j].getNota2()+"\nNota3: "+materia[j].getNota3()+"\n");
            System.out.println("Promedio: "+materia[j].getProm()+" Resultado: "+estudiante[i].getMateria2()+"");
            j++;
            System.out.println("Materia 3: "+materia[j].getName()+"");
            System.out.println("Nota1:"+materia[j].getNota1()+"\nNota2: "+materia[j].getNota2()+"\nNota3: "+materia[j].getNota3()+"\n");
            System.out.println("Promedio: "+materia[j].getProm()+" Resultado: "+estudiante[i].getMateria3()+"");
            System.out.println ("Semestre: "+estudiante[i].getResult()+"");
            j++;
        }
    }
}
