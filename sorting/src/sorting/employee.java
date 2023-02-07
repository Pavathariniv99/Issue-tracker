package sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;





public class employee {
Integer empNo;
String name;
String designation;
String project;



public employee(Integer empNo, String name, String designation, String project) {
//super();
this.empNo = empNo;
this.name = name;
this.designation = designation;
this.project = project;
}



public Integer getEmpNo() {
return empNo;
}



public void setEmpNo(Integer empNo) {
this.empNo = empNo;
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



public String getDesignation() {
return designation;
}



public void setDesignation(String designation) {
this.designation = designation;
}



public String getProject() {
return project;
}



public void setProject(String project) {
this.project = project;
}



@Override
public String toString() {
return "empNo=" + empNo + ", name=" + name + ", desgination=" + designation + ", project=" + project
+ "\n";
}
public static void main(String args[]) {
ArrayList<employee>empList=new ArrayList<employee>();
empList.add(new employee(4,"pavi","aws dev","A"));
empList.add(new employee(2,"kirthi","PHP dev","B"));
empList.add(new employee(3,"athi","java dev","C"));
empList.add(new employee(1,"babu","html dev","D"));
empList.add(new employee(5,"sugan","web desi","E"));
empList.add(new employee(7,"rathika","js dev","F"));
empList.add(new employee(6,"karthik","python dev","G"));
empList.add(new employee(13,"karthik","php dev","H"));
Collections.sort(empList, Comparator.comparing(employee::getName).thenComparing(employee::getEmpNo));



//Collections.sort(empList,new Comparator<Employee>(){
//@Override
//public int compare(Employee a1, Employee a2) {
////return a1.empNo.compareTo(a2.empNo);//using number sort
//return a1.name.compareTo(a2.name);// Using name sort
//}
for(employee i:empList)
System.out.println(i);
}
}







