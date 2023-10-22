package Poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Declaración de la clase &#39;jpanValidarUsuario&#39;
//que hereda de un &#39;jpanFondo&#39;
//e implementa a la interface &#39;ActionListener&#39;

public class jpanValidarUsuario extends jpanFondo implements ActionListener {
//Declaración de Atributos
//Declaración de componentes gráficos swing para crear la GUI

    private JLabel jlblImagen;
    private JLabel jlblUsuario;
    private JLabel jlblClave;
    private JTextField jtxfUsuario;
    private JPasswordField jpwfClave;
    private JButton jbtnAceptar;
//Declaración de los objetos que referencian a &#39;jpanelFondo&#39;
//y &#39;jpanBarraDeMenu&#39;, instanciados en la clase &#39;jfrmPrincipal&#39;
    private jpanBarraDeMenu jpanelBarra;
    private jpanFondo jpanelFondo;
//Este es el método constructor por parámetro
//le llega por parámetro la referencia de un objeto de tipo &#39;jpanBarraDeMenu&#39;,
//y &#39;jpanFondo&#39;, luego invoca o llama al método &#39;iniciarComponentes()&#39;

    public jpanValidarUsuario(jpanBarraDeMenu jpanelBarra,
            jpanFondo jpanelFondo) {

        this.jpanelBarra = jpanelBarra;
        this.jpanelFondo = jpanelFondo;
        iniciarComponentes();
    }
//Este método instancia los objetos o componentes gráficos
//que se van a mostrar dentro del JPanel (lienzo)

    public void iniciarComponentes() {
//Indicamos que el Administrador de Diseño sea nulo
        this.setLayout(null);
//***************************************************
//Creamos la GUI para validar los datos de un Usuario
//***************************************************
//Instanciamos objetos de tipo JLabel (etiqueta), JTextField (caja de texto),
//JButton (Botón)
//Indicamos el texto a mostrar
//Indicamos la posición y tamaño de cada componente gráfico dentro del JPanel
        jlblImagen = new JLabel();
        jlblImagen.setIcon(new ImageIcon(rutaDeImagenes + "key.jpg "
        ));
jlblImagen.setBounds(180, 80, 200, 200);
        jlblUsuario = new JLabel( "Usuario:");
jlblUsuario.setBounds(420, 150, 50, 20);
        jlblClave = new JLabel( "Clave:");
jlblClave.setBounds(420, 180, 50, 20);
        jtxfUsuario = new JTextField();
        jtxfUsuario.setBounds(480, 150, 100, 20);
        jpwfClave = new JPasswordField();
        jpwfClave.setBounds(480, 180, 100, 20);
        jbtnAceptar = new JButton( "Entrar "
        );
jbtnAceptar.setBounds(480, 210, 100, 20);
        jbtnAceptar.addActionListener(this);
//Añadimos cada componente gráfico swing dentro del JPanel
        this.add(jlblImagen);
        this.add(jlblUsuario);
        this.add(jtxfUsuario);
        this.add(jlblClave);
        this.add(jpwfClave);
        this.add(jbtnAceptar);
    }
//Este método detecta los eventos de tipo ACTION generados en los componentes
//gráficos swing. Siempre y cuando dichos componentes tengan habilitado su
//propiedad &#39;addActionListener(this)&#39;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnAceptar) {
//Validamos el ingreso del &#39;USUARIO&#39; y &#39;CLAVE&#39;
            if (jtxfUsuario.getText().trim().equals( "Pepito")&&jpwfClave.getText().trim().equals( "fisi2018") ){
//Habilitamos las opciones de la barra de menús
jpanelBarra.cambiarEstadoDeLaBarraDeMenu(true);
//Mostramos el JPanel &#39;jpanInicio&#39;
                ((CardLayout) jpanelFondo.getLayout()).show(jpanelFondo,  "inicio "
            );
}else{
                        JOptionPane.showMessageDialog(null,  "Datos incorrectos","Validar usuario",

JOptionPane.WARNING_MESSAGE);

}
        }
    }
}
