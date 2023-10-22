package Poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Declaración de la clase &#39;jpanBarraDeMenu&#39; que hereda de un &#39;jpanFondo&#39;
//e implementa a la interface &#39;ActionListener&#39;}

public class jpanBarraDeMenu extends jpanFondo implements ActionListener {
//Declaración de Atributos
//Declaración de componentes gráficos swing para crear la GUI

    private JMenuBar jmnbBarra;
    private JMenu jmnArchivo;
    private JMenuItem jmniEntrar;
    private JMenuItem jmniSalir;
    private JMenu jmnUsuario;
    private JMenuItem jmniAlumno;
//    private JMenuItem jmniRevista;
//    private JMenuItem jmniTesis;
//Declaración del objeto que referenciará al objeto &#39;jpanelFondo&#39; creado
//en la clase &#39;jfrmPrincipal&#39;
    private jpanFondo jpanelFondo;
//Este es el método constructor por parámetro
//le llega por parámetro la referencia de un objeto de tipo &#39;jpanFondo&#39;
//luego invoca o llama al método &#39;iniciarComponentes()&#39;

    public jpanBarraDeMenu(jpanFondo jpanelFondo) {
        this.jpanelFondo = jpanelFondo;
        iniciarComponentes();
    }
//Este método instancia los objetos o componentes gráficos
//que se van a mostrar dentro del JPanel (lienzo)

    public void iniciarComponentes() {
//Indicamos que el Administrador de Diseño sea nulo
        this.setLayout(null);
//Instanciamos a la barra de menú
//Indicamos su posición y tamaño dentro del JPanel
        jmnbBarra = new JMenuBar();
        jmnbBarra.setBounds(0, 0, 800, 50);
//Instanciamos a un menú que se llamará &#39;jmnArchivo&#39;
        jmnArchivo = new JMenu("Archivo "
        );
//Instanciamos a un item del menú llamado &#39;jmniEntrar&#39;
//Este item va ir dentro del menú &#39;jmnArchivo&#39;
//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar
//los eventos que se originan sobre él
        jmniEntrar = new JMenuItem("Iniciar "
        );
        jmniEntrar.setIcon(new ImageIcon(rutaDeImagenes + "iniciar.jpg "
        ));
        jmniEntrar.addActionListener(this);
//Instanciamos a un item del menú llamado &#39;jmniSalir&#39;
//Este item va ir dentro del menú &#39;jmnArchivo&#39;
//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar
//los eventos que se originan sobre él
        jmniSalir = new JMenuItem("Cerrar "
        );
        jmniSalir.setIcon(new ImageIcon(rutaDeImagenes + "cerrar.gif "
        ));
        jmniSalir.addActionListener(this);
//Añadimos los items al menú &#39;jmnArchivo&#39;
//Tambien añadimos un objeto de tipo &#39;JSeparator&#39;
//el cual es una línea que separa a dos items del menú
        jmnArchivo.add(jmniEntrar);
        jmnArchivo.add(new JSeparator());
        jmnArchivo.add(jmniSalir);
//Instanciamos a un menú que se llamará &#39;jmnMantenimiento&#39;
        jmnUsuario = new JMenu("Usuario "
        );
//Instanciamos a un item del menú llamado &#39;jmniLibro&#39;
//Este item va ir dentro del menú &#39;jmnMantenimiento&#39;
//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar
//los eventos que se originan sobre él
        jmniAlumno= new JMenuItem("Alumno ");
        jmniAlumno.setIcon(new ImageIcon(rutaDeImagenes + "libro.gif "
        ));
        jmniAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cambiamos al panel de mantenimiento de Alumno
                ((CardLayout) jpanelFondo.getLayout()).show(jpanelFondo, "alumno");
            }
        });
        
//Instanciamos a un item del menú llamado &#39;jmniRevista&#39;
//Este item va ir dentro del menú &#39;jmnMantenimiento&#39;
//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar
//los eventos que se originan sobre él
                //        jmniRevista = new JMenuItem("Profesor "
                //        );
                //        jmniRevista.setIcon(new ImageIcon(rutaDeImagenes + "revista.jpg "
                //        ));
                //        jmniRevista.addActionListener(this);
//Instanciamos a un item del menú llamado &#39;jmniTesis&#39;
//Este item va ir dentro del menú &#39;jmnMantenimiento&#39;
//Indicamos la imagen a mostrar y que tenga la propiedad de escuchar
//los eventos que se originan sobre él
                //        jmniTesis = new JMenuItem("Administrador"
                //        );
                //        jmniTesis.setIcon(new ImageIcon(rutaDeImagenes + "tesis.gif "
                //        ));
                //        jmniTesis.addActionListener(this);
//Añadimos los items al menú &#39;jmnMantenimiento&#39;
//Tambien añadimos un objeto de tipo &#39;JSeparator&#39;
//el cual es una línea que separa a dos items del menú
        jmnUsuario.add(jmniAlumno);
        jmnUsuario.add(new JSeparator());
                //        jmnMantenimiento.add(jmniRevista);
                //        jmnMantenimiento.add(new JSeparator());
                //        jmnMantenimiento.add(jmniTesis);
//Añadimos los menús dentro de la barra
        jmnbBarra.add(jmnArchivo);
        jmnbBarra.add(jmnUsuario);
//Desactivamos las opciones del menú
        cambiarEstadoDeLaBarraDeMenu(false);
//Añadimos la barra de menús dentro del JPanel
        this.add(jmnbBarra);
    }
//Este método activa o desactiva a las opciones del menú
//según sea el valor de la varible que viene por parámetro

    public void cambiarEstadoDeLaBarraDeMenu(boolean valor) {
        jmniEntrar.setEnabled(!valor);
        jmniSalir.setEnabled(valor);
        jmnUsuario.setEnabled(valor);
    }
//Este método detecta los eventos de tipo ACTION generados en los componentes
//gráficos swing. Siempre y cuando dichos componentes tengan habilitado su
//propiedad &#39;addActionListener(this)&#39;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jmniEntrar) {
//Cambiamos de &#39;JPanel&#39;, ahora mostramos a &#39;jpanValidarUsuario&#39;
            ((CardLayout) jpanelFondo.getLayout()).show(jpanelFondo, "usuario "
            );
        }
        if (e.getSource() == jmniSalir) {
//Mostramos una ventana de dialogo que pregunte si deseamos salir
            int numero = JOptionPane.showConfirmDialog(null,
                    "Desea SALIR del Sistema", "Salir ",
                    JOptionPane.YES_NO_OPTION
            );
            if (numero == 0) {
//Si la respuesta fue &#39;SI&#39;, entonces deshabilitamos las opciones del menú
                cambiarEstadoDeLaBarraDeMenu(false);
            }
        }
        if (e.getSource() == jmniAlumno) {
//Cambiamos de &#39;JPanel&#39;, ahora mostramos a &#39;jpanMantenimientoLibro&#39;
            ((CardLayout) jpanelFondo.getLayout()).show(jpanelFondo, "alumno");
        }
                //        if (e.getSource() == jmniRevista) {
                ////Cambiamos de &#39;JPanel&#39;, ahora mostramos a &#39;jpanMantenimientoRevista&#39;
                //            ((CardLayout) jpanelFondo.getLayout()).show(jpanelFondo, "profesor");
                //        }
                //        if (e.getSource() == jmniTesis) {
                ////Cambiamos de &#39;JPanel&#39;, ahora mostramos a &#39;jpanMantenimientoTesis&#39;
                //            ((CardLayout) jpanelFondo.getLayout()).show(jpanelFondo, "Administrador");
                //        }
    }
}
