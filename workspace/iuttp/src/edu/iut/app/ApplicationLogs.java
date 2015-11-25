package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for (IApplicationLog appErr : this) {
			if (appErr instanceof ApplicationErrorLog) {
				filteredLogs.add(appErr);
			}
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for (IApplicationLog appWarn : this) {
			if (appWarn instanceof ApplicationWarningLog) {
				filteredLogs.add(appWarn);
			}
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for (IApplicationLog appInf : this) {
			if (appInf instanceof ApplicationInfoLog) {
				filteredLogs.add(appInf);
			}
		}
		return filteredLogs;
	}
	

}
