package task2;

public class employee {

		private String empName;
		private int empId;
		public employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
		}
		public String getEmpName() {
		return empName;
		}
		public void setEmpName(String empName) {
		this.empName = empName;
		}
		public int getEmpId() {
		return empId;
		}
		public void setEmpId(int empId) {
		this.empId = empId;
		}
		@Override
		public String toString() {
		return "employee [empName=" + empName + ", empId=" + empId + "]";
		}
		}




