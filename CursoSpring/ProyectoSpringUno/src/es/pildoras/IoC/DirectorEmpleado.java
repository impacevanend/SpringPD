package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	
	//Creaci�n de campo tipo Creaci�nInforme (interfaz)
	
		private CreacionInformes informeNuevo;
		
		//Creaci�n de constructor que inyecta la dependencia
		public DirectorEmpleado(CreacionInformes informeNuevo) {
			
			this.informeNuevo = informeNuevo;
		}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: "+informeNuevo.getInforme();
	}

}