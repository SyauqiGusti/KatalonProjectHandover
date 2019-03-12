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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.123.2.46:9001/')

WebUI.setText(findTestObject('TC8/Page_Hand Over/input_Log in_userNameOrEmailAd'), 'admhelmi')

WebUI.setEncryptedText(findTestObject('TC8/Page_Hand Over/input_Log in_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('TC8/Page_Hand Over/button_Log in'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/span_Report'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/span_Report HandOver Schedule'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/input_Period_periodDate'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/th_'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/td_1'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/input_Period_periodDateEnd'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/td_28'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/span_Nothing Selected'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/span_Not Confirm'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('TC8/Page_Hand Over/select_Nothing Selected'), '0', true)

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/span_Choose Print On'))

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/span_Screen'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('TC8/Page_Hand Over/select_Choose Print On'), '1', true)

WebUI.delay(3)

WebUI.click(findTestObject('TC8/Page_Hand Over/span_Save'))

WebUI.delay(5)

WebUI.closeBrowser()

