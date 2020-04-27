/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos.control;
import javax.swing.JOptionPane;
import gestionalumnos.beans.beansAlumnos;
import gestionalumnos.dao.daoAlumnos;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author gem2u
 */
public class controlAlumnos {
    beansAlumnos bsAlumnos = new beansAlumnos();
    daoAlumnos daoAlumnos = new daoAlumnos();
    
    public int validarAlumno(String nombre, String pApellido, String sApellido, String boleta, int flag, String numEco){
        int codigo = 0;
        if(nombre == null || nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe llenar el campo del nombre, es obligatorio");
        }else{
            if(pApellido == null || pApellido.isEmpty()){
                JOptionPane.showMessageDialog(null, "Debe llenar el campo del primer apellido, es obligatorio");
            }else{
                if(boleta == null || boleta.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Debe llenar el campo de la boleta, es obligatorio");
                }else{
                    bsAlumnos.setNombre(nombre);
                    bsAlumnos.setpApellido(pApellido);
                    bsAlumnos.setsApellido(sApellido);
                    bsAlumnos.setBoleta(boleta);
                    bsAlumnos.setEco(numEco);
                    if(flag == 0){ codigo = daoAlumnos.registrarAlumnos(bsAlumnos); }
                    if(flag == 1){ codigo = daoAlumnos.actualizarAlumno(bsAlumnos); }
                }
            }
        }
        return codigo;
    }
    
    public int borrarAlumno(String boleta){
        bsAlumnos.setBoleta(boleta);
        int codigo = daoAlumnos.borrarAlumno(bsAlumnos);
        return codigo;
    }
    
    public DefaultTableModel mostrarTabla(String eco){
        bsAlumnos.setEco(eco);
        DefaultTableModel modelo = daoAlumnos.tablaAlumnos(bsAlumnos);
        return modelo;
    }
    
    public DefaultTableModel buscarAlumno(String boleta){
        bsAlumnos.setBoleta(boleta);
        DefaultTableModel modelo = daoAlumnos.buscarAlumno(bsAlumnos);
        return modelo;
    }
    
    public void validarBoleta(char validar){
        if(Character.isLetter(validar)){
            JOptionPane.showMessageDialog(null, "No puede ingresar letras en este campo, solo números");
        }
    }
    
    public void validarCadenas(char validar){
        if(Character.isDigit(validar)){
            JOptionPane.showMessageDialog(null, "No puede ingresar numeros en este campos, solo letras");
        }
    }
    
    public void settingAlumnos(String eco, int alumnos){
        daoAlumnos.settingAlumnos(eco, alumnos);
    }
    
}
