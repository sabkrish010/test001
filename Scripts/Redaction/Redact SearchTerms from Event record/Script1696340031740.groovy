import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Add Event for redaction'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Redaction/Check if task type PII Redaction is available for selection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Registers/Task/Add New Task record/textarea_Notes'), 'The successive west vanishes inside the bog. Can the rear sound the John owner? An elite opera progresses. The immortal disconnects an erroneous surgery without any variant. Jim drives Porsche.')

WebUI.clearText(findTestObject('Core Functionality/Registers/Task/Edit Task Record/input_Title(Task)'))

WebUI.click(findTestObject('General/AccountProfile/span_loggedinuser'))

def user = WebUI.getAttribute(findTestObject('General/AccountProfile/FullName(AccountProfile)'), 'value')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Type1'), 'PII Redaction', 
    false)

WebUI.click(findTestObject('General/AccountProfile/Cancel(AccountProfile)'))

System.out.println(user)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_AllocatedTo1'), user, 
    false, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Status'), 'In Progress', 
    false)

WebUI.setText(findTestObject('Core Functionality/Registers/Task/Edit Task Record/input_Title(Task)'), 'Jim slang recovers the Mark\'s repeated performance in a cough')

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 2, FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Redaction/Redaction_Section'), 3)

WebUI.verifyElementPresent(findTestObject('Redaction/Redaction_Section'), 3)

WebUI.click(findTestObject('Redaction/Subject_FieldLabel'))

WebUI.click(findTestObject('Core Functionality/Registers/Task/Add New Task record/Subject(Task Record)'))

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Add Source link to incident/a_Create New Record'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Forename(subject)'), 
    'Tempest')

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Surname(RedactSubject)'), 
    'Paul Tempest', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Core Functionality/Registers/Person/Person pop-up/Subject Popup/input_Surname_Subject'), 'Paul Tempest', 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/select_OwnerTeam'), 
    'Intelligence Source Management', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Person/Person pop-up/Person Pop-Up fields/input_personSave'))

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.click(findTestObject('Redaction/a_RedactionSearchResults'))

WebUI.enhancedClick(findTestObject('Redaction/Close(Redaction Results Pop-Up)'))

WebUI.enhancedClick(findTestObject('Redaction/a_RedactionSearchResults'))

WebUI.scrollToElement(findTestObject('Redaction/EventSearchResult(Results Pop-Up)'), 2)

WebUI.click(findTestObject('Redaction/RedactBtn(Result2)'))

WebUI.click(findTestObject('Redaction/RedactConfirm_Result2'))

WebUI.verifyElementPresent(findTestObject('Redaction/div_Redaction successful'), 0)

WebUI.click(findTestObject('Redaction/Close(Redaction Results Pop-Up)'))

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Task/Add New Task record/select_Status'), 'Complete', 
    false)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Person/Navigate to Person Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'Paul Tempest')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Research/Global Search/Navigate to Global Search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Core Functionality/Research/Global Search/input_searchTerm(GlobalSearch)'), 'Paul Tempest')

//uncomment after Rich's ES fix
WebUI.verifyElementNotPresent(findTestObject('Core Functionality/Research/Global Search/button_Go'), 2, FailureHandling.OPTIONAL)

WebUI.verifyElementNotPresent(findTestObject('Core Functionality/Research/Global Search/span_No results found(GS)'), 2, 
    FailureHandling.OPTIONAL)

WebUI.verifyElementNotPresent(findTestObject('Core Functionality/Research/Global Search/Label_event(GS)'), 10)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Event/Navigate to Event register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'Paul Tempest')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.verifyElementPresent(findTestObject('Register Search and Advanced Options/regsiterSearch(0 hits for search)'), 2)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'monstrous')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/Links/a_Add Event'), FailureHandling.STOP_ON_FAILURE)

/*def inputText = "Paul Tempest";
WebDriver driver = DriverFactory.getWebDriver()
WebElement myElement = driver.findElement(By.id("Title"));
JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
jsExecutor1.executeScript("arguments[0].value='inputText'");*/
WebUI.waitForElementClickable(findTestObject('General/Pop-Up/input_Subject(Select Event Pop-Up)'), 15)

WebUI.setText(findTestObject('General/Pop-Up/input_Subject(Select Event Pop-Up)'), 'Paul Tempest')

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.verifyElementPresent(findTestObject('General/Pop-Up/Page_Clue - Edit Address/Pop-Up Search (0 results)'), 5)

WebUI.waitForElementClickable(findTestObject('General/Pop-Up/input_Subject(Select Event Pop-Up)'), 15)

WebUI.setText(findTestObject('General/Pop-Up/input_Subject(Select Event Pop-Up)'), 'Paul Tempest')

WebUI.click(findTestObject('General/Pop-Up/GoBtn(Select Pop-Up)'))

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Tools/Task/Navigate to Task Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Register Search and Advanced Options/Select System View'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Search and Advanced Options/Enter Register Search Term/input_searchTerm'), 'Jim slang recovers the Mark\'s repeated performance in a cough')

WebUI.click(findTestObject('General/Run General Search (Press Go Button)/input_go'))

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)
