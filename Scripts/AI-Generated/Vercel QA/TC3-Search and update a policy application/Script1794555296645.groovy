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

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_policyNumber'))

"Step 3: Enter input value in input policyNumber2"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_policyNumber2'), input_policyNumber2)

"Step 4: Click on button search"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/button_search'))

"Step 5: Click on td policyNumberLsSixTwoTwoThreeEightFourNineTwoSix"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/td_policyNumberLsSixTwoTwoThreeEightFourNineTwoSix'))

"Step 6: Double-click on td policyNumberLsSixTwoTwoThreeEightFourNineTwoSix"

WebUI.doubleClick(findTestObject('AI-Generated/Vercel QA/Page_policy_search/td_policyNumberLsSixTwoTwoThreeEightFourNineTwoSix'))

"Step 7: Click on input firstName"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_firstName'))

"Step 8: Enter input value in input firstName2"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_firstName2'), input_firstName2)

"Step 9: Click on input birthDate"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_birthDate'))

"Step 10: Enter input value in input birthDate2"

TrueTestScripts.setText(findTestObject('AI-Generated/Vercel QA/Page_policy_search/input_birthDate'), input_birthDate2)

"Step 11: Click on button saveApplication -> Navigate to page ''"

TrueTestScripts.click(findTestObject('AI-Generated/Vercel QA/Page_policy_search/button_saveApplication'))

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Search and update a policy application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}