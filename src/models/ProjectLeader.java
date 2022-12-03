public class ProjectLeader extends Employee {
	// El líder del proyecto solo puede aprobar hasta 20 días de licencia
	private int MAX_LEAVES_CAN_APPROVE = 20;

	public void applyLeave(String employeeName, int numberofDaysLeave) {
		// Comprobar si el líder del proyecto puede procesar esta solicitud
		if (numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE) {
			ApproveLeave(employeeName, numberofDaysLeave);
		}
		// Si ProjectLeader no puede procesar la LeaveRequest, entonces pásela al
		// supervisor (HR) para que pueda procesar
		else {
			supervisor.applyLeave(employeeName, numberofDaysLeave);
		}
	}

	private void ApproveLeave(String employeeName, int numberofDaysLeave) {
		System.out.println("ProjectLeader approved " + numberofDaysLeave + " days " + "Leave for the employee : "
				+ employeeName);

	}
}
