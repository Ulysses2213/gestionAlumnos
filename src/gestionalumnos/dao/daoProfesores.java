/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalumnos.dao;
import gestionalumnos.bdConnection.BDconnection;
import gestionalumnos.beans.beansProfesores;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gem2u
 */
public class daoProfesores extends BDconnection{
    
    public int registrarProfesor(beansProfesores bsProfesores){
        int codigo = 0;
        try{
            getConnection();
            if(connection != null){
                String query = "select * from profesores where noeco=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, bsProfesores.getEco());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Este profesor ya esta registrado.");
                }else{
                    query = "insert into profesores(nombre, fapellido, sapellido, noeco, numalumnos) values(?,?,?,?,?)";
                    ps = connection.prepareStatement(query);
                    ps.setString(1, bsProfesores.getNombre());
                    ps.setString(2, bsProfesores.getPapellido());
                    ps.setString(3, bsProfesores.getSapellido());
                    ps.setString(4, bsProfesores.getEco());
                    ps.setString(5, bsProfesores.getAlumnos());
                    int res = ps.executeUpdate();
                    if(res >= 1){
                        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente al profesor.");
                        codigo = 1;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No se ha podido registrar al profesor.");
                        codigo = -1;
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return codigo;
    }
    
    public DefaultTableModel tablaProfesores(){
        String [] titulos = {"Nombre", "Primer Apellido", "Segundo Apellido", "# Económico", "# Alumnos"};
        String [] registros = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        try{
            getConnection();
            if(connection != null){
                String query = "select * from profesores";
                PreparedStatement ps = connection.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    registros[0] = rs.getString("nombre");
                    registros[1] = rs.getString("fapellido");
                    registros[2] = rs.getString("sapellido");
                    registros[3] = rs.getString("noeco");
                    registros[4] = rs.getString("numalumnos");
                    modelo.addRow(registros);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return modelo;
    }
    
    public int actualizarProfesor(beansProfesores bsProfesores){
        int codigo = 0;
        try{
            getConnection();
            if(connection != null){
                String query = "select * from profesores where noeco=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, bsProfesores.getEco());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    query = "update profesores set nombre=?, fapellido=?, sapellido=? where noeco=?";
                    ps = connection.prepareStatement(query);
                    ps.setString(1, bsProfesores.getNombre());
                    ps.setString(2, bsProfesores.getPapellido());
                    ps.setString(3, bsProfesores.getSapellido());
                    ps.setString(4, bsProfesores.getEco());
                    int res = ps.executeUpdate();
                    if(res >= 1){
                        JOptionPane.showMessageDialog(null, "Se actualizó correctamente al profesor.");
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
    
    public int borrarProfesor(beansProfesores bsProfesores){
        int codigo = 0;
        try{
            getConnection();
            if(connection != null){
                String query = "select * from profesores where noeco=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, bsProfesores.getEco());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                        query = "delete from profesores where noeco=?";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, bsProfesores.getEco());
                        int res = ps.executeUpdate();
                        if(res >= 1){
                            JOptionPane.showMessageDialog(null, "Se borró correctamente al profesor.");
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
    
    public DefaultTableModel buscarProfesor(beansProfesores bsProfesores){
        String [] titulos = {"Nombre", "Primer Apellido", "Segundo Apellido", "# Económico", "# Alumnos"};
        String [] registros = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        try{
            getConnection();
            if(connection != null){
                String query = "select * from profesores where noeco=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, bsProfesores.getEco());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    registros[0] = rs.getString("nombre");
                    registros[1] = rs.getString("fapellido");
                    registros[2] = rs.getString("sapellido");
                    registros[3] = rs.getString("noeco");
                    registros[4] = rs.getString("numalumnos");
                    modelo.addRow(registros);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return modelo;
    }
}
