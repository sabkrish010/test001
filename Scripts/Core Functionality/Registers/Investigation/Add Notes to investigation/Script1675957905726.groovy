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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.click(findTestObject('Core Functionality/Registers/Investigation/Add Notes/a_Add Note'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Investigation/Add Notes/EnteredBy (AddNotes Inv)'), 
    2)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Reference(Inv.Notes)'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase())

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Registers/Investigation/Add Notes/select_Type(Add Notes Inv)'), 
    1)

WebUI.setText(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/Details(Inv.Notes)'), RandomStringUtils.randomAlphanumeric(
        10).toUpperCase())

WebUI.delay(5)

WebUI.click(findTestObject('Core Functionality/Registers/Incident/Investigator Notes/button_Add'))

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

