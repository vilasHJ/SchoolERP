package ERP;

import java.io.IOException;

public class Staff_On_Boarding extends Template_creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ERP_First.CreateInstance();
		System.out.println(driver.getTitle());
		ERP_First.LoginPage();
		try {
			ERP_First.Delay();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			
		try {
			ERP_First.School_Creation(ERP_First.Data_Provider());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Student_On_Boarding.Academic_Structure();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Fee_Details.Fee_Structure();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
		
		try {
			Student_Admission.Student_Admission();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			Staff_Registration.Staff_Creation();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				Staff_Registration.Staff_Details();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		    try {
				Template_creation.TimeTable_Creation();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}

