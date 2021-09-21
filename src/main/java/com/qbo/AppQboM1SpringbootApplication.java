package com.qbo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qbo.interfaces.DeDos;
import com.qbo.model.Alumno;
import com.qbo.model.Triangulo;

@SpringBootApplication
public class AppQboM1SpringbootApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(AppQboM1SpringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppQboM1SpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Definición de variables.
		final String curso = "Spring Boot";
		String nombre = "luis";
		Integer edad;
		edad = 30;
		Double precio;
		Boolean activo = true;
		precio = 340.4;		
		//Conversiones:
		Double precioProducto = 13.4;
		Integer cantidadCompra = 11;
		Double totalCompra = precioProducto * Double.parseDouble(cantidadCompra.toString());
		//Clases:
		Alumno objAlumno = new Alumno();
		objAlumno.setId(1);
		objAlumno.setNombre("Luis Angel");
		objAlumno.setApellido("Salvatierra");
		Alumno objAlumno2 = new Alumno();
		objAlumno2.setId(2);
		objAlumno2.setNombre("Miguel Angel");
		objAlumno2.setApellido("Torres");
		List<Alumno> listAlumnos = new ArrayList<Alumno>();
		listAlumnos.add(objAlumno);
		listAlumnos.add(objAlumno2);
		imprimirListadoAlumnos(listAlumnos);
		//Herencia
		Triangulo t1=new Triangulo();
        Triangulo t2=new Triangulo();
        t1.setBase(4.0);
        t1.setAltura(4.0);
        t1.setEstilo("Estilo 1");
        t2.setBase(8.0);
        t2.setAltura(12.0);
        t2.setEstilo("Estilo 2");
        LOG.info("Información para T1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        LOG.info("Su área es: "+t1.area());
        LOG.info("Información para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        LOG.info("Su área es: "+t2.area());		
		//Interfaces
        imprimirSerie();
		//LOG.info("Hola "+ objAlumno.nombreApellido());
		//imprimirMensaje("hola método");
		//buclesRepetitivos(4);
	}
	
	//funciones que recibe parámetros
	private void imprimirMensaje(String mensaje) {
		LOG.info(mensaje);
	}
	
	//Función que recibe parametros y devuelve un String
	private String longitudPalabra(String palabra1, String palabra2) {
		//Condicionales:
		String palabraLarga = "";
		if(palabra1.length() > palabra2.length()) {
			palabraLarga = palabra1;
		}else if(palabra2.length() > palabra1.length()) {
			palabraLarga = palabra2;
		}else {
			palabraLarga = "Palabras iguales";
		}
		return palabraLarga;
	}
	
	private String parImpar(Integer numero) {
		if(numero % 2 == 0) {
			return "El "+ numero +" es par";	
		} else {
			return "El "+ numero +" es impar";
		}		
	}
	
	private String validarLongitud(String apellido) {
		String respuesta = "";
		switch(apellido.length()) {
		case 0: respuesta = "Nombre vacío"; break;
		case 1:
		case 2:
		case 3:
		case 4: respuesta = "Nombre pequeño"; break;
		case 5:
		case 6:
		case 7:
		case 8: respuesta = "Nombre mediano"; break;
		default: respuesta = "Nombre extenso"; break;
		}
		return respuesta;
	}
	
	private String diaDeSemana(Integer numeroDia) {
		String respuesta = "";
		switch(numeroDia) {
		case 1: respuesta = "Lunes"; break;
		case 2: respuesta = "Martes"; break;
		case 3: respuesta = "Miercoles"; break;
		case 4: respuesta = "Jueves"; break;
		case 5: respuesta = "Viernes"; break;
		case 6: respuesta = "Sabado"; break;
		case 7: respuesta = "Domingo"; break;
		default: respuesta = "Día invalido"; break;
		}
		return respuesta;
	}
	
	private void  buclesRepetitivos(Integer numero) {
		int x = 1;		 
        // Salir cuando x llega a ser mayor que 4
        while (x <= numero)
        {
            imprimirMensaje("Valor de x: " + x);
 
            //incrementa el valor de x para la siguiente iteración
            x++;
        }
        for (int y = 2; y <= numero; y++)
        	imprimirMensaje("Valor de Y: " + y);
        int z = 21;
        do
        {
            //El código dentro del do se imprime incluso
            //si la condición es falsa
        	imprimirMensaje("Valor de Z :" + z);
            z++;
        }
        while (z < numero);
	}
	
	private void arreglosForEach() {
		int[] marks = { 125, 132, 95, 116, 110 };        
        //int highest_marks = maximum(marks);
        int max = marks[0];        
        // bucle for each
        for (int num : marks) 
        {
            if (num > max)
            {
            	max = num;
            }
        }
        imprimirMensaje("El puntaje más alto es " + max);
	}
	
	private void imprimirListadoAlumnos(List<Alumno> lstAlumnos) {
		for(Alumno obj : lstAlumnos) {
			LOG.info(obj.nombreApellido());
		}
	}
	
	private void imprimirSerie() {
		DeDos ob=new DeDos();

        for (int i=0;i<5;i++)
            System.out.println("Siguiente valor es: "+ob.getSiguiente());

        System.out.println("\nReiniciando");
        ob.reiniciar();
        for (int i=0;i<5;i++)
            System.out.println("Siguiente valor es: "+ob.getSiguiente());
        System.out.println("\nIniciando en 100");
        ob.setComenzar(100);
        for (int i=0;i<5;i++)
            System.out.println("Siguiente valor es: "+ob.getSiguiente());
	}
}
	
