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

"Step 2: Click on input policyNumber"

// TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_policyNumber_1'))

"Step 3: Enter input value in input policyNumber"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_policyNumber_1'), input_policyNumber)

"Step 4: Click on button search"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/button_search'))

"Step 5: Double-click on td object"

// Bind values to the variables in the locators of "AI-Generated/Vercel QA/Page_policy_search/td_object"
WebUI.doubleClick(findTestObject('AI-Generated/Vercel QA/Page_policy_search/td_object', ['td_object_passwordRedacted': td_object_passwordRedacted]))

"Step 6: Click on input firstName"

// TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_firstName_1'))

"Step 7: Enter input value in input firstName"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_firstName_1'), input_firstName)

"Step 8: Click on input birthDate"

// TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_birthDate'))

"Step 9: Enter input value in input birthDate"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_birthDate'), input_birthDate)

"Step 10: Click on button saveApplication"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/button_saveApplication'))

"Step 11: Click on button search2"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/button_search2'))

"Step 12: Click on button application"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/button_application'))

"Step 13: Click on button search2"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/button_search2'))

"Step 14: Click on input policyNumber"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_policyNumber_1'))

"Step 15: Click on button application"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/button_application'))

"Step 16: Click on input firstName -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_firstName_1'))

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Search policy and enter applicant details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}