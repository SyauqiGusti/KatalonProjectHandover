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

WebUI.setText(findTestObject('Object Repository/TC3-2/Page_Hand Over/input_Log in_userNameOrEmailAd'), 'admhelmi')

WebUI.setEncryptedText(findTestObject('Object Repository/TC3-2/Page_Hand Over/input_Log in_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/TC3-2/Page_Hand Over/button_Log in'))

WebUI.click(findTestObject('Object Repository/TC3-2/Page_Hand Over/span_Master'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/TC3-2/Page_Hand Over/span_Master Mapping'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/TC3-2/Page_Hand Over/a_14'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/TC3-2/Page_Hand Over/div_Select Time Period _ui-chk'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/TC3-2/Page_Hand Over/div_Siang_ui-chkbox-box ui-wid'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/TC3-2/Page_Hand Over/input_Sore_quota'), '3')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/TC3-2/Page_Hand Over/span_Save'))

WebUI.click(findTestObject('Object Repository/TC3-2/Page_Hand Over/button_OK'))

WebUI.closeBrowser()

