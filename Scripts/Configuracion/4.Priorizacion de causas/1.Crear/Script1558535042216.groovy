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

WebUI.callTestCase(findTestCase('Configuracion/4.Priorizacion de causas/0.Ver'), [:])

WebUI.click(findTestObject('Configuracion/4.Priorizacion de Causas/1.Crear/1.btn_Crear_ap'))

WebUI.setText(findTestObject('Configuracion/4.Priorizacion de Causas/1.Crear/2.input_Prioridad_tq_cause_effectname'), 'Prueba')

WebUI.setText(findTestObject('Configuracion/4.Priorizacion de Causas/1.Crear/3.textarea_Descripcin_tq_cause_effectnotes'), 
    'Estamos creando algo bien tuty.')

WebUI.click(findTestObject('Configuracion/4.Priorizacion de Causas/1.Crear/4.btn_Guardar_ap'))

