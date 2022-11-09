import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Login-2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Alamat/div_belanja stok'))

WebUI.click(findTestObject('Alamat/Alamat'))

WebUI.click(findTestObject('Alamat/Tambah Alamat'))

WebUI.setText(findTestObject('Object Repository/Alamat/input_Label Alamat_addressLabel'), 'Alamat Rumah')

WebUI.setText(findTestObject('Object Repository/Alamat/input_Nama Penerima_consignee'), 'Fadhil')

WebUI.setText(findTestObject('Object Repository/Alamat/input_Nomer HpTelepon_phone'), '082283575484')

WebUI.setText(findTestObject('Object Repository/Alamat/textarea_D'), 'Duri')

WebUI.dragAndDropByOffset(findTestObject('Alamat/textarea_D'), 0, 0)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

WebUI.click(findTestObject('Object Repository/Alamat/div_Select'))

WebUI.setText(findTestObject('Object Repository/Alamat/input_Provinsi_react-select-2-input'), 'Riau')

WebUI.click(findTestObject('Object Repository/Alamat/div_RIAU'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Object Repository/Alamat/div_Select_css-ackcql'))

WebUI.setText(findTestObject('Object Repository/Alamat/input_Kota atau Kabupaten_react-select-6-input'), 'Bengka')

WebUI.click(findTestObject('Object Repository/Alamat/div_BENGKALIS'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(0.5)

WebUI.click(findTestObject('Alamat/div_Select_css-ackcql - Copy'))

WebUI.click(findTestObject('Object Repository/Alamat/div_PINGGIR'))

WebUI.delay(0.5)

WebUI.click(findTestObject('Alamat/div_Select_css-ackcql - Copy - Copy'))

WebUI.setText(findTestObject('Object Repository/Alamat/input_Kelurahan_react-select-8-input'), 'Balai')

WebUI.click(findTestObject('Object Repository/Alamat/div_BALAI RAJA'))

WebUI.setText(findTestObject('Object Repository/Alamat/input_Email_email_1'), 'fadsyahad@gmail.com')

WebUI.setText(findTestObject('Object Repository/Alamat/input_Kode Pos_postalCode'), '28784')

WebUI.click(findTestObject('Object Repository/Alamat/div_Pilih Lokasi'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Alamat/button_Tambah Alamat'))

WebUI.delay(1)

WebUI.click(findTestObject('Alamat/button_Tambah Alamat - Copy'))

