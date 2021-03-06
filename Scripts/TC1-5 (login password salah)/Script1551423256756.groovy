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

WebUI.navigateToUrl('http://10.123.2.46:9001/account/login')

WebUI.setText(findTestObject('Object Repository/TC1-5/Page_Hand Over/input_Log in_userNameOrEmailAd'), 'admin')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/TC1-5/Page_Hand Over/input_Log in_password'), 'O1wP2UrxOXk=')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/TC1-5/Page_Hand Over/button_Log in'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/TC1-5/Page_Hand Over/button_OK'))

WebUI.delay(1)

WebUI.closeBrowser()

