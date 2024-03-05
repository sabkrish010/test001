import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Core Functionality/Research/Global Search/a_Try our new search'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Research/Global Search/a_Use classic search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(3, FailureHandling.OPTIONAL)

WebUI.verifyElementNotPresent(findTestObject('Core Functionality/Research/Global Search/a_Use classic search'), 1)

WebUI.click(findTestObject('Core Functionality/Research/Global Search/a_Try our new search'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Research/Global Search/input_SearchBox'), 5)

