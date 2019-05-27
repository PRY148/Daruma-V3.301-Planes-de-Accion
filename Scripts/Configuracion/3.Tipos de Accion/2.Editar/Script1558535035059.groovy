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

WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/2.Editar/1.inputCheck_Item_ap'))

WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/2.Editar/2.btn_Editar_ap'))

WebUI.setText(findTestObject('Configuracion/3.Tipos de Accion/2.Editar/3.input_Tipo_ap_action_typename'), 
    'Editando ando')

WebUI.comment('Este Test Case tiene la particularidad de que elimina dos registros de los campos en vez de añadirlos, si se desea lo contrario se toma el ejemplo de la creacion')

WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/2.Editar/4.Eliminar_Item_Lista_ap'))

WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/2.Editar/5.Eliminar_Item_Lista2_ap'))

WebUI.setText(findTestObject('Configuracion/3.Tipos de Accion/2.Editar/6.textarea_Description_ap'), 
    'Estamos Editando una alternativa para pruebas.')

WebUI.click(findTestObject('Configuracion/3.Tipos de Accion/2.Editar/7.btn_Guardar_ap'))

