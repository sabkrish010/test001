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

WebUI.callTestCase(findTestCase('General/Switch to Standard mode improvised'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Navigate to Address Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Select Add Address (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Address/Add Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/File/Upload file'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.refresh()

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('Core Functionality/Registers/File/a_Preview Button'))

WebUI.enhancedClick(findTestObject('Object Repository/Core Functionality/Registers/File/Preview Modal/span_File Preview'))

WebUI.verifyElementNotVisibleInViewport(findTestObject('Core Functionality/Registers/File/Preview Modal/button__next'), 
    3)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/a_Properties'))

WebUI.verifyElementNotVisibleInViewport(findTestObject('Core Functionality/Registers/File/Preview Modal/button__previous'), 
    3)

WebUI.click(findTestObject('Core Functionality/Registers/File/Preview Modal/span_Close(Preview Modal)'))

WebUI.callTestCase(findTestCase('General/Edit the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/File/Remove a file link'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Save the record'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('General/Delete Record'), [:], FailureHandling.STOP_ON_FAILURE)

