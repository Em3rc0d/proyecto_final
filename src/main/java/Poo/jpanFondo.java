package Poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JPanel;
import java.awt.Color;
//Definimos la clase &#39;jpanFondo&#39;
//que HEREDA de la clase &#39;JPanel&#39;

public class jpanFondo extends JPanel {
//Declaración de Atributos
//Declaramos un objeto de tipo &#39;Color&#39;

    protected Color coColorDeFondo;
//Atributo que almacenará la ruta donde se encuentran las imagenes
    protected String rutaDeImagenes;
//Este es el Método Constructor por defecto

    public jpanFondo() {
        this.setLayout(null);
//Instanciamos el objeto &#39;coColorDeFondo&#39;
//se usan 3 números enteros del rango [0-255]
//para crear un color en el sistema RGB
//codigo de colores del color &#39;lightyellow&#39;
        coColorDeFondo = new Color(255, 255, 224);
//Esta es la ruta por defecto, donde se encuentran las imagenes
//Esta ruta dependerá de la unidad de disco duro donde se encuentre
//tu projecto, deberás de modificarla si es necesario
        rutaDeImagenes = "D:/ CURSOS 2008 II / ALGORITMICAII / EjemplosJCreator / Proyecto / src / Biblioteca / Imagenes / ";
//Asignamos el objeto &#39;coColorDeFondo&#39; como
//el color de fondo del jpanFondo
        this.setBackground(coColorDeFondo);
    }
}
