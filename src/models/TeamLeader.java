public class TeamLeader extends Employee {
	// TeamLeader solo puede aprobar hasta 10 días de licencia
	private int MAX_LEAVES_CAN_APPROVE = 10;

	public void applyLeave(String employeeName, int numberofDaysLeave) {
		// comprobar si TeamLeader puede procesar esta solicitud
		if (numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE) {
			ApproveLeave(employeeName, numberofDaysLeave);
		}
		// Si TeamLeader no puede procesar la solicitud de licencia, entonces pásela al
		// supervisor (líder del proyecto) para que pueda procesarla.
		else {
			supervisor.applyLeave(employeeName, numberofDaysLeave);
		}
	}

	private void ApproveLeave(String employeeName, int numberofDaysLeave) {
		System.out.println("TeamLeader approved " + numberofDaysLeave + " days " + "Leave for the employee : "
				+ employeeName);

	}
}
