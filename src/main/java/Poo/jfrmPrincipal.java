/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Poo;
//Declaramos las librerias del Java que necesitamos usar

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.CardLayout;

public class jfrmPrincipal extends JFrame {
//Declaración de Atributos
//Declaración de componentes gráficos swing para crear la GUI

    private jpanFondo jpanelFondo;
    private jpanBarraDeMenu jpanelBarra;
    private jpanInicio jpanelInicio;
    private jpanValidarUsuario jpanelValidarUsuario;
    private jpanMantenimientoAlumno jpanelMantAlumno;
    //Declaración del objeto que referenciará a la zona de memoria donde se
//está guardando los objetos de tipo Documento
    private ArregloUsuario arregloRelacionado;
    //Este es el método constructor por parámetro
//le llega por parámetro la referencia de un objeto de tipo &#39;ArregloDeDocumentos&#39;
//luego invoca o llama al método &#39;iniciarComponentes()&#39;

    public jfrmPrincipal(ArregloUsuario arreglo) {
//Referenciamos al objeto creado en el método &#39;main&#39;
        this.arregloRelacionado = arreglo;
        iniciarComponentes();
    }
    //Este método instancia los objetos o componentes gráficos
//que se van a mostrar dentro del JFrame (marco o contorno)

    public void iniciarComponentes() {
//Indicamos el título del formulario
        this.setTitle("Sistema de Estudios ");
//Indicamos el tamaño del formulario
        this.setSize(800, 600);
//Desactivamos el boton Maximizar
        this.setResizable(false);
//Llamamos al método que centra la ventana &#39;jfrmPrincipal&#39;
        centrarVentana();
//Indicamos que no tenga Administrador de Diseño
        this.setLayout(null);
//Instanciamos el JPanel &#39;jpanelFondo&#39;
        jpanelFondo = new jpanFondo();
//Indicamos la posición y tamaño que tendrá dentro del formulario
        jpanelFondo.setBounds(0, 50, 800, 550);
//Indicamos que el Administrador de Diseño del JPanel &#39;jpanelFondo&#39; sea
//de tipo &#39;CardLayout&#39;. Lo que significa que va a contener a otros JPanel
//Es decir se van a colocar cada JPanel tras otro JPanel, como si fueran Naipes
        jpanelFondo.setLayout(new CardLayout());
//Instanciamos al &#39;JPanel&#39; que contendrá a la Barra de Menu
//Enviamos por parámetro la REFERENCIA del JPanel &#39;jpanelFondo&#39;
//para que dentro de la clase &#39;jpanelBarra&#39; se pueda invocar a &#39;jpanelFondo&#39;
        jpanelBarra = new jpanBarraDeMenu(jpanelFondo);
        jpanelBarra.setBounds(0, 0, 800, 50);
//Instanciamos al &#39;JPanel&#39; que mostrará dos imágenes
        jpanelInicio = new jpanInicio();
        jpanelInicio.setBounds(0, 0, 800, 600);
//Instanciamos al &#39;JPanel&#39; que validará el ingreso de un nuevo usuario
//Enviamos por parámetro la REFERENCIA del JPanel &#39;jpanelBarra&#39; y &#39;jpanelFondo&#39;
//para que dentro de la clase &#39;jpanelValidarUsuario&#39; se pueda invocar a los
//métodos de &#39;jpanelBarra&#39; y &#39;jpanelFondo&#39;
        jpanelValidarUsuario = new jpanValidarUsuario(jpanelBarra, jpanelFondo);
        jpanelValidarUsuario.setBounds(0, 0, 800, 600);
//Instanciamos al &#39;JPanel&#39; que registrará el ingreso de un nuevo libro
//Enviamos por parámetro la REFERENCIA del JPanel &#39;jpanelFondo&#39; y &#39;arregloRelacionado&#39;
//para que dentro de la clase &#39;jpanelMantLibro&#39; se pueda invocar a los
//métodos de &#39;jpanelFondo&#39; y &#39;arregloRelacionado&#39;
        jpanelMantAlumno = new jpanMantenimientoAlumno(jpanelFondo, "Alumno ", arregloRelacionado);
        jpanelMantAlumno.setBounds(0, 0, 800, 600);
//PARA IMPLEMENTAR...
//Instanciamos al &#39;JPanel&#39; que registrará el ingreso de una nueva revista
//Enviamos por parámetro la REFERENCIA del JPanel &#39;jpanelFondo&#39; y &#39;arregloRelacionado&#39;
//para que dentro de la clase &#39;jpanelMantRevista&#39; se pueda invocar a los
//métodos de &#39;jpanelFondo&#39; y &#39;arregloRelacionado&#39;
        //        jpanelMantRevista = new jpanMantenimientoRevista(jpanelFondo,  "Revista ",arregloRelacionado
        //        );
        //jpanelMantRevista.setBounds(0, 0, 800, 600);
//PARA IMPLEMENTAR...
//Instanciamos al &#39;JPanel&#39; que registrará el ingreso de una nueva revista
//Enviamos por parámetro la REFERENCIA del JPanel &#39;jpanelFondo&#39; y &#39;arregloRelacionado&#39;
//para que dentro de la clase &#39;jpanelMantTesis&#39; se pueda invocar a los
//métodos de &#39;jpanelFondo&#39; y &#39;arregloRelacionado&#39;
        //        jpanelMantTesis = new jpanMantenimientoTesis(jpanelFondo,  "Tesis ",arregloRelacionado
        //        );
        //jpanelMantTesis.setBounds(0, 0, 800, 600);
//Añadimos cada JPanel al &#39;jpanelFondo&#39;
//Aca funciona el CardLayout, el cual colocará a ca JPanel uno tras otro
//Es decir primero estará &#39;jpanelInicio&#39; y tras este estará &#39;jpanelValidarUsuario&#39;
//y asi sucesivamente, el último en colocarse es &#39;jpanelMantTesis&#39;
        jpanelFondo.add("inicio ", jpanelInicio);
        jpanelFondo.add("usuario ", jpanelValidarUsuario);
        jpanelFondo.add("alumno", jpanelMantAlumno);
//Añadimos al JPanel &#39;jpanelBarra&#39; y &#39;jpanelFondo&#39; dentro del formulario
        this.add(jpanelBarra);
        this.add(jpanelFondo);
//Indicamos que al cerrar la ventana, se detengan todos los procesos
//iniciados para esta ventana
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
//Este método permite centrar la ventana en la pantalla del Monitor

    public void centrarVentana() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;
        this.setLocation(x, y);
    }
//Método main
//Aquí instanciamos al objeto que almacenará a todos los Documentos de mi biblioteca
//Enviamos por referencia dicho objeto &#39;arreglo&#39; para que pueda ser usado
//dentro de la GUI
//Recordar que la información debe estar SEPARADA de la GUI (Interface Gráfica de Usuario)

    public static void main(String[] args) {
        ArregloUsuario arreglo = new ArregloUsuario();
        new jfrmPrincipal(arreglo).setVisible(true);
    }
}
