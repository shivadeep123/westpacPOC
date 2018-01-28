package com.example.resource.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="RESOURCE_SKILL_TRACKER")
public class ResourceSkill {
	
	@Id
	@Column(name="RESOURCE_NAME")
	private String resourceName;
	
	@Column(name="ROLE")
	private String role;
	
	
	@Column(name="APPLICATION_NAME")
	private String applicationName;	
	
	@Column(name="MODULE_NAME")
	private String moduleName;	 
	
	@Column(name="PROGRAM_NAME")
	private String programName;
		
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
    
    @Column(name="CURRENT_LEVEL")
    private String currentLevel; 

    @Column(name="PLANNED_LEVEL_BY_NEXT_QUARTER")	                           
    private String plannedLevelbyNextQuarter;  

    @Column(name="ACTIONS_TO_BE_TAKEN")          
    private String actoinsToBetaken;    

    @Column(name="ASSESSED_BY")                  
    private String assessedby;   

    @Column(name="REVIEWED_APPROVED_BY")                           
    private String reviewedApprovedby;

    @Column(name="ALL_RED")                     
    private int allRED;         

    @Column(name="ALL_AMBER")                            
    private int allAMBER;       

    @Column(name="ALL_GREEN")                            
    private int allGreen;       

    @Column(name="OVERALL_RESOURCE_RATING")                            
    private String overallResourceRating;

    @Column(name="SUGGESTED_ROLE")                  
    private String suggestedRole;

    @Column(name="TECH_RED")                           
    private int techRED;        

    @Column(name="TECH_AMBER")                            
    private int techAMBER;      

    @Column(name="TECH_GREEN")                            
    private int techGREEN;      

    @Column(name="DOM_RED")                            
    private int domRED;         

    @Column(name="DOM_AMBER")                            
    private int domAMBER;       

    @Column(name="DOM_GREEN")                            
    private int domGREEN;       

    @Column(name="APL_RED")                            
    private int aplRED;         

    @Column(name="APL_AMBER")                            
    private int aplAMBER;       

    @Column(name="APL_GREEN")                            
    private int aplGREEN;       

    @Column(name="IMPROVEMENT_AREA_AMBER")                            
    private String improvementAreaAMBER;

    @Column(name="IMPROVEMENT_AREA_RED")                  
    private String improvementAreaRED;

    @Column(name="EXACT_MATCH_MODULES")                    
    private String exactMatchModules;

    @Column(name="AMBER_MATCH_MODULES")                    
    private String amberMatchModules;    

    @Column(name="OVERALL_TECHNOLOGY_RAG")                
    private String overalltechnologyRAG;     

    @Column(name="OVERALL_DOMAIN_RAG")              
    private String overallDomainRAG;

    @Column(name="OVERALL_APPLICATION_RAG")                       
    private String overallApplicationRAG;   

    @Column(name="CTRY")               
    private String ctry;          

    @Column(name="EMP_SERIAL_NO")                           
    private String empSerialNumber;

    @Column(name="ORIGINAL_JOIN_DATE")                            
    private String originalJoinDate; 

    @Column(name="LESS_THAN_3_MONTHS_IN_ACCOUNT")                      
    private String lessthan3months; 

    @Column(name="START_DATE_FROM_WMML")           
    private String startDateFromWMMl;       

    @Column(name="LOGICAL_REASONING_APTITUDE")              
    private String logicalReasoningAptitude;  

    @Column(name="TECHNICAL_KNOWLEDGE")             
    private int technicalKnowledge;       

    @Column(name="DOMAIN_KNOWLEDGE")                  
    private int domainKnowledge;      

    @Column(name="APPLICATION_KNOWLEDGE")                      
    private int applicationKnowledge;  

    @Column(name="OVERALL_KNOWLEDGE_LEVEL")                     
    private int overallKnowledgeLevel;      

    @Column(name="IN_A_COMPLEX_APPLICATION")               
    private String forComplexAppliction; 

    @Column(name="WESTPAC_TENURE_AS_CURENT_MONTH")                
    private String westpacTenure;

    @Column(name="SOLID_CONTRIBUTOR")           
    private String solidContributer;          

    @Column(name="CRITICAL_FOR_DELIVERY")              
    private String deliveryCriticality;     

    @Column(name="CRITICAL_FOR_DELIVERY_YES")               
    private String criticalDeliveryYes;     

