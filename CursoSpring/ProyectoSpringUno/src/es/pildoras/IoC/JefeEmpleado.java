package es.pildoras.IoC;

public class JefeEmpleado implements Empleados{
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	
	//Sobre escribiendo
	public String getTareas() {
		
		return "Gestiono las cuestones relativas a mis empleados"
				+"de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: "+informeNuevo.getInforme();
	} 
	
}
