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

WebUI.navigateToUrl('http://34.210.132.114/app.php/staff/actionplan')

WebUI.delay(5)

WebUI.comment('Los dos siguientes lineas de codigo estan haciendo la accion de entrar al submodulo...')

WebUI.click(findTestObject('Configuracion/1.Tipos/1.Crear/1.span_AbrirConfiguracion'))

WebUI.click(findTestObject('Configuracion/1.Tipos/1.Crear/2.span_Abrir_Tipos'))

WebUI.comment('Aqui empieza a gestionarse el formulario del submodulo...')

WebUI.delay(5)

WebUI.click(findTestObject('Configuracion/1.Tipos/1.Crear/3.btn_Crear_Tipo'))

WebUI.setText(findTestObject('Configuracion/1.Tipos/1.Crear/4.input_Tipo_ap_typename'), 
    'Prueba Calidad')

WebUI.setText(findTestObject('Configuracion/1.Tipos/1.Crear/5.input_Planeacion_ap_typeplanning_days'), 
    '50')

WebUI.setText(findTestObject('Configuracion/1.Tipos/1.Crear/6.input_Aprobacion_ap_typeapproved_days'), 
    '15')

WebUI.setText(findTestObject('Configuracion/1.Tipos/1.Crear/7.input_Cierre_ap_typeclosure_days'), 
    '5')

WebUI.click(findTestObject('Configuracion/1.Tipos/1.Crear/8.inputCheck_Notificacion automtica_ap_typeauto_notify'))

WebUI.click(findTestObject('Configuracion/1.Tipos/1.Crear/9.inputCheck_Firmas de aprobacin_ap_typeall_signatures'))

WebUI.click(findTestObject('Configuracion/1.Tipos/1.Crear/10.inputCheck_Avance manual_ap_typemanual_advance'))

WebUI.setText(findTestObject('Configuracion/1.Tipos/1.Crear/11.textarea_Descripcin_ap_typenotes'), 
    'Esto es una prueba inicial de las pruebas funcionales de la aplicacion.')

WebUI.click(findTestObject('Configuracion/1.Tipos/1.Crear/12.btn_Guardar_Tipo'))