    @Column(name="EMP_NUMBER_")           
    private String empNumber;   

    @Column(name="EMP_NUM_TEXT")                           
    private String empNumText;  

    @Column(name="ON_OFFSHORE_MOVEMENT")                           
    private String onShoreMovement;  

    @Column(name="START_DATE")                   
    private String startDate;

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(String currentLevel) {
		this.currentLevel = currentLevel;
	}

	public String getPlannedLevelbyNextQuarter() {
		return plannedLevelbyNextQuarter;
	}

	public void setPlannedLevelbyNextQuarter(String plannedLevelbyNextQuarter) {
		this.plannedLevelbyNextQuarter = plannedLevelbyNextQuarter;
	}

	public String getActoinsToBetaken() {
		return actoinsToBetaken;
	}

	public void setActoinsToBetaken(String actoinsToBetaken) {
		this.actoinsToBetaken = actoinsToBetaken;
	}

	public String getAssessedby() {
		return assessedby;
	}

	public void setAssessedby(String assessedby) {
		this.assessedby = assessedby;
	}

	public String getReviewedApprovedby() {
		return reviewedApprovedby;
	}

	public void setReviewedApprovedby(String reviewedApprovedby) {
		this.reviewedApprovedby = reviewedApprovedby;
	}

	public int getAllRED() {
		return allRED;
	}

	public void setAllRED(int allRED) {
		this.allRED = allRED;
	}

	public int getAllAMBER() {
		return allAMBER;
	}

	public void setAllAMBER(int allAMBER) {
		this.allAMBER = allAMBER;
	}

	public int getAllGreen() {
		return allGreen;
	}

	public void setAllGreen(int allGreen) {
		this.allGreen = allGreen;
	}

	public String getOverallResourceRating() {
		return overallResourceRating;
	}

	public void setOverallResourceRating(String overallResourceRating) {
		this.overallResourceRating = overallResourceRating;
	}

	public String getSuggestedRole() {
		return suggestedRole;
	}

	public void setSuggestedRole(String suggestedRole) {
		this.suggestedRole = suggestedRole;
	}

	public int getTechRED() {
		return techRED;
	}

	public void setTechRED(int techRED) {
		this.techRED = techRED;
	}

	public int getTechAMBER() {
		return techAMBER;
	}

	public void setTechAMBER(int techAMBER) {
		this.techAMBER = techAMBER;
	}

	public int getTechGREEN() {
		return techGREEN;
	}

	public void setTechGREEN(int techGREEN) {
		this.techGREEN = techGREEN;
	}

	public int getDomRED() {
		return domRED;
	}

	public void setDomRED(int domRED) {
		this.domRED = domRED;
	}

	public int getDomAMBER() {
		return domAMBER;
	}

	public void setDomAMBER(int domAMBER) {
		this.domAMBER = domAMBER;
	}

	public int getDomGREEN() {
		return domGREEN;
	}

	public void setDomGREEN(int domGREEN) {
		this.domGREEN = domGREEN;
	}

	public int getAplRED() {
		return aplRED;
	}

	public void setAplRED(int aplRED) {
		this.aplRED = aplRED;
	}

	public int getAplAMBER() {
		return aplAMBER;
	}

	public void setAplAMBER(int aplAMBER) {
		this.aplAMBER = aplAMBER;
	}

	public int getAplGREEN() {
		return aplGREEN;
	}

	public void setAplGREEN(int aplGREEN) {
		this.aplGREEN = aplGREEN;
	}

	public String getImprovementAreaAMBER() {
		return improvementAreaAMBER;
	}

	public void setImprovementAreaAMBER(String improvementAreaAMBER) {
		this.improvementAreaAMBER = improvementAreaAMBER;
	}

	public String getImprovementAreaRED() {
		return improvementAreaRED;
	}

	public void setImprovementAreaRED(String improvementAreaRED) {
		this.improvementAreaRED = improvementAreaRED;
	}

	public String getExactMatchModules() {
		return exactMatchModules;
	}

	public void setExactMatchModules(String exactMatchModules) {
		this.exactMatchModules = exactMatchModules;
	}

	public String getAmberMatchModules() {
		return amberMatchModules;
	}

	public void setAmberMatchModules(String amberMatchModules) {
		this.amberMatchModules = amberMatchModules;
	}

	public String getOveralltechnologyRAG() {
		return overalltechnologyRAG;
	}

