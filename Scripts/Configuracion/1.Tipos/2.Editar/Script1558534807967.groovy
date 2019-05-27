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

WebUI.callTestCase(findTestCase('Configuracion/1.Tipos/0.Ver'), [:])

WebUI.delay(5)

WebUI.click(findTestObject('Configuracion/1.Tipos/2.Editar/1.inputCheck_Item_Selected'))

WebUI.click(findTestObject('Configuracion/1.Tipos/2.Editar/2.btn_Editar_PA'))

WebUI.setText(findTestObject('Configuracion/1.Tipos/2.Editar/3.input_Tipo_ap_typename'), 
    'Editando una prueba')

WebUI.selectOptionByValue(findTestObject('Configuracion/1.Tipos/2.Editar/4.select_TipoAnalisis_AP'), 
    '1', true)

WebUI.setText(findTestObject('Configuracion/1.Tipos/2.Editar/5.input_Planeacin_ap_typeplanning_days'), 
    '100')

WebUI.setText(findTestObject('Configuracion/1.Tipos/2.Editar/6.input_Aprobacin_ap_typeapproved_days'), 
    '30')

WebUI.setText(findTestObject('Configuracion/1.Tipos/2.Editar/7.input_Cierre_ap_typeclosure_days'), 
    '10')

WebUI.click(findTestObject('Configuracion/1.Tipos/2.Editar/8.inputCheck_Campos deshabilitados_ap_typedisabled_fields'))

WebUI.click(findTestObject('Configuracion/1.Tipos/2.Editar/9.inputCheck_Nombre_ap_typedisabled_fields'))

WebUI.setText(findTestObject('Configuracion/1.Tipos/2.Editar/10.textarea_Description'), 
    'Esto es una Edicion Secundaria de las pruebas funcionales de la app.')

WebUI.click(findTestObject('Configuracion/1.Tipos/2.Editar/11.btn_Editar_ap'))

