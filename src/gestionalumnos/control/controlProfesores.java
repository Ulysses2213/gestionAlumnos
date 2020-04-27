/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos.control;
import javax.swing.JOptionPane;
import gestionalumnos.beans.beansProfesores;
import gestionalumnos.dao.daoProfesores;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gem2u
 */
public class controlProfesores {
    
    beansProfesores bsProfesores = new beansProfesores();
    daoProfesores daoProfesores = new daoProfesores();
    
    public int validarProfesor(String nombre, String papellido, String sapellido, String eco, int flag){
        int codigo = 0;
        if(nombre == null || nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe llenar el campo del nombre, es obligatorio");
        }else{
            if(papellido == null || papellido.isEmpty()){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo del primer apellido, es obligatorio");
            }else{
                if(eco == null || eco.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Debe llenar el campo del número económico, es obligatorio");
                }else{
                    bsProfesores.setNombre(nombre);
                    bsProfesores.setPapellido(papellido);
                    bsProfesores.setSapellido(sapellido);
                    bsProfesores.setEco(eco);
                    bsProfesores.setAlumnos("0");
                    if(flag == 0) {codigo = daoProfesores.registrarProfesor(bsProfesores);}
                    if(flag == 1) {codigo = daoProfesores.actualizarProfesor(bsProfesores);}
                }
            }
        }
        return codigo;
    }
    
    public DefaultTableModel mostrarTabla(){
        DefaultTableModel modelo = daoProfesores.tablaProfesores();
        return modelo;
    }
    
    public void validarCadenas(char validar){
        if(Character.isDigit(validar)){
            JOptionPane.showMessageDialog(null, "No puede ingresar números en este campo");
        }
    }
    
    public void validarEco(char validar){
        if(Character.isLetter(validar)){
            JOptionPane.showMessageDialog(null, "No puede ingresar letras en este campo");
        }
    }
    
    public int borrarProfesor(String eco, String alumnos){
        bsProfesores.setEco(eco);
        int codigo = 0; 
        int numAlumnos = Integer.parseInt(alumnos);
        System.out.println("#alumnos -->" +numAlumnos);
        if(numAlumnos >= 0){
            JOptionPane.showMessageDialog(null, "No se puede borrar a este profesor, aún tiene alumnos registrados");
            codigo = -1;
        }else{
            codigo = daoProfesores.borrarProfesor(bsProfesores);
        }
        return codigo;
    }
    
    public DefaultTableModel buscarProfesor(String eco){
        bsProfesores.setEco(eco);
        DefaultTableModel modelo = daoProfesores.buscarProfesor(bsProfesores);
        return modelo;
    }
}
