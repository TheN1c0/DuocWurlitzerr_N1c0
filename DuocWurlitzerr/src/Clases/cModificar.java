/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nico_
 */
public class cModificar {
    ArrayList<String> datos = new ArrayList<>();
    
    public ArrayList<String> consultarUsuarioBuscar(String pTitulo)
    {
        // TODO add your handling code here:
        ConexionBD db = new ConexionBD();
        // Se inicializa a null

    try {

        Connection cn = db.conexion();
        PreparedStatement pst = cn.prepareStatement("SELECT id,titulo,autor,disco,anio,duracions,duracionm,estilo FROM canciones WHERE titulo = ?");
        pst.setString(1, pTitulo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
             datos.clear();
             String exid = rs.getString(1);
             String extitulo = rs.getString(2);
             String exautor = rs.getString(3);
             String exdisco= rs.getString(4);
             String exanio= rs.getString(5);
             String exduracions= rs.getString(6);
             //String exduracionm= rs.getString(7);
             String exestilo= rs.getString(8);
             datos.add(exid);
             System.out.println("aaa");
             datos.add(extitulo);
             
             datos.add(exautor);
             datos.add(exdisco);
             datos.add(exanio);
             datos.add(exduracions);
             //datos.add(exduracionm);
             datos.add(exestilo);
             return datos;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return datos;
    }
}
