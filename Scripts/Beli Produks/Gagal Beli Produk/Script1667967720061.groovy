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

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/a_Belanja Stok'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_Aneka Minuman'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_CRYSTALLINE 330ML330MLRp 2.4003300g'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_Tambah ke Keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/a_Lihat Keranjang'))

WebUI.click(findTestObject('Page_Portal Usaha Youtap/Kurir'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/li_Kurir Toko'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/span_Beri catatan untuk pesanan ini'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_'))

WebUI.setText(findTestObject('Object Repository/Page_Portal Usaha Youtap/textarea_S'), 'Semangat')

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_CRYSTALLINE 330ML - 330ML_delete-button'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_Kembali ke Home'))

