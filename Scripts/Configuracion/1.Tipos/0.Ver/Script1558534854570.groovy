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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.210.132.114/app.php/staff/')

WebUI.callTestCase(findTestCase('General Daruma/Login'), [:])

WebUI.click(findTestObject('Configuracion/1.Tipos/0.Ver/1.btn_AbrirModulos'))

WebUI.click(findTestObject('Configuracion/1.Tipos/0.Ver/2.a_Planes de accion'))

WebUI.click(findTestObject('Configuracion/1.Tipos/0.Ver/3.span_AbrirConfiguracion'))

WebUI.delay(5)

WebUI.click(findTestObject('Configuracion/1.Tipos/0.Ver/4.span_Tipos'))

