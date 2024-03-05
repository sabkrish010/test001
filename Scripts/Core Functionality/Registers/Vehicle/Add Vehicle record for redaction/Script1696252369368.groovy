import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('General/Log On'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Vehicle/Navigate to Vehicle Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Core Functionality/Registers/Vehicle/Select Add Vehicle (Standard Mode)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/select_SecurityClassification'), 
    'Official Sensitive', true, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/select_RecordType'), 'Motor Vehicle', 
    true)

WebUI.setText(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/input_Reference'), 'Mattheus')

WebUI.setText(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/input_Registration'), 'P262 DJO')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/select_VehicleClass'), 'Hatchback', 
    true)

WebUI.setText(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/input_Make'), 'Volkswagon')

WebUI.setText(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/input_Model'), 'Golf GTi')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/select_Colour'), 'Blue', true)

WebUI.setText(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/textarea_FurtherDetails'), 'Alloy Wheels, tinted windows')

WebUI.setText(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/input_Reason'), 'Pulled over as part of stop and search operation')

WebUI.setText(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/input_Source'), 'DC Meadows')

WebUI.setText(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/textarea_Notes'), 'Strackley\'s vehicle contained the driver who was carrying a monstrous firearm')

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/select_ReviewAfter'), '3 Months', 
    true)

'Expand Record Properties - Disabled until we add an ID to Record Properties Expand.'
WebUI.click(findTestObject('Core Functionality/Shared Record Functions/RecordPropertiesExpand'), FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/recordPropertiesCollapse'), 1, 
    FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('Core Functionality/Shared Record Functions/select_OwnerTeam'), 2, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/select_RecordStatus'), 'Active', 
    true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Core Functionality/Registers/Vehicle/Add Vehicle/input_save'))

WebUI.waitForElementClickable(findTestObject('Core Functionality/Shared Record Functions/input_edit'), 5)

WebUI.verifyElementVisible(findTestObject('Core Functionality/Registers/Vehicle/Vehicle Details/h2_Vehicle Details'), FailureHandling.STOP_ON_FAILURE)

