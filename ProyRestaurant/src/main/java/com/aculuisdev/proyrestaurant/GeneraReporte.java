
package com.aculuisdev.proyrestaurant;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class GeneraReporte {
    public static void generarReporte() {
        Connection conn = null;

        try {
            // Cargar el driver de SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establecer la conexión con la base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=restaurante;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "123456789";

            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión establecida con éxito.");

            // Ruta del archivo Jasper compilado (debes haberlo generado antes desde Jaspersoft)
            String jasperPath = "src/main/resources/reporte_ventas.jasper";

            // Cargar el reporte
            JasperReport reporte = (JasperReport) JRLoader.loadObject(new File(jasperPath));

            // Parámetros para el reporte (opcional)
            HashMap<String, Object> parametros = new HashMap<>();
            parametros.put("fechaInicio", "2025-02-01"); // Ejemplo de parámetro

            // Llenar el reporte con datos de la base de datos
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, conn);

            // Exportar a PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "reporte_ventas.pdf");
            System.out.println("Reporte generado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar conexión
            try {
                if (conn != null) conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        generarReporte();
    }
}
