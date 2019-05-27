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

WebUI.callTestCase(findTestCase('Configuracion/3.Tipos de Accion/0.Ver'), [:])

WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/1.Crear/1.btn_Crear_ap'))

WebUI.setText(findTestObject('Configuracion/3.Tipos de Accion/1.Crear/2.input_Tipo_ap_action_typename'), 
    'Prueba de Testing')

WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/1.Crear/3.DesplegarSelect_ap'))

WebUI.delay(5)

WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/1.Crear/4.SeleccionarITemsLista_ap'))

WebUI.comment('Si se desea seleccionar mas de un elemento de lista se habilita las siguientes tres lineas')

//WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/1.Crear/3.DesplegarSelect_ap'))

//WebUI.delay(5)

//WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/1.Crear/SeleccionarItemLista'))

WebUI.setText(findTestObject('Configuracion/3.Tipos de Accion/1.Crear/5.textarea_Descripcin_ap_action_typenotes'), 
    'Estamos planteando una alternativa para pruebas.')

WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/1.Crear/6.btn_Guardar_ap'))

