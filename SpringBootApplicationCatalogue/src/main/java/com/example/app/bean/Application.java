package com.example.app.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APPLICATION_BASE_CATALOGUE")
public class Application {
	
	
	@Id
	@Column(name="APPLICATION_NAME")
	private String applicationName;	
	
	@Column(name="PROGRAM")
	private String program;
	
	@Column(name="MODULE_NAME")
	private String moduleName;	 
	
	@Column(name="PROGRAM_NAME")
	private String programName;
	
	@Column(name="CRITICALITY_RATING")
	private String criticalityRating;
	
	@Column(name="DPE")
	private String dpe;
	
	@Column(name="MANAGER")
	private String manager;
	
	@Column(name="POWER_BUILDER")
	private int powerBuilder; 
	
	@Column(name="LOTUS_NOTES_SCRIPTING")
	private int lotusNotesScripting;
	
	@Column(name="COBOL_CICS")
	private int cobal_CICS;
	
	@Column(name="IMS_JCL")
	private int ims_JCL;
	
	@Column(name="CPAS")
	private int cpas;
	
	@Column(name="FILENET_REPORT_MANAGER")
	private int filenetReportManager;  
	
	@Column(name="WDP_UI")
	private int wdp_UI;    
	
	@Column(name="WDP_MICROSERVICES")
	private int wdp_MICROSERVICES; 
	
	@Column(name="WDP_BPEL")
	private int wdp_BPEL;  
	
	@Column(name="WDP_BPM")
	private int wdp_BPM;   
	
	@Column(name="BASE24_TANDEM")
	private int base24Tandem; 
	
	@Column(name="FILENET_IMAGE_SERVER")
	private int filenetImageServer;  
	
	@Column(name="MICROSOFT_SQL_SERVER")
	private int microsoftSQLServer; 
	
	@Column(name="JAVA")
	private int java;   
	
	@Column(name="CODING_")
	private int coding;  
	
	@Column(name="ANALYTICAL_")
	private int analytcal;  
	
	@Column(name="BOOTSTRAP")
	private int bootstrap;   
	
	@Column(name="C#_NET")
	private int csharpDOTNET;  
	
	@Column(name="PL_SQL")
	private int plsql; 
	
	@Column(name="UNIX")
	private int unix;   
	
	@Column(name="VB_DOTNET")
	private int vbDOTNET;
	
	@Column(name="WEBSERVICE")
	private int webservice;
	
	@Column(name="JAVASCRIPT")
	private int javascript;
	
	@Column(name="HIBERNATE")
	private int hibernate;
	
	@Column(name="SPRING")
	private int spring; 
	
	@Column(name="EJB")
	private int ejb;     
	
	@Column(name="FILENET")
	private int fileNet;
	
	@Column(name="J2EE")
	private int j2ee;   
	
	@Column(name="ANGULAR_JS")
	private int angularJS;
	
	@Column(name="WEBSPHERE_APPLICATION_SERVERL")
	private int websphereApplicationSever;
	
	@Column(name="WEBSPHERE_MQ")
	private int websphereMQ;
	
	@Column(name="XML")
	private int xml;    
	
	@Column(name="SPLUNK")
	private int splunk;
	
	@Column(name="TALLYMAN_CONFIGURATION")
	private int tallymanConfiguration;
	
	@Column(name="DEVOPS")
	private int devops; 
	
	@Column(name="DB2_SQL")
	private int db2_sql;
	
	@Column(name="CONTROL_M")
	private int controlM;
	
	@Column(name="HTML")
	private int html;   
	
	@Column(name="JENKINS")
	private int jenkins;
	
	@Column(name="FINANCIAL_SERVICES_OVERVIEW")
	private int financialServiceoverview;  

	@Column(name="CARDS")
	private int cards;         
    
    @Column(name="TICKET_RESOLUTION")	
	private int ticketResolution;  

    @Column(name="JOB_MONITORING")		
	private int jobMonitoring; 

    @Column(name="LOW_LEVEL_DESIGN")		
	private int lowLevelDesign;        

    @Column(name="MINOR_BAU_WORK")		
	private int minorBAUWork;          

    @Column(name="DEPLOYMENT")		
	private int deployment;              

