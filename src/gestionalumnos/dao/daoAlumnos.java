/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos.dao;
import gestionalumnos.bdConnection.BDconnection;
import gestionalumnos.beans.beansAlumnos;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gem2u
 */
public class daoAlumnos extends BDconnection{
    public int registrarAlumnos(beansAlumnos bsAlumnos){
        int codigo = 0;
        int res = 0;
        try{
            getConnection();
            if(connection != null){
                String query = "select * from alumnos where noeco=? and boleta=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, bsAlumnos.getEco());
                ps.setString(2, bsAlumnos.getBoleta());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Este alumno ya esta registrado.");
                }else{
                query = "insert into alumnos(nombre, fapellido, sapellido, boleta, noeco) values(?,?,?,?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, bsAlumnos.getNombre());
                ps.setString(2, bsAlumnos.getpApellido());
                ps.setString(3, bsAlumnos.getsApellido());
                ps.setString(4, bsAlumnos.getBoleta());
                ps.setString(5, bsAlumnos.getEco());
                res = ps.executeUpdate();
                if(res >= 1){
                    JOptionPane.showMessageDialog(null, "Se registró correctamente al alumno.");
                    codigo = 1;
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo registrar al alumno.");
                    codigo = -1;
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return codigo;
    }
    
    public DefaultTableModel tablaAlumnos(beansAlumnos bsAlumnos){
        String [] titulos = {"Boleta", "Nombre", "Primer Apellido", "Segundo Apellido"};
        String [] registro = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        try{
            getConnection();
            if(connection != null){
                String query = "select * from alumnos where noeco=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, bsAlumnos.getEco());
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    registro[0] = rs.getString("boleta");
                    registro[1] = rs.getString("nombre");
                    registro[2] = rs.getString("fapellido");
                    registro[3] = rs.getString("sapellido");
                    modelo.addRow(registro);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return modelo;
    }
    
    public DefaultTableModel buscarAlumno(beansAlumnos bsAlumnos){
        String [] titulos = {"Boleta", "Nombre", "Primer Apellido", "Segundo Apellido"};
        String [] registro = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        try{
            getConnection();
            if(connection != null){
                String query = "select * from alumnos where boleta=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, bsAlumnos.getBoleta());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    registro[0] = rs.getString("boleta");
                    registro[1] = rs.getString("nombre");
                    registro[2] = rs.getString("fapellido");
                    registro[3] = rs.getString("sapellido");
                    modelo.addRow(registro);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return modelo;
    }
    
    public int actualizarAlumno(beansAlumnos bsAlumnos){
        int codigo = 0;
        try{
            getConnection();
            if(connection != null){
                String query = "select * from alumnos where boleta=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, bsAlumnos.getBoleta());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    query = "update alumnos set nombre=?, fapellido=?, sapellido=? where boleta=?";
                    ps = connection.prepareStatement(query);
                    ps.setString(1, bsAlumnos.getNombre());
                    ps.setString(2, bsAlumnos.getpApellido());
                    ps.setString(3, bsAlumnos.getsApellido());
                    ps.setString(4, bsAlumnos.getBoleta());
                    int res = ps.executeUpdate();
                    if(res >= 1){
                        JOptionPane.showMessageDialog(null, "Se actualizó correctamente al alumno.");
                        codigo = 1;
                    }else{
                        JOptionPane.showMessageDialog(null, "No se actualizó correctamente al alumno.");
                        codigo = -1;
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return codigo;
    }
    
    public int borrarAlumno(beansAlumnos bsAlumnos){
        int codigo = 0;
        try{
            getConnection();
            if(connection != null){
                String query = "select * from alumnos where boleta=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, bsAlumnos.getBoleta());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    query = "delete from alumnos where boleta=?";
                    ps = connection.prepareStatement(query);
                    ps.setString(1, bsAlumnos.getBoleta());
                    int res = ps.executeUpdate();
                    if(res >=1){
                        JOptionPane.showMessageDialog(null, "Se borro correctamente al alumno.");
                        codigo = 1;
                    }else{
                        codigo = -1;
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return codigo;
    }
    
    public void settingAlumnos(String eco, int alumnos){
        String numAlumnos = Integer.toString(alumnos);
        try{
            getConnection();
            if(connection != null){
                String query = "update profesores set numalumnos=? where noeco=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, numAlumnos);
                ps.setString(2, eco);
                int res = ps.executeUpdate();
                if(res >= 1){
                    System.out.println("Se actualizo el numero de alumnos");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