	public void setOveralltechnologyRAG(String overalltechnologyRAG) {
		this.overalltechnologyRAG = overalltechnologyRAG;
	}

	public String getOverallDomainRAG() {
		return overallDomainRAG;
	}

	public void setOverallDomainRAG(String overallDomainRAG) {
		this.overallDomainRAG = overallDomainRAG;
	}

	public String getOverallApplicationRAG() {
		return overallApplicationRAG;
	}

	public void setOverallApplicationRAG(String overallApplicationRAG) {
		this.overallApplicationRAG = overallApplicationRAG;
	}

	public String getCtry() {
		return ctry;
	}

	public void setCtry(String ctry) {
		this.ctry = ctry;
	}

	public String getEmpSerialNumber() {
		return empSerialNumber;
	}

	public void setEmpSerialNumber(String empSerialNumber) {
		this.empSerialNumber = empSerialNumber;
	}

	public String getOriginalJoinDate() {
		return originalJoinDate;
	}

	public void setOriginalJoinDate(String originalJoinDate) {
		this.originalJoinDate = originalJoinDate;
	}

	public String getLessthan3months() {
		return lessthan3months;
	}

	public void setLessthan3months(String lessthan3months) {
		this.lessthan3months = lessthan3months;
	}

	public String getStartDateFromWMMl() {
		return startDateFromWMMl;
	}

	public void setStartDateFromWMMl(String startDateFromWMMl) {
		this.startDateFromWMMl = startDateFromWMMl;
	}

	public String getLogicalReasoningAptitude() {
		return logicalReasoningAptitude;
	}

	public void setLogicalReasoningAptitude(String logicalReasoningAptitude) {
		this.logicalReasoningAptitude = logicalReasoningAptitude;
	}

	public int getTechnicalKnowledge() {
		return technicalKnowledge;
	}

	public void setTechnicalKnowledge(int technicalKnowledge) {
		this.technicalKnowledge = technicalKnowledge;
	}

	public int getDomainKnowledge() {
		return domainKnowledge;
	}

	public void setDomainKnowledge(int domainKnowledge) {
		this.domainKnowledge = domainKnowledge;
	}

	public int getApplicationKnowledge() {
		return applicationKnowledge;
	}

	public void setApplicationKnowledge(int applicationKnowledge) {
		this.applicationKnowledge = applicationKnowledge;
	}

	public int getOverallKnowledgeLevel() {
		return overallKnowledgeLevel;
	}

	public void setOverallKnowledgeLevel(int overallKnowledgeLevel) {
		this.overallKnowledgeLevel = overallKnowledgeLevel;
	}

	public String getForComplexAppliction() {
		return forComplexAppliction;
	}

	public void setForComplexAppliction(String forComplexAppliction) {
		this.forComplexAppliction = forComplexAppliction;
	}

	public String getWestpacTenure() {
		return westpacTenure;
	}

	public void setWestpacTenure(String westpacTenure) {
		this.westpacTenure = westpacTenure;
	}

	public String getSolidContributer() {
		return solidContributer;
	}

	public void setSolidContributer(String solidContributer) {
		this.solidContributer = solidContributer;
	}

	public String getDeliveryCriticality() {
		return deliveryCriticality;
	}

	public void setDeliveryCriticality(String deliveryCriticality) {
		this.deliveryCriticality = deliveryCriticality;
	}

	public String getCriticalDeliveryYes() {
		return criticalDeliveryYes;
	}