    @Column(name="TESTING")		
	private int testing;              

    @Column(name="ARCHITECTURE")		
	private int architecture;            

    @Column(name="FEATURES_FUNCTIONALITIES")		
	private int featuresFunctionalites;

    @Column(name="CODE_COMPLEXITY")		
	private int codeComplexity ;        

    @Column(name="INTERFACING")		
	private int interfacing;             

    @Column(name="DEPLOYMENT2")		
	private int deployment2;             

    @Column(name="REQUIREMENT_ANALYSIS")		
	private int requirementAnalysis;    

    @Column(name="ASSESSEDBY")		
	private String assessedby;              

    @Column(name="REVIEWEDBY")		
	private String reviewedby;              

    @Column(name="NO_OF_RISKS_")		
	private int noOfRisks;            

    @Column(name="RISK_AREA")		
	private String riskArea;               

/*    @Column(name="TOTAL_")		
	private int TOTAL_                  

    @Column(name="NO_SKILL_AREAS")		
	private int NO_SKILL_AREAS          

    @Column(name="SKILL_AREA")		
	private int SKILL_AREA */

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
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

	public String getCriticalityRating() {
		return criticalityRating;
	}

	public void setCriticalityRating(String criticalityRating) {
		this.criticalityRating = criticalityRating;
	}

	public String getDpe() {
		return dpe;
	}

