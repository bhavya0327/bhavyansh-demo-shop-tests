import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Vercel_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1440, 719)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-demo-shop.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on link browseAllTeas"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_home/link_browseAllTeas'))

"Step 3: Click on p teaDescription -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_home/p_teaDescription'))

"Step 4: Click on html shop"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_shop/html_shop'))

"Step 5: Click on button filterOptions (filterSpiced)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName, 'button_filterOptions_css_value_1': button_filterOptions_css_value]))

"Step 6: Click on header allTeas"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_shop/header_allTeas'))

"Step 7: Click on button addToCartItem (addToCartAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value]))

"Step 8: Click on button addToCartItem (addToCartDarjeelingFirstFlush)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_1, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_1]))

"Step 9: Click on button addToCartItem (addToCartSenchaGreen)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_2, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_2]))

"Step 10: Click on button addToCartItem (addToCart)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_3, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_3]))

"Step 11: Click on link cartOverview (cart) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cartOverview"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cartOverview', ['link_cartOverview_InternalRoleLinkName_1': link_cartOverview_InternalRoleLinkName, 'link_cartOverview_css_value_1': link_cartOverview_css_value]))

"Step 12: Click on button removeItem (removeJasminePearls)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/button_removeItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/button_removeItem', ['button_removeItem_DataTestid_1': button_removeItem_DataTestid, 'button_removeItem_css_value_1': button_removeItem_css_value]))

"Step 13: Click on button removeItem (removeAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/button_removeItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/button_removeItem', ['button_removeItem_DataTestid_1': button_removeItem_DataTestid_1, 'button_removeItem_css_value_1': button_removeItem_css_value_1]))

"Step 14: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 15: Click on input fullName"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'))

"Step 16: Enter input value in input fullName"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'), input_fullName)

"Step 17: Enter input value in input email"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'), input_email)

"Step 18: Enter input value in input email"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_email'), input_email_1)

"Step 19: Click on input streetAddress"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'))

"Step 20: Click on button placeOrder"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 21: Click on input city"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'))

"Step 22: Enter input value in input city"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'), input_city)

"Step 23: Press key Tab on input city"

WebUI.sendKeys(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'), Keys.chord(Keys.TAB))

"Step 24: Enter input value in input pinCode"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), input_pinCode)

"Step 25: Press key Tab on input pinCode"

WebUI.sendKeys(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), Keys.chord(Keys.TAB))

"Step 26: Enter input value in input cardNumber"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'), input_cardNumber)

"Step 27: Click on button placeOrder"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 28: Click on input pinCode"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'))

"Step 29: Enter input value in input pinCode"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), input_pinCode_1)

"Step 30: Click on input streetAddress"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'))

"Step 31: Enter input value in input streetAddress"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'), input_streetAddress)

"Step 32: Click on button placeOrder"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 33: Click on input streetAddress"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'))

"Step 34: Click on input streetAddress"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'))

"Step 35: Enter input value in input streetAddress"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'), input_streetAddress_1)

"Step 36: Click on main checkout"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/main_checkout'))

"Step 37: Click on button placeOrder -> Navigate to page '/confirmation'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/button_placeOrder'))

"Step 38: Click on link continueShopping -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_confirmation/link_continueShopping'))

"Step 39: Click on link logIn -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_shop/link_logIn'))

"Step 40: Login into Application"

TrueTestScripts.login()

"Step 41: Click on link leafAndKettle -> Navigate to page '/index'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_shop/link_leafAndKettle'))

"Step 42: Click on header looseLeafTea"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/header_looseLeafTea'))

"Step 43: Click on span userGreeting"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Page_index/span_userGreeting"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/span_userGreeting', ['span_userGreeting_nameRedacted': span_userGreeting_nameRedacted]))

"Step 44: Click on button addToCartSenchaGreen"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/button_addToCartSenchaGreen'))

"Step 45: Click on link browseAllTeas -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_index/link_browseAllTeas'))

"Step 46: Click on button filterOptions (filterSpiced)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_1, 'button_filterOptions_css_value_1': button_filterOptions_css_value_1]))

"Step 47: Click on button filterOptions (filterHerbal)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_2, 'button_filterOptions_css_value_1': button_filterOptions_css_value_2]))

"Step 48: Click on link cartOverview (cart1) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cartOverview"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cartOverview', ['link_cartOverview_InternalRoleLinkName_1': link_cartOverview_InternalRoleLinkName_1, 'link_cartOverview_css_value_1': link_cartOverview_css_value_1]))

"Step 49: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 50: Click on link shop -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/link_shop'))

"Step 51: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Complete Order Process with Multiple Items in Tea Shop_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}