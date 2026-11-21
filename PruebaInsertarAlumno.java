// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class PruebaInsertarAlumno {
   public PruebaInsertarAlumno() {
   }

   public static void main(String[] var0) {
      Alumno var1 = new Alumno();
      ProcesosBD var2 = new ProcesosBD();
      Scanner var3 = new Scanner(System.in);
      System.out.println("Ingrese los datos del alumno a registrar en la base de datos");
      System.out.println("NÃºmero de cuenta: ");
      var1.setCuenta(var3.nextInt());
      var3.nextLine();
      System.out.println("Apellido paterno: ");
      var1.setPaterno(var3.nextLine());
      System.out.println("Apellido materno: ");
      var1.setMaterno(var3.nextLine());
      System.out.println("Nombre(s): ");
      var1.setNombre(var3.nextLine());
      System.out.println("Direccion: ");
      var1.setDireccion(var3.nextLine());
      System.out.println("Numero telefÃ³nico: ");
      var1.setTelefono(var3.nextLine());
      System.out.println("Licenciatura: ");
      var1.setLicenciatura(var3.nextLine());
      System.out.println("Semestre: ");
      var1.setSemestre(var3.nextInt());

      try {
         var2.setAlumno(var1);
         var2.insertarRegistro();
         System.out.println("Datos guardados con exito");
      } catch (Exception var8) {
         System.out.println("No se pudo guardar los datos");
         var8.printStackTrace();
      } finally {
         var3.close();
      }

   }
}
