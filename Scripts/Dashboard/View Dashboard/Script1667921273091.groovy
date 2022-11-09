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

WebUI.verifyElementPresent(findTestObject('Dashboard/div_Ringkasan Penjualans'), 0)

WebUI.verifyElementText(findTestObject('Dashboard/div_Ringkasan Penjualan'), 'Ringkasan Penjualan')

WebUI.verifyElementText(findTestObject('Dashboard/div_Metode Pembayaran'), 'Metode Pembayaran')

WebUI.verifyElementPresent(findTestObject('Dashboard/div_Transaksi TerbaruBelum ada transaksi terbaru'), 0)

WebUI.verifyElementText(findTestObject('Dashboard/h3_Transaksi Terbaru'), 'Transaksi Terbaru')

WebUI.verifyElementPresent(findTestObject('Dashboard/div_10 Produk TerlarisProduk terlaris kamu masih kosongTambahkan produk tokomu ke Aplikasi Dagang atau Tablet Youtap untuk menikmati fitur ini'), 
    0)

WebUI.verifyElementText(findTestObject('Dashboard/h3_10 Produk Terlaris'), '10 Produk Terlaris')

WebUI.verifyElementPresent(findTestObject('Dashboard/div_Kejar Target'), 0)

WebUI.verifyElementText(findTestObject('Dashboard/h3_Kejar Target'), 'Kejar Target')

WebUI.verifyElementPresent(findTestObject('Dashboard/div_Grafik Penjualan'), 0)

WebUI.verifyElementText(findTestObject('Dashboard/h3_Grafik Penjualan'), 'Grafik Penjualan')

