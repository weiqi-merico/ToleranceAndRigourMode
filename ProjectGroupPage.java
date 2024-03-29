package com.merico.selenium.test.ee.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.merico.selenium.autoscreenshot.AutoIntercept;
import com.merico.selenium.page.Page;
import com.merico.selenium.test.ee.control.ProjectGroupControls;
import com.merico.selenium.test.ee.data.TestDataProvider;
import com.merico.selenium.test.ee.utils.Utilities;

public class ProjectGroupPage extends Page {
	public ProjectGroupPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isLoaded() {
        // No Ajax content, which can be considered to create the Page object has finished loading.
        return true;
    }

    private void navigateProjectGroup() {
    	Utilities.waitForControlPresent(driver, By.xpath(ProjectGroupControls.Project_Group_Link_Xpath));
    	driver.findElement(By.xpath(ProjectGroupControls.Project_Group_Link_Xpath)).click();
    	Utilities.staticTimeDelay(4000);
    }

    private void addProjectGroupDialog(String projectGroupName) {
    	Utilities.waitForControlPresent(driver, By.id(ProjectGroupControls.Project_Group_Name_Id));
    	driver.findElement(By.id(ProjectGroupControls.Project_Group_Name_Id)).clear();
    	driver.findElement(By.id(ProjectGroupControls.Project_Group_Name_Id)).sendKeys(projectGroupName);
    	driver.findElement(By.id(ProjectGroupControls.Project_Group_Description_Id)).clear();
    	driver.findElement(By.id(ProjectGroupControls.Project_Group_Description_Id)).sendKeys(Utilities.getRandomString(100));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Project_Group_Confirm_Btn_Css)).click();
    	Utilities.staticTimeDelay(2000);
    	this.closeToast();
        Utilities.staticTimeDelay(2000);
    }

    @AutoIntercept
    public void addProjectGroup(String projectGroupName) {
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Add_Project_Group_Btn_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Add_Project_Group_Btn_Css)).click();

    	this.addProjectGroupDialog(projectGroupName);
    }

    public String getSearchResultItem() {
    	driver.navigate().refresh();
    	Utilities.staticTimeDelay(2000);
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Search_Textbox_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Search_Textbox_Css)).clear();
    	driver.findElement(By.cssSelector(ProjectGroupControls.Search_Textbox_Css)).sendKeys(TestDataProvider.projectGroupName);
    	Utilities.staticTimeDelay(2000);
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Search_Item_Link_Css));
    	String searchResult = driver.findElement(By.cssSelector(ProjectGroupControls.Search_Item_Link_Css)).getText().trim();

    	return searchResult;
    }

    private void hover4MoreBtn() {
    	Utilities.staticTimeDelay(1000);
    	int tree_node_num = driver.findElements(By.cssSelector(ProjectGroupControls.Project_Group_Treenode_Css)).size();

    	{
    	      WebElement element = driver.findElement(By.cssSelector(ProjectGroupControls.Treenode_Trigger_Left_Css +
    	    		  tree_node_num + ProjectGroupControls.Treenode_Trigger_Right_Css));
    	      Actions builder = new Actions(driver);
    	      builder.moveToElement(element).perform();
    	}
    }

    private void hover4BatchCheckboxBtnAndClick() {
    	Utilities.staticTimeDelay(1000);
    	int tree_node_num = driver.findElements(By.cssSelector(ProjectGroupControls.Project_Group_Treenode_Css)).size();

    	{
    	      WebElement element = driver.findElement(By.cssSelector(ProjectGroupControls.Treenode_Trigger_Left_Css +
    	    		  tree_node_num + ProjectGroupControls.Treenode_Item_Checkbox_Right_Css));
    	      Actions builder = new Actions(driver);
    	      builder.moveToElement(element).perform();
    	}

    	driver.findElement(By.cssSelector(ProjectGroupControls.Treenode_Trigger_Left_Css +
	    		  tree_node_num + ProjectGroupControls.Treenode_Item_Checkbox_Right_Css)).click();
    }

    private void closeToast() {
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Operating_Toast_Close_Css));
        driver.findElement(By.cssSelector(ProjectGroupControls.Operating_Toast_Close_Css)).click();
    }

    @AutoIntercept
    public void addSubProjectGroup(String projectGroupName) {
    	this.hover4MoreBtn();

    	Utilities.staticTimeDelay(1000);
    	Utilities.waitForControlPresent(driver, By.xpath(ProjectGroupControls.Add_Sub_Project_Group_Xpath));
    	driver.findElement(By.xpath(ProjectGroupControls.Add_Sub_Project_Group_Xpath)).click();
    	this.addProjectGroupDialog(projectGroupName);
    }

    @AutoIntercept
    public void editProjectGroup(String projectGroupName) {
    	this.hover4MoreBtn();

    	Utilities.staticTimeDelay(1000);
    	Utilities.waitForControlPresent(driver, By.xpath(ProjectGroupControls.Edit_Project_Group_Xpath));
    	driver.findElement(By.xpath(ProjectGroupControls.Edit_Project_Group_Xpath)).click();

    	this.addProjectGroupDialog(projectGroupName);
    }


    @AutoIntercept
    public void moveProjectGroup(String projectGroupName) {
    	String projectGroupA = projectGroupName + "_A";

    	driver.navigate().refresh();
    	Utilities.staticTimeDelay(4000);
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Add_Project_Group_Btn_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Add_Project_Group_Btn_Css)).click();
    	this.addProjectGroupDialog(projectGroupA);

    	this.hover4MoreBtn();
    	Utilities.staticTimeDelay(1000);
    	Utilities.waitForControlPresent(driver, By.xpath(ProjectGroupControls.Move_Project_Group_Xpath));
    	driver.findElement(By.xpath(ProjectGroupControls.Move_Project_Group_Xpath)).click();
    	Utilities.staticTimeDelay(5000);
    	driver.findElement(By.id(ProjectGroupControls.Move_Input_Textbox_Id)).sendKeys(Keys.TAB);
    	driver.findElement(By.id(ProjectGroupControls.Move_Input_Textbox_Id)).sendKeys(Keys.TAB);
    	driver.findElement(By.id(ProjectGroupControls.Move_Input_Textbox_Id)).sendKeys("Merico");
    	driver.findElement(By.id(ProjectGroupControls.Move_Input_Textbox_Id)).sendKeys(Keys.ENTER);
    	driver.findElement(By.cssSelector(ProjectGroupControls.Move_Project_Group_Confirm_Btn_Css)).click();
    	Utilities.staticTimeDelay(2000);
    	this.closeToast();
        Utilities.staticTimeDelay(1000);

        this.hover4MoreBtn();
    	Utilities.staticTimeDelay(1000);
    	driver.findElement(By.xpath(ProjectGroupControls.Del_Project_Group_Xpath)).click();
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Del_Project_Group_Textbox_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Del_Project_Group_Textbox_Css)).clear();
    	driver.findElement(By.cssSelector(ProjectGroupControls.Del_Project_Group_Textbox_Css)).sendKeys(projectGroupA);
    	Utilities.staticTimeDelay(2000);
    	Actions builder = new Actions(driver);
    	builder.sendKeys(Keys.TAB).perform();
    	builder.sendKeys(Keys.TAB).perform();
    	builder.sendKeys(Keys.ENTER).perform();
    	Utilities.staticTimeDelay(2000);
    	this.closeToast();
        Utilities.staticTimeDelay(2000);
    }

    @AutoIntercept
    public void batchMoveProjectGroup(String projectGroupName) {
    	String projectGroupBatch = projectGroupName + "_Bat";

    	driver.navigate().refresh();
    	Utilities.staticTimeDelay(4000);
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Add_Project_Group_Btn_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Add_Project_Group_Btn_Css)).click();
    	this.addProjectGroupDialog(projectGroupBatch);

    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Batch_Checkbox_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Batch_Checkbox_Css)).click();

    	this.hover4BatchCheckboxBtnAndClick();
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Batch_Move_Btn_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Batch_Move_Btn_Css)).click();
    	Utilities.staticTimeDelay(5000);
    	driver.findElement(By.id(ProjectGroupControls.Move_Input_Textbox_Id)).sendKeys(Keys.TAB);
    	driver.findElement(By.id(ProjectGroupControls.Move_Input_Textbox_Id)).sendKeys(Keys.TAB);
    	driver.findElement(By.id(ProjectGroupControls.Move_Input_Textbox_Id)).sendKeys("Merico");
    	driver.findElement(By.id(ProjectGroupControls.Move_Input_Textbox_Id)).sendKeys(Keys.ENTER);
    	driver.findElement(By.cssSelector(ProjectGroupControls.Move_Project_Group_Confirm_Btn_Css)).click();
    	Utilities.staticTimeDelay(2000);
    	this.closeToast();
        Utilities.staticTimeDelay(1000);
        Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Batch_Del_Btn_Css));
        driver.findElement(By.cssSelector(ProjectGroupControls.Batch_Del_Btn_Css)).click();
        Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Del_Project_Group_Textbox_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Del_Project_Group_Textbox_Css)).clear();
    	driver.findElement(By.cssSelector(ProjectGroupControls.Del_Project_Group_Textbox_Css)).sendKeys("DELETE");
    	Utilities.staticTimeDelay(2000);
    	Actions builder = new Actions(driver);
    	builder.sendKeys(Keys.TAB).perform();
    	builder.sendKeys(Keys.TAB).perform();
    	builder.sendKeys(Keys.ENTER).perform();
    	Utilities.staticTimeDelay(2000);
    	this.closeToast();
        Utilities.staticTimeDelay(2000);
    }

    @AutoIntercept
    public void focusProjectGroup(String projectGroupName) {
    	this.navigateProjectGroup();

    	int tree_node_num = 1;
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Treenode_Trigger_Left_Css +
	    		  tree_node_num + ProjectGroupControls.Treenode_Focus_Btn_Right_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Treenode_Trigger_Left_Css +
	    		  tree_node_num + ProjectGroupControls.Treenode_Focus_Btn_Right_Css)).click();
    	Utilities.staticTimeDelay(2000);
    	this.closeToast();
    	driver.findElement(By.cssSelector(ProjectGroupControls.Focus_Project_Group_Tab_Css)).click();
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Treenode_Trigger_Left_Css +
	    		  tree_node_num + ProjectGroupControls.Treenode_Unfocus_Btn_Right_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Treenode_Trigger_Left_Css +
	    		  tree_node_num + ProjectGroupControls.Treenode_Unfocus_Btn_Right_Css)).click();
    	Utilities.staticTimeDelay(2000);
    	this.closeToast();
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.All_Project_Group_Tab_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.All_Project_Group_Tab_Css)).click();
    	Utilities.staticTimeDelay(2000);
    }

    @AutoIntercept
    public void delProjectGroup(String projectGroupName) {
    	this.hover4MoreBtn();
    	Utilities.staticTimeDelay(1000);
    	driver.findElement(By.xpath(ProjectGroupControls.Del_Project_Group_Xpath)).click();
    	Utilities.waitForControlPresent(driver, By.cssSelector(ProjectGroupControls.Del_Project_Group_Textbox_Css));
    	driver.findElement(By.cssSelector(ProjectGroupControls.Del_Project_Group_Textbox_Css)).clear();
    	driver.findElement(By.cssSelector(ProjectGroupControls.Del_Project_Group_Textbox_Css)).sendKeys(
    			projectGroupName);
    	Utilities.staticTimeDelay(2000);
    	driver.findElement(By.cssSelector(ProjectGroupControls.Del_Project_Group_Confirm_Btn_Css)).click();
    	Utilities.staticTimeDelay(2000);
    	this.closeToast();
        Utilities.staticTimeDelay(1000);
    }
}
