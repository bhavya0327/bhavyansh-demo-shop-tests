import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Vercel_QA.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1891, 810)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://bhavyansh-demo-shop.vercel.app/policy-search.html"

TrueTestScripts.navigate("/policy-search.html")

"Step 2: Click on input object (policyNumber)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel, 'input_object_css_value_1': input_object_css_value]))

"Step 3: Enter input value in input object (policyNumber2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object"
TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel_1, 'input_object_css_value_1': input_object_css_value_1]), input_object)

"Step 4: Click on button object (search)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/button_object"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/button_object', ['button_object_InternalRoleButtonName_1': button_object_InternalRoleButtonName, 'button_object_css_value_1': button_object_css_value]))

"Step 5: Double-click on td policyNumber"

WebUI.doubleClick(findTestObject('AI-Generated/Vercel QA/Page_policy_search/td_policyNumber'))

"Step 6: Click on input object (firstName)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel_2, 'input_object_css_value_1': input_object_css_value_2]))

"Step 7: Enter input value in input object (firstName2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object"
TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel_3, 'input_object_css_value_1': input_object_css_value_3]), input_object_1)

"Step 8: Click on input object (birthDate)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel_4, 'input_object_css_value_1': input_object_css_value_4]))

"Step 9: Enter input value in input object (birthDate2)"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object"
TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/input_object', ['input_object_InternalLabel_1': input_object_InternalLabel_5, 'input_object_css_value_1': input_object_css_value_5]), input_object_2)

"Step 10: Click on button object (saveApplication) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/button_object"
TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Dynamic Objects/Page_policy_search/button_object', ['button_object_InternalRoleButtonName_1': button_object_InternalRoleButtonName_1, 'button_object_css_value_1': button_object_css_value_1]))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Search for a policy and open its details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}