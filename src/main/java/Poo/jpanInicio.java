package Poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JLabel;
import javax.swing.ImageIcon;
//Declaración de la clase &#39;jpanInicio&#39; que hereda de un &#39;jpanFondo&#39;

public class jpanInicio extends jpanFondo {
//Declaración de Atributos
//Declaración de componentes gráficos swing para crear la GUI
    private JLabel jlblImagen;
    private JLabel jlblTitulo;
//Este es el método constructor por defecto
//Invoca o llama al método &#39;iniciarComponentes()&#39;

    public jpanInicio() {
        iniciarComponentes();
    }
//Este método instancia los objetos o componentes gráficos
//que se van a mostrar dentro del JPanel (lienzo)

    public void iniciarComponentes() {
//Indicamos que el Administrador de Diseño sea nulo
        this.setLayout(null);
//Instanciamos dos objetos de tipo JLabel
        this.jlblImagen = new JLabel();
        this.jlblTitulo = new JLabel();
//Instanciamos dos objetos de tipo &#39;ImageIcon&#39;
//Estos objetos cargarán una imagen respectivamente
        ImageIcon iconoImagen = new ImageIcon(rutaDeImagenes + "estudiando.gif "
        );
        ImageIcon iconoTitulo = new ImageIcon(rutaDeImagenes + "titulo.jpg "
        );
//Indicamos a cada objeto de tipo &#39;JLabel&#39; cargar al objeto de tipo
//&#39;ImageIcon&#39;, de esta forma la imagen se mostrará en el &#39;JLabel&#39;
        this.jlblImagen.setIcon(iconoImagen);
        this.jlblImagen.setBounds(250, 80, 320, 320);
        this.jlblTitulo.setIcon(iconoTitulo);
        this.jlblTitulo.setBounds(100, 400, 600, 100);
//Añadimos cada objeto de tipo &#39;JLabel&#39; dentro del JPanel &#39;jpanInicio&#39;
        this.add(jlblImagen);
        this.add(jlblTitulo);
    }
}
