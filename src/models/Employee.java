public abstract class Employee {

	// Siguiente elemento en la cadena de responsabilidad
	protected Employee supervisor;

	public void setNextSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public abstract void applyLeave(String employeeName, int numberofDaysLeave);
}