	public void setCriticalDeliveryYes(String criticalDeliveryYes) {
		this.criticalDeliveryYes = criticalDeliveryYes;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpNumText() {
		return empNumText;
	}

	public void setEmpNumText(String empNumText) {
		this.empNumText = empNumText;
	}

	public String getOnShoreMovement() {
		return onShoreMovement;
	}

	public void setOnShoreMovement(String onShoreMovement) {
		this.onShoreMovement = onShoreMovement;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	

	public ResourceSkill() {
		//super();
	}

	public ResourceSkill(String resourceName, String role, String applicationName, String moduleName,
			String programName, int powerBuilder, int lotusNotesScripting, int cobal_CICS, int ims_JCL, int cpas,
			int filenetReportManager, int wdp_UI, int wdp_MICROSERVICES, int wdp_BPEL, int wdp_BPM, int base24Tandem,
			int filenetImageServer, int microsoftSQLServer, int java, int coding, int analytcal, int bootstrap,
			int csharpDOTNET, int plsql, int unix, int vbDOTNET, int webservice, int javascript, int hibernate,
			int spring, int ejb, int fileNet, int j2ee, int angularJS, int websphereApplicationSever, int websphereMQ,
			int xml, int splunk, int tallymanConfiguration, int devops, int db2_sql, int controlM, int html,
			int jenkins, int financialServiceoverview, int cards, int ticketResolution, int jobMonitoring,
			int lowLevelDesign, int minorBAUWork, int deployment, int testing, int architecture,
			int featuresFunctionalites, int codeComplexity, int interfacing, int deployment2, int requirementAnalysis,
			String currentLevel, String plannedLevelbyNextQuarter, String actoinsToBetaken, String assessedby,
			String reviewedApprovedby, int allRED, int allAMBER, int allGreen, String overallResourceRating,
			String suggestedRole, int techRED, int techAMBER, int techGREEN, int domRED, int domAMBER, int domGREEN,
			int aplRED, int aplAMBER, int aplGREEN, String improvementAreaAMBER, String improvementAreaRED,
			String exactMatchModules, String amberMatchModules, String overalltechnologyRAG, String overallDomainRAG,
			String overallApplicationRAG, String ctry, String empSerialNumber, String originalJoinDate,
			String lessthan3months, String startDateFromWMMl, String logicalReasoningAptitude, int technicalKnowledge,
			int domainKnowledge, int applicationKnowledge, int overallKnowledgeLevel, String forComplexAppliction,
			String westpacTenure, String solidContributer, String deliveryCriticality, String criticalDeliveryYes,
			String empNumber, String empNumText, String onShoreMovement, String startDate) {
		//super();
		this.resourceName = resourceName;
		this.role = role;
		this.applicationName = applicationName;
		this.moduleName = moduleName;
		this.programName = programName;
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
		this.currentLevel = currentLevel;
		this.plannedLevelbyNextQuarter = plannedLevelbyNextQuarter;
		this.actoinsToBetaken = actoinsToBetaken;
		this.assessedby = assessedby;
		this.reviewedApprovedby = reviewedApprovedby;
		this.allRED = allRED;
		this.allAMBER = allAMBER;
		this.allGreen = allGreen;
		this.overallResourceRating = overallResourceRating;
		this.suggestedRole = suggestedRole;
		this.techRED = techRED;
		this.techAMBER = techAMBER;
		this.techGREEN = techGREEN;
		this.domRED = domRED;
		this.domAMBER = domAMBER;
		this.domGREEN = domGREEN;
		this.aplRED = aplRED;
		this.aplAMBER = aplAMBER;
		this.aplGREEN = aplGREEN;
		this.improvementAreaAMBER = improvementAreaAMBER;
		this.improvementAreaRED = improvementAreaRED;
		this.exactMatchModules = exactMatchModules;
		this.amberMatchModules = amberMatchModules;
		this.overalltechnologyRAG = overalltechnologyRAG;
		this.overallDomainRAG = overallDomainRAG;
		this.overallApplicationRAG = overallApplicationRAG;
		this.ctry = ctry;
		this.empSerialNumber = empSerialNumber;
		this.originalJoinDate = originalJoinDate;
		this.lessthan3months = lessthan3months;
		this.startDateFromWMMl = startDateFromWMMl;
		this.logicalReasoningAptitude = logicalReasoningAptitude;
		this.technicalKnowledge = technicalKnowledge;
		this.domainKnowledge = domainKnowledge;
		this.applicationKnowledge = applicationKnowledge;
		this.overallKnowledgeLevel = overallKnowledgeLevel;
		this.forComplexAppliction = forComplexAppliction;
		this.westpacTenure = westpacTenure;
		this.solidContributer = solidContributer;
		this.deliveryCriticality = deliveryCriticality;
		this.criticalDeliveryYes = criticalDeliveryYes;
		this.empNumber = empNumber;
		this.empNumText = empNumText;
		this.onShoreMovement = onShoreMovement;
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "ResourceSkill [resourceName=" + resourceName + ", role=" + role + ", applicationName=" + applicationName
				+ ", moduleName=" + moduleName + ", programName=" + programName + ", powerBuilder=" + powerBuilder
				+ ", lotusNotesScripting=" + lotusNotesScripting + ", cobal_CICS=" + cobal_CICS + ", ims_JCL=" + ims_JCL
				+ ", cpas=" + cpas + ", filenetReportManager=" + filenetReportManager + ", wdp_UI=" + wdp_UI
				+ ", wdp_MICROSERVICES=" + wdp_MICROSERVICES + ", wdp_BPEL=" + wdp_BPEL + ", wdp_BPM=" + wdp_BPM
				+ ", base24Tandem=" + base24Tandem + ", filenetImageServer=" + filenetImageServer
				+ ", microsoftSQLServer=" + microsoftSQLServer + ", java=" + java + ", coding=" + coding
				+ ", analytcal=" + analytcal + ", bootstrap=" + bootstrap + ", csharpDOTNET=" + csharpDOTNET
				+ ", plsql=" + plsql + ", unix=" + unix + ", vbDOTNET=" + vbDOTNET + ", webservice=" + webservice
				+ ", javascript=" + javascript + ", hibernate=" + hibernate + ", spring=" + spring + ", ejb=" + ejb
				+ ", fileNet=" + fileNet + ", j2ee=" + j2ee + ", angularJS=" + angularJS
				+ ", websphereApplicationSever=" + websphereApplicationSever + ", websphereMQ=" + websphereMQ + ", xml="
				+ xml + ", splunk=" + splunk + ", tallymanConfiguration=" + tallymanConfiguration + ", devops=" + devops
				+ ", db2_sql=" + db2_sql + ", controlM=" + controlM + ", html=" + html + ", jenkins=" + jenkins
				+ ", financialServiceoverview=" + financialServiceoverview + ", cards=" + cards + ", ticketResolution="
				+ ticketResolution + ", jobMonitoring=" + jobMonitoring + ", lowLevelDesign=" + lowLevelDesign
				+ ", minorBAUWork=" + minorBAUWork + ", deployment=" + deployment + ", testing=" + testing
				+ ", architecture=" + architecture + ", featuresFunctionalites=" + featuresFunctionalites
				+ ", codeComplexity=" + codeComplexity + ", interfacing=" + interfacing + ", deployment2=" + deployment2
				+ ", requirementAnalysis=" + requirementAnalysis + ", currentLevel=" + currentLevel
				+ ", plannedLevelbyNextQuarter=" + plannedLevelbyNextQuarter + ", actoinsToBetaken=" + actoinsToBetaken
				+ ", assessedby=" + assessedby + ", reviewedApprovedby=" + reviewedApprovedby + ", allRED=" + allRED
				+ ", allAMBER=" + allAMBER + ", allGreen=" + allGreen + ", overallResourceRating="
				+ overallResourceRating + ", suggestedRole=" + suggestedRole + ", techRED=" + techRED + ", techAMBER="
				+ techAMBER + ", techGREEN=" + techGREEN + ", domRED=" + domRED + ", domAMBER=" + domAMBER
				+ ", domGREEN=" + domGREEN + ", aplRED=" + aplRED + ", aplAMBER=" + aplAMBER + ", aplGREEN=" + aplGREEN
				+ ", improvementAreaAMBER=" + improvementAreaAMBER + ", improvementAreaRED=" + improvementAreaRED
				+ ", exactMatchModules=" + exactMatchModules + ", amberMatchModules=" + amberMatchModules
				+ ", overalltechnologyRAG=" + overalltechnologyRAG + ", overallDomainRAG=" + overallDomainRAG
				+ ", overallApplicationRAG=" + overallApplicationRAG + ", ctry=" + ctry + ", empSerialNumber="
				+ empSerialNumber + ", originalJoinDate=" + originalJoinDate + ", lessthan3months=" + lessthan3months
				+ ", startDateFromWMMl=" + startDateFromWMMl + ", logicalReasoningAptitude=" + logicalReasoningAptitude
				+ ", technicalKnowledge=" + technicalKnowledge + ", domainKnowledge=" + domainKnowledge
				+ ", applicationKnowledge=" + applicationKnowledge + ", overallKnowledgeLevel=" + overallKnowledgeLevel
				+ ", forComplexAppliction=" + forComplexAppliction + ", westpacTenure=" + westpacTenure
				+ ", solidContributer=" + solidContributer + ", deliveryCriticality=" + deliveryCriticality
				+ ", criticalDeliveryYes=" + criticalDeliveryYes + ", empNumber=" + empNumber + ", empNumText="
				+ empNumText + ", onShoreMovement=" + onShoreMovement + ", startDate=" + startDate + "]";
	}                               
    

}
