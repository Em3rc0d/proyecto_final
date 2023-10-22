/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class jpanMantenimientoAlumno extends jpanMantenimientoUsuario{
     
    public jpanMantenimientoAlumno(jpanFondo jpanelFondo,
            String tipoDocumento,
            ArregloUsuario arreglo){
//Pasamos por parámetro al constructor por parámetro de la clase padre
//&#39;jpanMantenimientoDocumento&#39;
        super(jpanelFondo, tipoDocumento, arreglo);
    }
    
    public int devolverIndiceDelUsuarioEnElArreglo(String codigoUsuario) {
        ArrayList arregloAuxiliar = arregloRelacionado.devuelveElArregloDeUsuarios();
        int indice = -1, i;
        for (i = 0; i < arregloAuxiliar.size(); i++) {
            Usuario usuario = (Usuario) arregloAuxiliar.get(i);
            if (usuario instanceof Alumno) {
                if (usuario.getCodigoUser().equals(codigoUsuario)) {
                    indice = i;
                    break;
                }
            }
        }
        return indice;
    }
    
    //Este método registra los datos de un nuevo usuario
//Por ello instancia un objeto de tipo usuario y le va asignando sus datos
//utiliza a sus métodos de tipo SET
//luego se devuelve la referencia a este objeto instanciado

    public Alumno registrarNuevoAlumno() {
        Alumno alumno = new Alumno();
        alumno.setCodigoUser(jtxfCodigoUsuario.getText().trim());
        alumno.setNombre(jtxfNombre.getText().trim());
        alumno.setEmail(jtxfEmail.getText().trim());
        alumno.setGenero(jtxfGenero.getText().trim());
        alumno.setNacionalidad(jtxfNacionalidad.getText().trim());
        return alumno;
    }
    
    //Este método carga el valor de los atributos de un objeto de tipo &#39;Libro&#39;
//los muestra en los componentes gráficos del JPanel

    public void cargarDatosDelAlumnoEnElFormulario(Alumno alumno) {
        jtxfCodigoUsuario.setText(alumno.getCodigoUser());
        jtxfNombre.setText(alumno.getNombre());
        jtxfEmail.setText(alumno.getEmail());
        jtxfGenero.setText(alumno.getGenero());
        jtxfNacionalidad.setText(alumno.getNacionalidad());
    }
//Este método Graba los datos ingresados de un nuevo libro
//Primero verifica que no exista otro libro con el mismo código
//Luego registra los datos del nuevo libro
//Finalmente lo añade al arreglo de documentos
//Si ya existe el codigo, mostrará un mensaje
public void grabarDocumento() {
        String codigoUsuario = jtxfCodigoUsuario.getText().trim();
        if (devolverIndiceDelUsuarioEnElArreglo(codigoUsuario) < 0) {
            arregloRelacionado.añadeUsuario(registrarNuevoAlumno());
            JOptionPane.showMessageDialog(null, "Operación realizada con éxito.", "Grabar Alumno", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "El código YA existe, ingrese un nuevo código. ", "Grabar Alumno", JOptionPane.WARNING_MESSAGE);

        }
    }
//Este método muestra los datos de un objeto de tipo libro
//Para lo cual, primero busca si se encuentra dicho libro,
//lo hace comparando con el código ingresado
//Si el código Si existe, se invoca al metodó &#39;cargarDatosDelLibroEnElFormulario&#39;
//Si el código No existe se mostrará un mensaje

    public void mostrarDocumento() {
        ArrayList arregloAuxiliar = arregloRelacionado.devuelveElArregloDeUsuarios();
        String codigoUsuario = jtxfCodigoUsuario.getText().trim();
        int indice = devolverIndiceDelUsuarioEnElArreglo(codigoUsuario);
        if (indice >= 0) {
            Usuario usuario = (Usuario) arregloAuxiliar.get(indice);
            cargarDatosDelAlumnoEnElFormulario((Alumno) usuario);
            JOptionPane.showMessageDialog(null, "Alumno encontrado.", "Mostrar Alumno", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No existe el código ingresado. ", "Mostrar Alumno", JOptionPane.WARNING_MESSAGE);
        }
    }
//Este método actualiza el atributo estado del libro a &#39;true&#39;
//Primero verifica que si existe el libro
//Luego modifica el atributo &#39;estado&#39; del libro
//Finalmente lo añade en su mismo indice dentro arreglo de documentos
//Si No existe el codigo ingresado, se mostrará un mensaje
//Si el valor del atributo estado es &#39;true&#39;, se mostrará un mensaje
}