	public void setDpe(String dpe) {
		this.dpe = dpe;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public int getPowerBuilder() {
		return powerBuilder;
	}

	public void setPowerBuilder(int powerBuilder) {
		this.powerBuilder = powerBuilder;
	}

	public int getLotusNotesScripting() {
		return lotusNotesScripting;
	}

	public void setLotusNotesScripting(int lotusNotesScripting) {
		this.lotusNotesScripting = lotusNotesScripting;
	}

	public int getCobal_CICS() {
		return cobal_CICS;
	}

	public void setCobal_CICS(int cobal_CICS) {
		this.cobal_CICS = cobal_CICS;
	}

	public int getIms_JCL() {
		return ims_JCL;
	}

	public void setIms_JCL(int ims_JCL) {
		this.ims_JCL = ims_JCL;
	}

	public int getCpas() {
		return cpas;
	}

	public void setCpas(int cpas) {
		this.cpas = cpas;
	}

	public int getFilenetReportManager() {
		return filenetReportManager;
	}

	public void setFilenetReportManager(int filenetReportManager) {
		this.filenetReportManager = filenetReportManager;
	}

	public int getWdp_UI() {
		return wdp_UI;
	}

	public void setWdp_UI(int wdp_UI) {
		this.wdp_UI = wdp_UI;
	}

	public int getWdp_MICROSERVICES() {
		return wdp_MICROSERVICES;
	}

	public void setWdp_MICROSERVICES(int wdp_MICROSERVICES) {
		this.wdp_MICROSERVICES = wdp_MICROSERVICES;
	}

	public int getWdp_BPEL() {
		return wdp_BPEL;
	}

	public void setWdp_BPEL(int wdp_BPEL) {
		this.wdp_BPEL = wdp_BPEL;
	}

	public int getWdp_BPM() {
		return wdp_BPM;
	}

	public void setWdp_BPM(int wdp_BPM) {
		this.wdp_BPM = wdp_BPM;
	}

	public int getBase24Tandem() {
		return base24Tandem;
	}

	public void setBase24Tandem(int base24Tandem) {
		this.base24Tandem = base24Tandem;
	}

	public int getFilenetImageServer() {
		return filenetImageServer;
	}

	public void setFilenetImageServer(int filenetImageServer) {
		this.filenetImageServer = filenetImageServer;
	}

	public int getMicrosoftSQLServer() {
		return microsoftSQLServer;
	}

	public void setMicrosoftSQLServer(int microsoftSQLServer) {
		this.microsoftSQLServer = microsoftSQLServer;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getCoding() {
		return coding;
	}

	public void setCoding(int coding) {
		this.coding = coding;
	}

	public int getAnalytcal() {
		return analytcal;
	}

	public void setAnalytcal(int analytcal) {
		this.analytcal = analytcal;
	}

	public int getBootstrap() {
		return bootstrap;
	}

	public void setBootstrap(int bootstrap) {
		this.bootstrap = bootstrap;
	}

	public int getCsharpDOTNET() {
		return csharpDOTNET;
	}

	public void setCsharpDOTNET(int csharpDOTNET) {
		this.csharpDOTNET = csharpDOTNET;
	}

	public int getPlsql() {
		return plsql;
	}

	public void setPlsql(int plsql) {
		this.plsql = plsql;
	}

	public int getUnix() {
		return unix;
	}

	public void setUnix(int unix) {
		this.unix = unix;
	}

	public int getVbDOTNET() {
		return vbDOTNET;
	}

	public void setVbDOTNET(int vbDOTNET) {
		this.vbDOTNET = vbDOTNET;
	}

	public int getWebservice() {
		return webservice;
	}

	public void setWebservice(int webservice) {
		this.webservice = webservice;
	}

	public int getJavascript() {
		return javascript;
	}

	public void setJavascript(int javascript) {
		this.javascript = javascript;
	}

	public int getHibernate() {
		return hibernate;
	}

	public void setHibernate(int hibernate) {
		this.hibernate = hibernate;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getEjb() {
		return ejb;
	}

	public void setEjb(int ejb) {
		this.ejb = ejb;
	}

	public int getFileNet() {
		return fileNet;
	}

	public void setFileNet(int fileNet) {
		this.fileNet = fileNet;
	}

	public int getJ2ee() {
		return j2ee;
	}

	public void setJ2ee(int j2ee) {
		this.j2ee = j2ee;
	}

	public int getAngularJS() {
		return angularJS;
	}

	public void setAngularJS(int angularJS) {
		this.angularJS = angularJS;
	}

	public int getWebsphereApplicationSever() {
		return websphereApplicationSever;
	}

	public void setWebsphereApplicationSever(int websphereApplicationSever) {
		this.websphereApplicationSever = websphereApplicationSever;
	}

	public int getWebsphereMQ() {
		return websphereMQ;
	}

	public void setWebsphereMQ(int websphereMQ) {
		this.websphereMQ = websphereMQ;
	}

	public int getXml() {
		return xml;
	}

	public void setXml(int xml) {
		this.xml = xml;
	}

	public int getSplunk() {
		return splunk;
	}

	public void setSplunk(int splunk) {
		this.splunk = splunk;
	}

	public int getTallymanConfiguration() {
		return tallymanConfiguration;
	}

	public void setTallymanConfiguration(int tallymanConfiguration) {
		this.tallymanConfiguration = tallymanConfiguration;
	}

	public int getDevops() {
		return devops;
	}

	public void setDevops(int devops) {
		this.devops = devops;
	}

	public int getDb2_sql() {
		return db2_sql;
	}

	public void setDb2_sql(int db2_sql) {
		this.db2_sql = db2_sql;
	}

	public int getControlM() {
		return controlM;
	}

	public void setControlM(int controlM) {
		this.controlM = controlM;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int getJenkins() {
		return jenkins;
	}

	public void setJenkins(int jenkins) {
		this.jenkins = jenkins;
	}

	public int getFinancialServiceoverview() {
		return financialServiceoverview;
	}

	public void setFinancialServiceoverview(int financialServiceoverview) {
		this.financialServiceoverview = financialServiceoverview;
	}

	public int getCards() {
		return cards;
	}

	public void setCards(int cards) {
		this.cards = cards;
	}

	public int getTicketResolution() {
		return ticketResolution;
	}

	public void setTicketResolution(int ticketResolution) {
		this.ticketResolution = ticketResolution;
	}

	public int getJobMonitoring() {
		return jobMonitoring;
	}

	public void setJobMonitoring(int jobMonitoring) {
		this.jobMonitoring = jobMonitoring;
	}

	public int getLowLevelDesign() {
		return lowLevelDesign;
	}

	public void setLowLevelDesign(int lowLevelDesign) {
		this.lowLevelDesign = lowLevelDesign;
	}

	public int getMinorBAUWork() {
		return minorBAUWork;
	}

	public void setMinorBAUWork(int minorBAUWork) {
		this.minorBAUWork = minorBAUWork;
	}

	public int getDeployment() {
		return deployment;
	}

	public void setDeployment(int deployment) {
		this.deployment = deployment;
	}

	public int getTesting() {
		return testing;
	}

	public void setTesting(int testing) {
		this.testing = testing;
	}

	public int getArchitecture() {
		return architecture;
	}

	public void setArchitecture(int architecture) {
		this.architecture = architecture;
	}

	public int getFeaturesFunctionalites() {
		return featuresFunctionalites;
	}

	public void setFeaturesFunctionalites(int featuresFunctionalites) {
		this.featuresFunctionalites = featuresFunctionalites;
	}

	public int getCodeComplexity() {
		return codeComplexity;
	}

	public void setCodeComplexity(int codeComplexity) {
		this.codeComplexity = codeComplexity;
	}

	public int getInterfacing() {
		return interfacing;
	}

	public void setInterfacing(int interfacing) {
		this.interfacing = interfacing;
	}

	public int getDeployment2() {
		return deployment2;
	}

	public void setDeployment2(int deployment2) {
		this.deployment2 = deployment2;
	}

	public int getRequirementAnalysis() {
		return requirementAnalysis;
	}

	public void setRequirementAnalysis(int requirementAnalysis) {
		this.requirementAnalysis = requirementAnalysis;
	}

	public String getAssessedby() {
		return assessedby;
	}

	public void setAssessedby(String assessedby) {
		this.assessedby = assessedby;
	}

	public String getReviewedby() {
		return reviewedby;
	}

	public void setReviewedby(String reviewedby) {
		this.reviewedby = reviewedby;
	}

	public int getNoOfRisks() {
		return noOfRisks;
	}

	public void setNoOfRisks(int noOfRisks) {
		this.noOfRisks = noOfRisks;
	}

	public String getRiskArea() {
		return riskArea;
	}

	public void setRiskArea(String riskArea) {
		this.riskArea = riskArea;
	}

	public Application() {
		//super();
	}

	public Application(String program, String applicationName, String moduleName, String programName,
			String criticalityRating, String dpe, String manager, int powerBuilder, int lotusNotesScripting,
			int cobal_CICS, int ims_JCL, int cpas, int filenetReportManager, int wdp_UI, int wdp_MICROSERVICES,
			int wdp_BPEL, int wdp_BPM, int base24Tandem, int filenetImageServer, int microsoftSQLServer, int java,
			int coding, int analytcal, int bootstrap, int csharpDOTNET, int plsql, int unix, int vbDOTNET,
			int webservice, int javascript, int hibernate, int spring, int ejb, int fileNet, int j2ee, int angularJS,
			int websphereApplicationSever, int websphereMQ, int xml, int splunk, int tallymanConfiguration, int devops,
			int db2_sql, int controlM, int html, int jenkins, int financialServiceoverview, int cards,
			int ticketResolution, int jobMonitoring, int lowLevelDesign, int minorBAUWork, int deployment, int testing,
			int architecture, int featuresFunctionalites, int codeComplexity, int interfacing, int deployment2,
			int requirementAnalysis, String assessedby, String reviewedby, int noOfRisks, String riskArea) {
		//super();
		this.program = program;
		this.applicationName = applicationName;
		this.moduleName = moduleName;
		this.programName = programName;
		this.criticalityRating = criticalityRating;
		this.dpe = dpe;
		this.manager = manager;
		this.powerBuilder = powerBuilder;
		this.lotusNotesScripting = lotusNotesScripting;
		this.cobal_CICS = cobal_CICS;
		this.ims_JCL = ims_JCL;
		this.cpas = cpas;
		this.filenetReportManager = filenetReportManager;
		this.wdp_UI = wdp_UI;
		this.wdp_MICROSERVICES = wdp_MICROSERVICES;
		this.wdp_BPEL = wdp_BPEL;
		this.wdp_BPM = wdp_BPM;
		this.base24Tandem = base24Tandem;
		this.filenetImageServer = filenetImageServer;
		this.microsoftSQLServer = microsoftSQLServer;
		this.java = java;
		this.coding = coding;
		this.analytcal = analytcal;
		this.bootstrap = bootstrap;
		this.csharpDOTNET = csharpDOTNET;
		this.plsql = plsql;
		this.unix = unix;
		this.vbDOTNET = vbDOTNET;
		this.webservice = webservice;
		this.javascript = javascript;
		this.hibernate = hibernate;
		this.spring = spring;
		this.ejb = ejb;
		this.fileNet = fileNet;
		this.j2ee = j2ee;
		this.angularJS = angularJS;
		this.websphereApplicationSever = websphereApplicationSever;
		this.websphereMQ = websphereMQ;
		this.xml = xml;
		this.splunk = splunk;
		this.tallymanConfiguration = tallymanConfiguration;
		this.devops = devops;
		this.db2_sql = db2_sql;
		this.controlM = controlM;
		this.html = html;
		this.jenkins = jenkins;
		this.financialServiceoverview = financialServiceoverview;
		this.cards = cards;
		this.ticketResolution = ticketResolution;
		this.jobMonitoring = jobMonitoring;
		this.lowLevelDesign = lowLevelDesign;
		this.minorBAUWork = minorBAUWork;
		this.deployment = deployment;
		this.testing = testing;
		this.architecture = architecture;
		this.featuresFunctionalites = featuresFunctionalites;
		this.codeComplexity = codeComplexity;
		this.interfacing = interfacing;
		this.deployment2 = deployment2;
		this.requirementAnalysis = requirementAnalysis;
		this.assessedby = assessedby;
		this.reviewedby = reviewedby;
		this.noOfRisks = noOfRisks;
		this.riskArea = riskArea;
	}

	@Override
	public String toString() {
		return "Application [program=" + program + ", applicationName=" + applicationName + ", moduleName=" + moduleName
				+ ", programName=" + programName + ", criticalityRating=" + criticalityRating + ", dpe=" + dpe
				+ ", manager=" + manager + ", powerBuilder=" + powerBuilder + ", lotusNotesScripting="
				+ lotusNotesScripting + ", cobal_CICS=" + cobal_CICS + ", ims_JCL=" + ims_JCL + ", cpas=" + cpas
				+ ", filenetReportManager=" + filenetReportManager + ", wdp_UI=" + wdp_UI + ", wdp_MICROSERVICES="
				+ wdp_MICROSERVICES + ", wdp_BPEL=" + wdp_BPEL + ", wdp_BPM=" + wdp_BPM + ", base24Tandem="
				+ base24Tandem + ", filenetImageServer=" + filenetImageServer + ", microsoftSQLServer="
				+ microsoftSQLServer + ", java=" + java + ", coding=" + coding + ", analytcal=" + analytcal
				+ ", bootstrap=" + bootstrap + ", csharpDOTNET=" + csharpDOTNET + ", plsql=" + plsql + ", unix=" + unix
				+ ", vbDOTNET=" + vbDOTNET + ", webservice=" + webservice + ", javascript=" + javascript
				+ ", hibernate=" + hibernate + ", spring=" + spring + ", ejb=" + ejb + ", fileNet=" + fileNet
				+ ", j2ee=" + j2ee + ", angularJS=" + angularJS + ", websphereApplicationSever="
				+ websphereApplicationSever + ", websphereMQ=" + websphereMQ + ", xml=" + xml + ", splunk=" + splunk
				+ ", tallymanConfiguration=" + tallymanConfiguration + ", devops=" + devops + ", db2_sql=" + db2_sql
				+ ", controlM=" + controlM + ", html=" + html + ", jenkins=" + jenkins + ", FinancialServiceoverview="
				+ financialServiceoverview + ", cards=" + cards + ", ticketResolution=" + ticketResolution
				+ ", jobMonitoring=" + jobMonitoring + ", lowLevelDesign=" + lowLevelDesign + ", minorBAUWork="
				+ minorBAUWork + ", deployment=" + deployment + ", testing=" + testing + ", architecture="
				+ architecture + ", featuresFunctionalites=" + featuresFunctionalites + ", codeComplexity="
				+ codeComplexity + ", interfacing=" + interfacing + ", deployment2=" + deployment2
				+ ", requirementAnalysis=" + requirementAnalysis + ", assessedby=" + assessedby + ", reviewedby="
				+ reviewedby + ", noOfRisks=" + noOfRisks + ", riskArea=" + riskArea + "]";
	}	

}
