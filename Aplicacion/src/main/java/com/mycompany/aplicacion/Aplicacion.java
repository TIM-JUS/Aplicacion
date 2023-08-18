/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Kenyi Timoteo
 */
public class Aplicacion {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"BIENVENIDO A MI PROGRAMA"+
                "\nPROGRAMADO POR KENYI TIMOTEO"+
                "\n\nVENTA DE DESINFECTANTES");
            float n,precio,a=0,a1=0,s=0,ft=0;
            
        for(int i=0;i<5;i++){
            JOptionPane.showMessageDialog(null,"FACTURACION: "+(i+1));
            String codigo=JOptionPane.showInputDialog("INGRESE EL CODIGO DEL ARTICULO");
            n=Float.parseFloat(JOptionPane.showInputDialog("LA CANTIDAD VENDIDO EN LITROS"));
            precio=Float.parseFloat(JOptionPane.showInputDialog("PRECIO POR LITRO"));
            ft+=n*precio;
            a1=n;
            
            if(n*precio>=600) s++;
        }
        JOptionPane.showMessageDialog(null,"LA FACTURACION TOTAL ES: "+ft+
                "\nCANTIDAD DE LITROS VENDIDOS DEL ARTICULO 1 ES: "+a1+
                "\nCANTIDAD DE FACTURA MAS DE S/600 ES: "+s);
    }
}
