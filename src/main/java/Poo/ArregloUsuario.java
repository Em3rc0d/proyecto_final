/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;
import java.util.ArrayList;
/**
 *
 * @author farid
 */
public class ArregloUsuario {
    private ArrayList<Usuario> usuarios;
    
    public ArregloUsuario(){
        usuarios = new ArrayList();
    }
    
    public void añadeUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void insertaUsuarioPorIndice(int indice, Usuario usuario) {
        usuarios.set(indice, usuario);
    }
//Este método devuelve la referencia al ArrayList

    public ArrayList devuelveElArregloDeUsuarios() {
        return usuarios;
    }
//Este método devuelve por índice a un objeto que está dentro del ArrayList

    public Usuario devuelveUnUsuarioPorIndice(int indice) {
        return (Usuario) usuarios.get(indice);
    }
}
