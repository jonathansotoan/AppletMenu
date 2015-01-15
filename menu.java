/**
 * @(#)menu.java
 *
 *
 * @author
 * @version 1.00 2012/8/26
 */

import java.awt.*;

public class menu extends Frame{
	Menu menuArchivo,menuAyuda,menuGuardar;
	MenuBar barra;

    public menu() {
    	//título
    	setTitle("Applet AppletMenu");

    	//instanciaciones
    	barra = new MenuBar();
    	menuArchivo = new Menu("Archivo");
    	menuAyuda = new Menu("Ayuda");
    	menuGuardar = new Menu("Guardar");

    	//menú guardar
    	menuGuardar.add(new MenuItem("Guardar"));
    	menuGuardar.add(new MenuItem("Guardar como"));

    	//menú archivo
    	menuArchivo.add(new MenuItem("Nuevo"));
    	menuArchivo.add(menuGuardar);
    	menuArchivo.addSeparator();
    	menuArchivo.add(new MenuItem("Salir"));

    	//menú ayuda
    	menuAyuda.add(new MenuItem("AcercaDe"));
    	menuAyuda.add(new MenuItem("Ayuda"));

    	//agregando los menús a la barra
    	barra.add(menuArchivo);
    	barra.add(menuAyuda);

    	//agregando la barra al frame
    	setMenuBar(barra);
    }

    public boolean handleEvent(Event evt){
    	if(Event.WINDOW_DESTROY == evt.id && this == evt.target)
    		System.exit(0);

    	switch(evt.id){
    		case Event.ACTION_EVENT:{
    			if(evt.target instanceof MenuItem){
    				if(evt.arg.equals("Guardar"))
    					System.out.println("Se ha elegido la opción Guardar");
    				if(evt.arg.equals("Guardar como"))
    					System.out.println("Se ha elegido la opción Guardar como");
    				if(evt.arg.equals("Nuevo"))
    					System.out.println("Se ha elegido la opción Nuevo");
    				if(evt.arg.equals("AcercaDe"))
    					System.out.println("Se ha elegido la opción AcercaDe");
    				if(evt.arg.equals("Ayuda"))
    					System.out.println("Se ha elegido la opción Ayuda");
    				if(evt.arg.equals("Salir"))
    					System.exit(0);
    			}
    		}
    	}

    	return true;
    }
}