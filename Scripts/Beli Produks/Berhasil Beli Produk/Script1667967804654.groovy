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

WebUI.setText(findTestObject('Object Repository/Page_Portal Usaha Youtap/input_Menu Lain_SCMSearchHeader_inputSearch__2bpsH'), 
    'Aqua')

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_AquaAqua Botol 24x600mlRp 51.0003000g'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/i_Rp51.000_changeValue rs-icon rs-icon-plus_328534'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/i_Rp51.000_changeValue rs-icon rs-icon-plus_328534'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_Tambah ke Keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/a_Lihat Keranjang'))

WebUI.click(findTestObject('Page_Portal Usaha Youtap/Kurir'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/li_Kurir Toko'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_Beri catatan untuk pesanan ini'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/span_Beri catatan untuk pesanan ini'))

WebUI.setText(findTestObject('Object Repository/Page_Portal Usaha Youtap/textarea_S'), 'Semangat')

String price = WebUI.getText(findTestObject('Object Repository/Page_Portal Usaha Youtap/span_Rp 153.000'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_Bayar'))

String price2 = WebUI.getText(findTestObject('Page_Portal Usaha Youtap/span_Rp 153.000 - Copy'))

WebUI.verifyMatch(price, price2, false)

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_Bayar'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/div_BCA Virtual Account'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/span_Virtual Account'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/span_Cek Status Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/span_Pembayaran belum berhasil'))

WebUI.click(findTestObject('Object Repository/Page_Portal Usaha Youtap/i_Virtual Account_btnClose rs-icon rs-icon-_a1401e'))

WebUI.closeBrowser()

