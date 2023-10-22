/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

import javax.swing.JOptionPane;

/**
 *
 * @author farid
 */
public class Usuario {

    private String codigoUser, nombre, email, genero, nacionalidad, contraseña;

    public Usuario() {
        this.codigoUser = codigoUser;
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.contraseña = contraseña;
    }

    public void setCodigoUser(String codigoUser) {
        this.codigoUser = codigoUser;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCodigoUser() {
        return codigoUser;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void registrarDatosUsuario() {
        setCodigoUser(JOptionPane.showInputDialog("Ingresar el codigo de usuario: ").toLowerCase());
        setNombre(JOptionPane.showInputDialog("Ingrese el nombre: ").toLowerCase());
        setEmail(JOptionPane.showInputDialog("Ingrese el e-mail: ").toLowerCase());
        setGenero(JOptionPane.showInputDialog("Ingrese el genero (masculino, femenino): ").toLowerCase());
        setNacionalidad(JOptionPane.showInputDialog("Ingrese la nacionalidad: ").toLowerCase());
        setContraseña(JOptionPane.showInputDialog("Ingrese la contraseña: "));
    }

    public void mostrarDatosUsuario() {
        JOptionPane.showMessageDialog(null, "El codigo de usuario es: " + getCodigoUser()
                + "El nombre del usuario es: " + getNombre()
                + "El email del usuario es: " + getEmail()
                + "El genero del usuario es: " + getGenero()
                + "La nacionalidad del usuario es: " + getNacionalidad());
    }

//    public void iniciarSesion(){
//        String codigoUsuario;
//        codigoUsuario = JOptionPane.showInputDialog("Ingrese el codigo de usuario: ");
//        
//    }
}
