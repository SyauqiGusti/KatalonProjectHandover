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

WebUI.setText(findTestObject('Object Repository/TC9-3/Page_Hand Over/input_Log in_userNameOrEmailAd'), 'admhelmi')

WebUI.setEncryptedText(findTestObject('Object Repository/TC9-3/Page_Hand Over/input_Log in_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.sendKeys(findTestObject('Object Repository/TC9-3/Page_Hand Over/input_Log in_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/TC9-3/Page_Hand Over/span_Report'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/TC9-3/Page_Hand Over/span_Unattended Customer'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/TC9-3/Page_Hand Over/span_Nothing Selected'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/TC9-3/Page_Hand Over/span_Not Confirm'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC9-3/Page_Hand Over/select_Nothing Selected'), '0', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/TC9-3/Page_Hand Over/span_Choose Print On'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/TC9-3/Page_Hand Over/span_Excel'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC9-3/Page_Hand Over/select_Choose Print On'), '2', true)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/TC9-3/Page_Hand Over/span_Save'))

WebUI.delay(3)

WebUI.closeBrowser()

