import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Vercel_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(402, 790)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-demo-shop.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on link browseAllTeas -> Navigate to page '/shop'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_home/link_browseAllTeas_1'))

"Step 3: Click on button filterOptions (filterGreen)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName, 'button_filterOptions_css_value_1': button_filterOptions_css_value]))

"Step 4: Click on button addToCartItem (addToCartSenchaGreen2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value]))

"Step 5: Click on button filterOptions (filterSpiced)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_1, 'button_filterOptions_css_value_1': button_filterOptions_css_value_1]))

"Step 6: Click on button addToCartItem (addToCartMasalaChai)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_1, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_1]))

"Step 7: Click on button filterOptions (filterAll)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_2, 'button_filterOptions_css_value_1': button_filterOptions_css_value_2]))

"Step 8: Click on button addToCartItem (addToCartAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_2, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_2]))

"Step 9: Click on button filterOptions (filterHerbal)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_3, 'button_filterOptions_css_value_1': button_filterOptions_css_value_3]))

"Step 10: Click on button addToCartItem (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_3, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_3]))

"Step 11: Click on button filterOptions (filterBlack)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_4, 'button_filterOptions_css_value_1': button_filterOptions_css_value_4]))

"Step 12: Click on button addToCartItem (addToCartAssamMorning) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_4, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_4]))

"Step 13: Login into Application"

TrueTestScripts.login()

"Step 14: Click on button addToCartItem (addToCartAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_5, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_5]))

"Step 15: Click on button filterOptions (filterBlack)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_5, 'button_filterOptions_css_value_1': button_filterOptions_css_value_5]))

"Step 16: Click on button addToCartItem (addToCartAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_6, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_6]))

"Step 17: Click on button filterOptions (filterGreen)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_6, 'button_filterOptions_css_value_1': button_filterOptions_css_value_6]))

"Step 18: Click on button addToCartItem (addToCartSenchaGreen2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_7, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_7]))

"Step 19: Click on button filterOptions (filterSpiced)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_7, 'button_filterOptions_css_value_1': button_filterOptions_css_value_7]))

"Step 20: Click on button addToCartItem (addToCartMasalaChai)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_8, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_8]))

"Step 21: Click on button filterOptions (filterHerbal)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_filterOptions', ['button_filterOptions_InternalRoleButtonName_1': button_filterOptions_InternalRoleButtonName_8, 'button_filterOptions_css_value_1': button_filterOptions_css_value_8]))

"Step 22: Click on button addToCartItem (addToCart3)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/button_addToCartItem', ['button_addToCartItem_DataTestid_1': button_addToCartItem_DataTestid_9, 'button_addToCartItem_css_value_1': button_addToCartItem_css_value_9]))

"Step 23: Click on link cartOverview (cart2) -> Navigate to page '/cart'"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cartOverview"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_shop/link_cartOverview', ['link_cartOverview_InternalRoleLinkName_1': link_cartOverview_InternalRoleLinkName, 'link_cartOverview_css_value_1': link_cartOverview_css_value]))

"Step 24: Click on input quantitySelection (quantitySenchaGreen)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value]))

"Step 25: Enter input value in input quantitySelection (quantitySenchaGreen)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_1, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_1, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_1]), input_quantitySelection)

"Step 26: Click on input quantitySelection (quantityMasalaChai)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_2, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_2, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_2]))

"Step 27: Click on input quantitySelection (quantityMasalaChai2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_3, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_3, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_3]))

"Step 28: Enter input value in input quantitySelection (quantityMasalaChai2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_4, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_4, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_4]), input_quantitySelection_1)

"Step 29: Click on input quantitySelection (quantityAssamMorning)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_5, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_5, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_5]))

"Step 30: Click on input quantitySelection (quantityAssamMorning2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_6, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_6, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_6]))

"Step 31: Enter input value in input quantitySelection (quantityAssamMorning2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_7, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_7, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_7]), input_quantitySelection_2)

"Step 32: Click on input quantitySelection (quantityTulsiGinger)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_8, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_8, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_8]))

"Step 33: Click on input quantitySelection (quantityTulsiGinger2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_9, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_9, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_9]))

"Step 34: Enter input value in input quantitySelection (quantityTulsiGinger2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection"
TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_cart/input_quantitySelection', ['input_quantitySelection_CartRowSenchaGreen_1': input_quantitySelection_CartRowSenchaGreen_10, 'input_quantitySelection_DataTestid_1': input_quantitySelection_DataTestid_10, 'input_quantitySelection_css_value_1': input_quantitySelection_css_value_10]), input_quantitySelection_3)

"Step 35: Click on link goToCheckout -> Navigate to page '/checkout'"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_cart/link_goToCheckout'))

"Step 36: Click on input fullName2"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'))

"Step 37: Enter input value in input fullName2"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_fullName'), input_fullName2)

"Step 38: Click on input streetAddress2"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'))

"Step 39: Enter input value in input streetAddress2"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_streetAddress'), input_streetAddress2)

"Step 40: Enter input value in input city2"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_city'), input_city2)

"Step 41: Enter input value in input pinCode2"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_pinCode'), input_pinCode2)

"Step 42: Click on input cardNumber2 -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_checkout/input_cardNumber'))

"Step 43: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Add and Checkout Multiple Tea Items with User Login_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}