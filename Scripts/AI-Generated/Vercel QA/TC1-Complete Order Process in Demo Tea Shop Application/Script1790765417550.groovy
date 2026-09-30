import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Vercel_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1440, 670)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-demo-shop.vercel.app/shop.html"

TrueTestScripts.navigate("/shop.html")

"Step 2: Click on link cart2 -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cartOverview"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cartOverview', ['link_cartOverview_InternalRoleLinkName_1': link_cartOverview_InternalRoleLinkName, 'link_cartOverview_css_value_1': link_cartOverview_css_value]))

"Step 3: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 4: Click on input fullName"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'))

"Step 5: Click on input fullName"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'))

"Step 6: Enter input value in input fullName"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'), input_fullName)

"Step 7: Click on input email"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'))

"Step 8: Enter input value in input email"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'), input_email)

"Step 9: Press key Tab on input email"

WebUI.sendKeys(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'), Keys.chord(Keys.TAB))

"Step 10: Enter input value in input streetAddress"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'), input_streetAddress)

"Step 11: Click on input city"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'))

"Step 12: Enter input value in input city"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'), input_city)

"Step 13: Press key Tab on input city"

WebUI.sendKeys(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'), Keys.chord(Keys.TAB))

"Step 14: Enter input value in input pinCode"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), input_pinCode)

"Step 15: Click on input cardNumber"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'))

"Step 16: Click on button placeOrder"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 17: Click on input cardNumber"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'))

"Step 18: Click on button placeOrder"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 19: Double-click on input cardNumber"

WebUI.doubleClick(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'))

"Step 20: Click on button placeOrder"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 21: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/link_shop'))

"Step 22: Click on button filterType (filterSpiced)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName, 'button_filterOptions_css_value_1': button_filterOptions_css_value]))

"Step 23: Click on button filterType (filterHerbal) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_1, 'button_filterOptions_css_value_1': button_filterOptions_css_value_1]))

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Order Process in Demo Tea Shop Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}