package Poo;

import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public abstract class jpanMantenimientoUsuario extends jpanFondo implements ActionListener {
//    codigoUser, nombre, email, genero, nacionalidad,contraseña;

    protected JToolBar jtoobBarra;
    protected JButton jbtnNuevo, jbtnGrabar, jbtnMostrar, jbtnActivar, jbtnInactivar;
    protected JButton jbtnSalir;
    protected JLabel jlblCabecera, jlblCodigoUsuario, jlblNombre, jlblEmail, jlblGenero, jlblNacionalidad;
    protected JTextField jtxfCodigoUsuario, jtxfNombre, jtxfEmail, jtxfGenero, jtxfNacionalidad;
    protected jpanFondo jpanelFondo;
    protected String tipoUsuario;
    protected ArregloUsuario arregloRelacionado;

    public jpanMantenimientoUsuario() {
    }

    public jpanMantenimientoUsuario(jpanFondo jpanelFondo,
            String tipoUsuario,
            ArregloUsuario arreglo) {

        this.jpanelFondo = jpanelFondo;
        this.tipoUsuario = tipoUsuario;
        this.arregloRelacionado = arreglo;
        iniciarComponentes();
    }

    public void iniciarComponentes() {
//Indicamos que el Administrador de Diseño sea nulo
        this.setLayout(null);
//Instanciamos la barra de herramientas llamada &#39;jtoobBarra&#39;
//Indicamos su posición y tamaño, color y que no tenga Adm. de Diseño
        jtoobBarra = new JToolBar();
        jtoobBarra.setBounds(0, 0, 800, 40);
        jtoobBarra.setBackground(new Color(70, 130, 180));
        jtoobBarra.setLayout(null);
//Instanciamos un botón llamado &#39;jbtnNuevo&#39;
//Indicamos que muestre una imagen
//Indicamos su posición y tamaño
//Indicamos que tenga la propiedad de escuchar
//los eventos que se originan sobre él
        jbtnNuevo = new JButton("Nuevo");
        jbtnNuevo.setIcon(new ImageIcon(rutaDeImagenes + "nuevo.gif"));
        jbtnNuevo.setBounds(0, 0, 119, 40);
        jbtnNuevo.addActionListener(this);
//Instanciamos un botón llamado &#39;jbtnGrabar&#39;
//Indicamos que muestre una imagen
//Indicamos su posición y tamaño
//Indicamos que tenga la propiedad de escuchar
//los eventos que se originan sobre él
        jbtnGrabar = new JButton("Grabar");
        jbtnGrabar.setIcon(new ImageIcon(rutaDeImagenes + "grabar.gif"));
        jbtnGrabar.setBounds(120, 0, 119, 40);
        jbtnGrabar.addActionListener(this);
//Instanciamos un botón llamado &#39;jbtnMostrar&#39;
//Indicamos que muestre una imagen
//Indicamos su posición y tamaño
//Indicamos que tenga la propiedad de escuchar
//los eventos que se originan sobre él
        jbtnMostrar = new JButton("Mostrar");
        jbtnMostrar.setIcon(new ImageIcon(rutaDeImagenes + "mostrar.gif"));
        jbtnMostrar.setBounds(240, 0, 119, 40);
        jbtnMostrar.addActionListener(this);
//Instanciamos un botón llamado &#39;jbtnActivar&#39;
//Indicamos que muestre una imagen
//Indicamos su posición y tamaño
//Indicamos que tenga la propiedad de escuchar
//los eventos que se originan sobre él
//        jbtnActivar = new JButton("Activar");
//        jbtnActivar.setIcon(new ImageIcon(rutaDeImagenes + "check.gif"));
//        jbtnActivar.setBounds(360, 0, 119, 40);
//        jbtnActivar.addActionListener(this);
//Instanciamos un botón llamado &#39;jbtnInactivar&#39;
//Indicamos que muestre una imagen
//Indicamos su posición y tamaño
//Indicamos que tenga la propiedad de escuchar
//los eventos que se originan sobre él
//        jbtnInactivar = new JButton("Inactivar");
//        jbtnInactivar.setIcon(new ImageIcon(rutaDeImagenes + "uncheck.gif"));
//        jbtnInactivar.setBounds(480, 0, 119, 40);
//        jbtnInactivar.addActionListener(this);
//Instanciamos un botón llamado &#39;jbtnSalir&#39;
//Indicamos que muestre una imagen
//Indicamos su posición y tamaño
//Indicamos que tenga la propiedad de escuchar
//los eventos que se originan sobre él
        jbtnSalir = new JButton("Salir");
        jbtnSalir.setIcon(new ImageIcon(rutaDeImagenes + "salir.jpg"));
        jbtnSalir.setBounds(600, 0, 119, 40);
        jbtnSalir.addActionListener(this);
//Añadimos cada botón a la barra de herramientas
        jtoobBarra.add(jbtnNuevo);
        jtoobBarra.add(jbtnGrabar);
        jtoobBarra.add(jbtnMostrar);
//        jtoobBarra.add(jbtnActivar);
//        jtoobBarra.add(jbtnInactivar);
        jtoobBarra.add(jbtnSalir);
//Añadimos la barra de herramientas al JPanel &#39;jpanMantenimientoDocumento&#39;
        this.add(jtoobBarra);
        //********************************************************
//Creamos la GUI para el registro de datos de un Documento
//********************************************************
//Instanciamos objetos de tipo JLabel (etiqueta), JTextField (caja de texto),
//JTextArea (Area de texto) y JScrollPane
//Indicamos el texto a mostrar
//Indicamos la posición y tamaño de cada componente gráfico dentro del JPanel
        jlblCabecera = new JLabel("Mantenimiento de " + tipoUsuario);
        jlblCabecera.setBounds(250, 110, 200, 20);
        jlblCodigoUsuario = new JLabel("Código:");
        jlblCodigoUsuario.setBounds(250, 140, 100, 20);
        jlblNombre = new JLabel("Nombre:");
        jlblNombre.setBounds(250, 170, 100, 20);
        jlblEmail = new JLabel("Email:");
        jlblEmail.setBounds(250, 200, 100, 60);
        jlblGenero = new JLabel("Genero:");
        jlblGenero.setBounds(250, 270, 100, 20);
        jlblNacionalidad = new JLabel("Nacionalidad:");
        jlblNacionalidad.setBounds(250, 300, 100, 20);
        jtxfCodigoUsuario = new JTextField();
        jtxfCodigoUsuario.setBounds(350, 140, 100, 20);
        jtxfNombre = new JTextField();
        jtxfNombre.setBounds(350, 170, 100, 20);
        jtxfEmail = new JTextField();
        jtxfEmail.setBounds(350, 200, 200, 60);
        jtxfGenero = new JTextField();
        jtxfGenero.setBounds(350, 270, 100, 20);
        jtxfNacionalidad = new JTextField();
        jtxfNacionalidad.setBounds(350, 300, 100, 20);
        //Añadimos cada componente gráfico swing dentro del JPanel
        this.add(jlblCabecera);
        this.add(jlblCodigoUsuario);
        this.add(jlblNombre);
        this.add(jlblEmail);
        this.add(jlblGenero);
        this.add(jlblNacionalidad);
        this.add(jtxfCodigoUsuario);
        this.add(jtxfNombre);
        this.add(jtxfEmail);
        this.add(jtxfGenero);
        this.add(jtxfNacionalidad);
    }

    //Este método colocará una cadena vacía a cada componente gráfico
//con esto logramos limpiar los datos ingresados y asi poder
//ingresar nuevos datos
    public void limpiarFormulario() {
        jtxfCodigoUsuario.setText("");
        jtxfNombre.setText("");
        jtxfEmail.setText("");
        jtxfGenero.setText("");
        jtxfNacionalidad.setText("");
    }

    //Este método valida si el usuario ha ingresado algun dato en la caja de texto
//correspondiente al código, este método es importante, porque todas las
//opereaciones necesitan que se ingrese el dato en la caja CODIGO
    public boolean validarIngresoDelCampoCodigoDelFormulario() {
        if (jtxfCodigoUsuario.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el código.",
                    "Validando el Formulario",
                    JOptionPane.WARNING_MESSAGE);

            return false;
        }
        return true;
    }
    //Este método valida cada componente gráfico swing, verifica si algun componente
