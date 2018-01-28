package com.example.app.bean;

import javax.persistence.Column;
import javax.persistence.Id;

public class ResourceAssignment {

	
	@Id
	@Column(name="APPLICATION_NAME")
	private String applicationName;	
	
	@Column(name="PROGRAM")
	private String program;
	
	@Column(name="MODULE_NAME")
	private String moduleName;	 
	
	@Column(name="PROGRAM_NAME")
	private String programName;
	

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public ResourceAssignment(String applicationName, String program, String moduleName, String programName) {
		///super();
		this.applicationName = applicationName;
		this.program = program;
		this.moduleName = moduleName;
		this.programName = programName;
	}

	@Override
	public String toString() {
		return "ResourceAssignment [applicationName=" + applicationName + ", program=" + program + ", moduleName="
				+ moduleName + ", programName=" + programName + "]";
	}

	
	
	
	
}
