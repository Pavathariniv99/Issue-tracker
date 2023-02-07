package task2;

public class project {
private String projectName;
private int projectId;
private String startDate;
public project(String projectName, int projectId, String startDate) {
super();
this.projectName = projectName;
this.projectId = projectId;
this.startDate = startDate;
}
@Override
public String toString() {
return "Project [projectName=" + projectName + ", projectId=" + projectId + ", startDate=" + startDate + "]";
}
public String getProjectName() {
return projectName;
}
public void setProjectName(String projectName) {
this.projectName = projectName;
}
public int getProjectId() {
return projectId;
}
public void setProjectId(int projectId) {
this.projectId = projectId;
}
public String getStartDate() {
return startDate;
}
public void setStartDate(String startDate) {
this.startDate = startDate;
}


}