//esta vacio, si es asi, mostrará un mensaje indicando que se ingrese el dato
//si todo está lleno se devolverá el valor de &#39;true&#39;
//si algún componente no está lleno se devolverá el valor de &#39;false&#39;

    public boolean validarDatosDelFormulario() {
        boolean valor = true;
        String mensaje = "mensaje";
        if (jtxfCodigoUsuario.getText().trim().length() == 0) {
            mensaje = "Ingrese el código.";
            valor = false;
        } else if (jtxfNombre.getText().trim().length() == 0) {
            mensaje = "Ingrese el nombre.";
            valor = false;
        } else if (jtxfEmail.getText().trim().length() == 0) {
            mensaje = "Ingrese la email.";
            valor = false;
        } else if (jtxfGenero.getText().trim().length() == 0) {
            mensaje = "Ingrese el genero.";
            valor = false;
        } else if (jtxfNacionalidad.getText().trim().length() == 0) {
            mensaje = "Ingrese el nacionalidad.";
            valor = false;
        }
        if (!valor) {
            JOptionPane.showMessageDialog(null,
                    mensaje, "Validando el Formulario",
                    JOptionPane.WARNING_MESSAGE);

        }
        return valor;
    }
//Este método detecta los eventos de tipo ACTION generados en los componentes
//gráficos swing. Siempre y cuando dichos componentes tengan habilitado su
//propiedad &#39;addActionListener(this)&#39;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnNuevo) {
            limpiarFormulario();
        }
        if (e.getSource() == jbtnGrabar) {
            accionDelBotonGrabar();
        }
        if (e.getSource() == jbtnMostrar) {
            accionDelBotonMostrar();
        }
        if (e.getSource() == jbtnSalir) {
//Cambiamos de &#39;JPanel&#39;, ahora mostramos a &#39;jpanInicio&#39;
            ((CardLayout) jpanelFondo.getLayout()).show(jpanelFondo, "inicio");
        }
    }
    //****************************************************************
//Estos métodos se invocarán cuando se haga clic sobre los botones
//de la barra de herramientas
//OBSERVACION:
//Es código interno de cada método, será implementada por las clases HIJAS
//por que se está invocando a un MÉTODO ABSTRACTO, y como es bien
//conocido, las clases HIJAS son las encargadas de implementar a cada
//MÉTODO ABSTRACTO defino en la clase PADRE.

    public void accionDelBotonGrabar() {
        if (validarDatosDelFormulario()) {
            grabarDocumento(); //MÉTODO ABSTRACTO
            limpiarFormulario();
        }
    }

    public void accionDelBotonMostrar() {
        if (validarIngresoDelCampoCodigoDelFormulario()) {
            mostrarDocumento(); //MÉTODO ABSTRACTO
        }
    }

//****************************************************************
//Declaración de los MÉTODOS ABSTRACTOS
    public abstract void grabarDocumento();

    public abstract void mostrarDocumento();

}
