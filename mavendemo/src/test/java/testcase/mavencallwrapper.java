package testcase;

public class mavencallwrapper {

	public static void main(String[] args) throws Exception {
		
		mavenwrappermethod mwm=new mavenwrappermethod();
		mwm.insertapp("https://opensource-demo.orangehrmlive.com");
		mwm.enterbyname("txtUsername","Admin");
		mwm.enterbyid("txtPassword","admin123");
		mwm.clickbyid("btnLogin");
		mwm.clickbyid("menu_pim_viewPimModule");
		mwm.clickbyid("menu_pim_addEmployee");
		mwm.screenshot("OrangeHRM PIM Page");
		mwm.closeapp();

	}

}
