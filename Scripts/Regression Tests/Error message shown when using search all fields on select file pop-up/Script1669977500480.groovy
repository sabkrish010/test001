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

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Incident/Navigate to Incident Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Select a record from view'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core Functionality/Registers/File/a_Add File'))

WebUI.setText(findTestObject('Core Functionality/Registers/File/input_URN'), '23')

WebUI.click(findTestObject('Core Functionality/Registers/File/input_go'))

WebUI.clearText(findTestObject('Core Functionality/Registers/File/input_URN'))

WebUI.setText(findTestObject('Core Functionality/Registers/File/input_Title'), 'ChristianH')

WebUI.click(findTestObject('Core Functionality/Registers/File/input_go'))

WebUI.clearText(findTestObject('Core Functionality/Registers/File/input_Title'))

WebUI.setText(findTestObject('Core Functionality/Registers/File/input_Search All Fields'), 'ChristianH')

WebUI.click(findTestObject('Core Functionality/Registers/File/input_go'))

WebUI.clearText(findTestObject('Core Functionality/Registers/File/input_Search All Fields'))

WebUI.setText(findTestObject('Core Functionality/Registers/File/input_Title'), 'ChristianH')

WebUI.setText(findTestObject('Core Functionality/Registers/File/input_Search All Fields'), 'ChristianH')

WebUI.click(findTestObject('Core Functionality/Registers/File/input_go'))

WebUI.delay(5)

WebUI.verifyTextPresent('records', false, FailureHandling.OPTIONAL)
