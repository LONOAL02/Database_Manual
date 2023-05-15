package org.lorenzo.conection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conection {

    Connection ccn = null;
    Statement st = null;

    public Conection(){
        try
        {
            String rutafile = "db/dbFinal.accdb";
            String Url = "jdbc:ucanaccess://" + rutafile;
            ccn = DriverManager.getConnection(Url);
            st = ccn.createStatement();
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "CONEXION ERRONEA " + e);
        }
    }

    public Connection getConnection(){
        return ccn;
    }

    public void Desconexion(){
        try
        {
            ccn.close();
            System.exit(0);
        } catch (SQLException ex)
        {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}